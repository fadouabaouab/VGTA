package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Gamer;
import tn.esprit.thewalkingdev.services.contract.GamerLocal;
import tn.esprit.thewalkingdev.services.contract.GamerRemote;

/**
 * Session Bean implementation class GestionGamer
 */
@Stateless
public class GamerCrud implements GamerRemote, GamerLocal {
	@PersistenceContext(unitName = "vgta")
	EntityManager entityManager;

	public GamerCrud() {
	}

	@Override
	public Boolean addGamer(Gamer gamer) {
		
			entityManager.persist(gamer);
			return true;

	}

	@Override
	public Boolean updateGamer(Gamer gamer) {
	
			entityManager.merge(gamer);
			return true;

	}

	@Override
	public Boolean deleteGamer(Gamer gamer) {
		
			entityManager.remove(gamer);
			return true;

	}

	@Override
	public Gamer findGamerById(Integer idGamer) {
		Gamer gamer = null;

			gamer = entityManager.find(Gamer.class, idGamer);
		
		return gamer;
	}

	@Override
	public List<Gamer> findAllGamers() {
		Query query = (Query) entityManager
				.createQuery("select g from Gamer g");
		return ((javax.persistence.Query) query).getResultList();

	}
	 


}
