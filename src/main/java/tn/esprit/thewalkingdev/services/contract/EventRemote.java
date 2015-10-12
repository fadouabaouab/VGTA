package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Event;

@Remote
public interface EventRemote {

	Boolean addEvent(Event event);

	Boolean updateEvent(Event event);

	void deleteEvent(int id);

	Event findEventbyId(Integer idEvent);

	List<Event> findAllEvents();
}
