package tn.esprit.thewalkingdev.services.gestionGamer;

import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Gamer;

/**
 * Session Bean implementation class GestionGamer
 */
@Stateless
public class GestionGamer implements GestionGamerRemote, GestionGamerLocal {
	@PersistenceContext(unitName = "vgta")
	EntityManager entityManager;

	public GestionGamer() {
	}

	@Override
	public Boolean addGamer(Gamer gamer) {
		try {
			entityManager.persist(gamer);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateGamer(Gamer gamer) {
		try {
			entityManager.merge(gamer);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteGamer(Gamer gamer) {
		try {
			entityManager.remove(gamer);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Gamer findGamerById(Integer idGamer) {
		Gamer gamer = null;
		try {
			gamer = entityManager.find(Gamer.class, idGamer);
		} catch (Exception e) {
		}
		return gamer;
	}

	@Override
	public List<Gamer> findAllGamers() {
		Query query = (Query) entityManager
				.createQuery("select g from Gamer g");
		return ((javax.persistence.Query) query).getResultList();

	}

}
