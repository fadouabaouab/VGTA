package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Sponsor;
import tn.esprit.thewalkingdev.services.contract.SponsorLocal;
import tn.esprit.thewalkingdev.services.contract.SponsorRemote;

@Stateless
public class SponsorCrud implements SponsorLocal,SponsorRemote{
	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;


	@Override
	public Boolean addSponsor(Sponsor sponsor) {
		entityManager.persist(sponsor);
		return true;
	}

	@Override
	public Boolean updateSponsor(Sponsor sponsor) {
		entityManager.merge(sponsor);
		return true;
	}

	@Override
	public Boolean deleteSponsor(Sponsor sponsor) {
		entityManager.remove(entityManager.merge(sponsor));
		return true;
	}

	@Override
	public Sponsor findSponsorById(Integer idSponsor) {
		Sponsor sponsor =null;
	
			sponsor=entityManager.find(Sponsor.class,idSponsor);


		return sponsor;	
	}

	@Override
	public List<Sponsor> findAllSponsors() {
		List<Sponsor> listSponsor;
		Query query=entityManager.createNamedQuery("select a from Sponsor");
		return query.getResultList();
	}

}
