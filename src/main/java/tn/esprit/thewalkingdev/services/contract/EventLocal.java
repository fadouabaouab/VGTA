package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Event;

@Local
public interface EventLocal {

	Boolean addEvent(Event event);

	Boolean updateEvent(Event event);

	Boolean deleteEvent(Event event);

	Event findEventbyId(Integer idEvent);

	List<Event> findAllEvents();
}
