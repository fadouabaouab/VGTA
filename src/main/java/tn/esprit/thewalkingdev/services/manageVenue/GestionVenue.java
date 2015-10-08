package tn.esprit.thewalkingdev.services.manageVenue;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.TypeEvent;
import tn.esprit.thewalkingdev.entites.Venue;
import tn.esprit.thewalkingdev.manageVenue.contract.GestionVenueLocal;
import tn.esprit.thewalkingdev.manageVenue.contract.GestionVenueRemote;

/**
 * Session Bean implementation class GestionVenue
 */
@Stateless
public class GestionVenue implements GestionVenueRemote, GestionVenueLocal {

	@PersistenceContext(unitName="vgta")
    EntityManager entityManager;
    public GestionVenue() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addVenue(Venue venue) {
		try {
			entityManager.persist(venue);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateVenue(Venue venue) {
		try {
			entityManager.merge(venue);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteVenue(Venue venue) {
		try {
			entityManager.remove(venue);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Venue findVenueById(Integer idVenue) {
		Venue venue=null;
		try {
			venue=entityManager.find(Venue.class,idVenue);
			
		} catch (Exception e) {
			
		}
		return venue;
	}

	@Override
	public List<Venue> findAllVenue() {
		javax.persistence.Query query=entityManager.createQuery("select v from Venue v");
		return query.getResultList();
	}

}
