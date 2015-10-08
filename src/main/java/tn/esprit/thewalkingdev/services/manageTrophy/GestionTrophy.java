package tn.esprit.thewalkingdev.services.manageTrophy;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Trophy;
import tn.esprit.thewalkingdev.manageTrophy.contract.GestionTrophyLocal;
import tn.esprit.thewalkingdev.manageTrophy.contract.GestionTrophyRemote;

/**
 * Session Bean implementation class GestionTrophy
 */
@Stateless
public class GestionTrophy implements GestionTrophyRemote, GestionTrophyLocal {

    @PersistenceContext(unitName="vgta")
    EntityManager entityManager;
    public GestionTrophy() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addTrophy(Trophy trophy) {
		entityManager.persist(trophy);
		return true;
	}

	@Override
	public Boolean updateTrophy(Trophy trophy) {
		entityManager.merge(trophy);
		return true;
	}

	@Override
	public Boolean deleteTrophy(Trophy trophy) {
		entityManager.remove(entityManager.merge(trophy));
		return true;
	}

	@Override
	public Trophy findTrophyById(Integer idTrophy) {
		Trophy trophy = null;
		trophy = entityManager.find(Trophy.class, idTrophy);
		return trophy;
	}

	@Override
	public List<Trophy> findAllTrophy() {
		Query query = entityManager.createQuery("select t from Trophy t");
		return query.getResultList();
	}

}
