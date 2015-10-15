package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Gamer implements Serializable {

	private String lastName;
	private int id;
	private String firstName;
	private Integer age;
	private String email;
	private String pwd;
	private int rank;
	private int record;
	private Role role;
	private static final long serialVersionUID = 1L;
	private Team team;
	private List<Publication> publications;
	private List<Trophy> trophies;
	private List<Vote> votes;

	public Gamer() {
	}
	
	public Gamer(String lastName, int id, String firstName, Integer age,
			String email, String pwd, int rank, int record, Role role,
			Team team, List<Publication> publications, List<Trophy> trophies,
			List<Vote> votes) {
		super();
		this.lastName = lastName;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.rank = rank;
		this.record = record;
		this.role = role;
		this.team = team;
		this.publications = publications;
		this.trophies = trophies;
		this.votes = votes;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id_Gamer) {
		this.id = id_Gamer;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRecord() {
		return this.record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	@OneToMany(mappedBy = "gamer")
	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne
	@JoinColumn(name = "team")
	public Team getTeam() {
		return team;
	}


	public void setTeam(Team team) {
		this.team = team;
	}

	@OneToMany(mappedBy = "gamer")
	public List<Trophy> getTrophies() {
		return trophies;
	}

	public void setTrophies(List<Trophy> trophies) {
		this.trophies = trophies;
	}
	@OneToMany(mappedBy="gamer")
	public List<Vote> getVotes() {
		return votes;
	}
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public Gamer(String lastName, String firstName, String email, Role role) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.role = role;
	}

	public Gamer(String lastName, String firstName, String email, Role role,
			Team team) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.role = role;
		this.team = team;
	}
	public Gamer(String lastName, String firstName, String email, Role role,
			String team) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.role = role;
		team=team.getClass().getName() ;
	}
	
	
	
}
