package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity

public class Sponsor implements Serializable {

	private int id_sponsor;
	private String name_sponsor;
	private String name_Contact_sponsor;
	private String email;
	private String DateS;
	private String DateE;
	private List<Contribution> contributions;
	private TeamSponsoring teamSponsoring;
	private static final long serialVersionUID = 1L;

	public Sponsor() {
	}


	public Sponsor(int id_sponsor, String name_sponsor,
			String name_Contact_sponsor, String email, String dateS,
			String dateE, List<Contribution> contributions,
			TeamSponsoring teamSponsoring) {
		super();
		this.id_sponsor = id_sponsor;
		this.name_sponsor = name_sponsor;
		this.name_Contact_sponsor = name_Contact_sponsor;
		this.email = email;
		DateS = dateS;
		DateE = dateE;
		this.contributions = contributions;
		this.teamSponsoring = teamSponsoring;
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
	@OneToMany(mappedBy="sponsor")
	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	@ManyToOne
	@JoinColumn(name = "teamSponsoring")
	public TeamSponsoring getTeamSponsoring() {
		return teamSponsoring;
	}

	public void setTeamSponsoring(TeamSponsoring teamSponsoring) {
		this.teamSponsoring = teamSponsoring;
	}


	public String getName_Contact_sponsor() {
		return name_Contact_sponsor;
	}


	public void setName_Contact_sponsor(String name_Contact_sponsor) {
		this.name_Contact_sponsor = name_Contact_sponsor;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDateS() {
		return DateS;
	}


	public void setDateS(String dateS) {
		DateS = dateS;
	}


	public String getDateE() {
		return DateE;
	}


	public void setDateE(String dateE) {
		DateE = dateE;
	}


	@Override
	public String toString() {
		return "Sponsor [id_sponsor=" + id_sponsor + ", name_sponsor="
				+ name_sponsor + ", name_Contact_sponsor="
				+ name_Contact_sponsor + ", email=" + email + ", DateS="
				+ DateS + ", DateE=" + DateE + ", contributions="
				+ contributions.toString() + ", teamSponsoring=" + teamSponsoring.toString() + "]";
	}


	
	
	

	

}
