package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Event;
import tn.esprit.thewalkingdev.entites.TypeEvent;
import tn.esprit.thewalkingdev.services.contract.EventRemote;
import tn.esprit.thewalkingdev.services.contract.TypeEventLocal;
import tn.esprit.thewalkingdev.services.contract.TypeEventRemote;

/**
 * Session Bean implementation class GestionTypeEvent
 */
@Stateless
public class TypeEventCrud implements TypeEventRemote,
		TypeEventLocal {

	@PersistenceContext(unitName = "vgta")
	EntityManager entityManager;

	public TypeEventCrud() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addTypeEvent(TypeEvent typeevent) {

			entityManager.persist(typeevent);
			return true;
	}

	@Override
	public Boolean updateTypeEvent(TypeEvent typeevent) {
	
			entityManager.merge(typeevent);
			return true;
	}

	@Override
	public Boolean deleteTypeEvent(TypeEvent typeevent) {

			entityManager.remove(typeevent);
			return true;

	}

	@Override
	public TypeEvent findTypeEventbyId(Integer idTypeEvent) {
		TypeEvent typeEvent = null;
			typeEvent = entityManager.find(TypeEvent.class, idTypeEvent);

		return typeEvent;
	}

	@Override
	public List<TypeEvent> findAllTypeEvent() {
		javax.persistence.Query query = entityManager
				.createQuery("select t from TypeEvent t");
		return query.getResultList();
	}

}
