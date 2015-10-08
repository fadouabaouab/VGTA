package tn.esprit.thewalkingdev.services.gestionSponsor;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import tn.esprit.thewalkingdev.entites.Sponsor;

/**
 * Session Bean implementation class GestionSponsors
 */
@Stateless
public class GestionSponsors implements GestionSponsorsRemote, GestionSponsorsLocal {
	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public GestionSponsors() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSponsor(Sponsor sponsor) {
try {
			
			entityManager.persist(sponsor);
			return true;
			
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}		}

	@Override
	public Boolean updateSponsor(Sponsor sponsor) {
		try {
			entityManager.merge(sponsor);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteSponsor(Sponsor sponsor) {
		try {
			entityManager.remove(entityManager.merge(sponsor));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Sponsor findSponsorById(int idsponsor) {
		Sponsor sponsor =null;
		try {
			sponsor=entityManager.find(Sponsor.class,idsponsor);


		} catch (Exception e) {
			return null;
		}	
		return sponsor;	}

	@Override
	public List<Sponsor> findAllSponsor() {
		List<Sponsor> listSponsor;
		Query query=entityManager.createNamedQuery("select a from Sponsor");
		return query.getResultList();}

}
