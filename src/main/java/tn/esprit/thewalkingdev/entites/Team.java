package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Team implements Serializable {

	private int id_team;
	private static final long serialVersionUID = 1L;
	private List<Gamer> gamers;

	public Team() {
	}

	public Team(int id_team, List<Gamer> gamers) {
		this.id_team = id_team;
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

	@OneToMany(mappedBy="team")
	public List<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(List<Gamer> gamers) {
		this.gamers = gamers;
	}

}
