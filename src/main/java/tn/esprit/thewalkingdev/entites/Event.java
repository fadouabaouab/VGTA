package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Event implements Serializable {

	private int id_event;
	private String name_event;
	private Date date_event;
	private int numberOfReservation;
	private String owner;
	private boolean streaming;
	private boolean isTournament;
	private List<Contribution> contributions;
	private List<Trophy> trophies;
	private TypeEvent typeEvent;
	private Venue venue;
	private Team teamOrganisation;
	private static final long serialVersionUID = 1L;

	public Event() {
	}

	public Event(int id_event, String name_event, Date date_event,
			int numberOfReservation, String owner, boolean streaming,
			boolean isTournament, List<Contribution> contributions,
			TypeEvent typeEvent, Venue venue, Team teamOrganisation) {

		this.id_event = id_event;
		this.name_event = name_event;
		this.date_event = date_event;
		this.numberOfReservation = numberOfReservation;
		this.owner = owner;
		this.streaming = streaming;
		this.isTournament = isTournament;
		this.contributions = contributions;
		this.typeEvent = typeEvent;
		this.venue = venue;
		this.teamOrganisation = teamOrganisation;
	}
	

	public Event(String name_event, Date date_event, int numberOfReservation,
			String owner, boolean streaming, boolean isTournament,
			List<Contribution> contributions, List<Trophy> trophies,
			TypeEvent typeEvent, Venue venue, Team teamOrganisation) {
		super();
		this.name_event = name_event;
		this.date_event = date_event;
		this.numberOfReservation = numberOfReservation;
		this.owner = owner;
		this.streaming = streaming;
		this.isTournament = isTournament;
		this.contributions = contributions;
		this.trophies = trophies;
		this.typeEvent = typeEvent;
		this.venue = venue;
		this.teamOrganisation = teamOrganisation;
	}

	public Event(String name_event, Date date_event, int numberOfReservation,
			String owner, boolean streaming, boolean isTournament,
			TypeEvent typeEvent, Venue venue, Team teamOrganisation) {
		
		this.name_event = name_event;
		this.date_event = date_event;
		this.numberOfReservation = numberOfReservation;
		this.owner = owner;
		this.streaming = streaming;
		this.isTournament = isTournament;
		this.typeEvent = typeEvent;
		this.venue = venue;
		this.teamOrganisation = teamOrganisation;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_event() {
		return this.id_event;
	}

	public void setId_event(int id_event) {
		this.id_event = id_event;
	}

	public String getName_event() {
		return name_event;
	}

	public void setName_event(String name_event) {
		this.name_event = name_event;
	}

	public Date getDate_event() {
		return this.date_event;
	}

	public void setDate_event(Date date_event) {
		this.date_event = date_event;
	}

	public int getNumberOfReservation() {
		return this.numberOfReservation;
	}

	public void setNumberOfReservation(int numberOfReservation) {
		this.numberOfReservation = numberOfReservation;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean getStreaming() {
		return this.streaming;
	}

	public void setStreaming(boolean streaming) {
		this.streaming = streaming;
	}

	@OneToMany(mappedBy = "event")
	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	@ManyToOne
	@JoinColumn(name = "typeEvent", updatable = false, insertable = false)
	public TypeEvent getTypeEvent() {
		return typeEvent;
	}

	public void setTypeEvent(TypeEvent typeEvent) {
		this.typeEvent = typeEvent;
	}

	@ManyToOne
	@JoinColumn(name = "teamOrganisation")
	public Team getTeamOrganisation() {
		return teamOrganisation;
	}

	public void setTeamOrganisation(Team teamOrganisation) {
		this.teamOrganisation = teamOrganisation;
	}

	@ManyToOne
	@JoinColumn(name = "venue", updatable = false, insertable = false)
	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public boolean isTournament() {
		return isTournament;
	}

	public void setTournament(boolean isTournament) {
		this.isTournament = isTournament;
	}

	@OneToMany(mappedBy = "event")
	public List<Trophy> getTrophies() {
		return trophies;
	}

	public void setTrophies(List<Trophy> trophies) {
		this.trophies = trophies;
	}

}
