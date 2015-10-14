package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
public class Sponsor implements Serializable {

	private int id_sponsor;
	private String name_sponsor;
	private Team teamSponsoring;
	private List<Contribution> contributions;
	private static final long serialVersionUID = 1L;

	public Sponsor() {
	}
	
	public Sponsor(int id_sponsor, String name_sponsor,
			Team teamSponsoring, List<Contribution> contributions) {
		super();
		this.id_sponsor = id_sponsor;
		this.name_sponsor = name_sponsor;
		this.teamSponsoring = teamSponsoring;
		this.contributions = contributions;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_sponsor() {
		return this.id_sponsor;
	}

	public void setId_sponsor(int id_sponsor) {
		this.id_sponsor = id_sponsor;
	}

	public String getName_sponsor() {
		return this.name_sponsor;
	}

	public void setName_sponsor(String name_sponsor) {
		this.name_sponsor = name_sponsor;
	}
	
	@ManyToOne
	@JoinColumn(name = "teamSponsoring")
	public Team getTeamSponsoring() {
		return teamSponsoring;
	}

	public void setTeamSponsoring(Team teamSponsoring) {
		this.teamSponsoring = teamSponsoring;
	}

	@OneToMany(mappedBy="sponsor")
	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	

}
