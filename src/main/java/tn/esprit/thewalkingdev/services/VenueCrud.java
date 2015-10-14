package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Venue;
import tn.esprit.thewalkingdev.services.contract.VenueLocal;
import tn.esprit.thewalkingdev.services.contract.VenueRemote;

/**
 * Session Bean implementation class GestionVenue
 */
@Stateless
public class VenueCrud implements VenueRemote, VenueLocal {

	@PersistenceContext(unitName="vgta")
    EntityManager entityManager;
    public VenueCrud() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addVenue(Venue venue) {

			entityManager.persist(venue);
			return true;
	}

	@Override
	public Boolean updateVenue(Venue venue) {

			entityManager.merge(venue);
			return true;

	}

	@Override
	public Boolean deleteVenue(Venue venue) {
	
			entityManager.remove(venue);
			return true;

	}

	@Override
	public Venue findVenueById(Integer idVenue) {
		Venue venue=null;

			venue=entityManager.find(Venue.class,idVenue);
	
		return venue;
	}

	@Override
	public List<Venue> findAllVenue() {
		javax.persistence.Query query=entityManager.createQuery("select v from Venue v");
		return query.getResultList();
	}

	@Override
	public List<String> findAllLabelVenue() {
		javax.persistence.Query query = entityManager.createQuery("select label from venue v");
		
		return query.getResultList();
	}

}
