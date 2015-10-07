package tn.esprit.thewalkingdev.services.gestionTypeEvent;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Event;
import tn.esprit.thewalkingdev.entites.TypeEvent;

/**
 * Session Bean implementation class GestionTypeEvent
 */
@Stateless
public class GestionTypeEvent implements GestionTypeEventRemote, GestionTypeEventLocal {

	@PersistenceContext(unitName="vgta")
    EntityManager entityManager;
    public GestionTypeEvent() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addTypeEvent(TypeEvent typeevent) {
		try {
			entityManager.persist(typeevent);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateTypeEvent(TypeEvent typeevent) {
		try {
			entityManager.merge(typeevent);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteTypeEvent(TypeEvent typeevent) {
		try {
			entityManager.remove(entityManager.merge(typeevent));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public TypeEvent findTypeEventbyId(Integer idTypeEvent) {
		TypeEvent typeEvent=null;
		try {
			typeEvent=entityManager.find(TypeEvent.class,idTypeEvent);
			
		} catch (Exception e) {
			
		}
		return typeEvent;
	}

	@Override
	public List<TypeEvent> findAllTypeEvent() {
		javax.persistence.Query query=entityManager.createQuery("select t from TypeEvent t");
		return query.getResultList();
	}

}
