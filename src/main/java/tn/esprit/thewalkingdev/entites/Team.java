package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Team implements Serializable {

	private int id_team;
	private String name;
	private int max_members;
	private static final long serialVersionUID = 1L;
	private List<Gamer> gamers;
	private List<Equipment> equipments;
	private List<Article> articles;
	private List<Event> events;
	private List<Sponsor> sponsors;

	public Team() {
	}

	public Team(String name, int max_members, List<Gamer> gamers) {
		this.name = name;
		this.max_members = max_members;
		this.gamers = gamers;
	}

	public Team(int id_team) {
		this.id_team = id_team;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_team() {
		return this.id_team;
	}

	public void setId_team(int id_team) {
		this.id_team = id_team;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy="team")
	public List<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(List<Gamer> gamers) {
		this.gamers = gamers;
	}

	public int getMax_members() {
		return max_members;
	}

	public void setMax_members(int max_members) {
		this.max_members = max_members;
	}
	
	@OneToMany(mappedBy = "teamLogistics")
	public List<Equipment> getEquipments() {
		return equipments;
	}
	
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	
	@OneToMany(mappedBy="teamMedia")
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@OneToMany(mappedBy="teamOrganisation")
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@OneToMany(mappedBy="teamSponsoring")
	public List<Sponsor> getSponsors() {
		return sponsors;
	}

	public void setSponsors(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}
	
	

}
