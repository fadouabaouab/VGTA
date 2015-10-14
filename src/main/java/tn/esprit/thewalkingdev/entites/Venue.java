package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
public class Venue implements Serializable {

	private int id_venue;
	private String label;
	private String adress;
	private static final long serialVersionUID = 1L;

	private List<Event> events;

	public Venue() {
	}

	public Venue(int id_venue, String label, String adress, List<Event> events) {
		
		this.id_venue = id_venue;
		this.label = label;
		this.adress = adress;
		this.setEvents(events);
	}
	
	public Venue(String label, String adress) {
		
		this.label = label;
		this.adress = adress;
	}

	@Id
	public int getId_venue() {
		return this.id_venue;
	}

	public void setId_venue(int id_venue) {
		this.id_venue = id_venue;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@OneToMany(mappedBy="venue")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	

}
