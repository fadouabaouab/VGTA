package tn.esprit.thewalkingdev.services.manageEvent.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Event;

@Remote
public interface GestionEventRemote {

	Boolean addEvent(Event event);

	Boolean updateEvent(Event event);

	Boolean deleteEvent(Event event);

	Event findEventbyId(Integer idEvent);

	List<Event> findAllEvents();
}
