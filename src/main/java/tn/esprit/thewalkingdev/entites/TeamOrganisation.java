package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_organisation")
@DiscriminatorValue("t_organisation")
public class TeamOrganisation extends Team implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Event> events;

	public TeamOrganisation() {
		super();
	}

	public TeamOrganisation(List<Event> events) {
		super();
		this.events = events;
	}
	
	@OneToMany(mappedBy="teamOrganisation")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	
}