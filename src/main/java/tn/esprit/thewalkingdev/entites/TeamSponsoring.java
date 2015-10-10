package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("t_sponsoring")
public class TeamSponsoring extends Team implements Serializable {

	private static final long serialVersionUID = 1L;
	
	List<Sponsor> sponsors;

	public TeamSponsoring() {
		super();
	}
	

	public TeamSponsoring(List<Sponsor> sponsors) {
		super();
		this.sponsors = sponsors;
	}

	@OneToMany(mappedBy="teamSponsoring")
	public List<Sponsor> getSponsors() {
		return sponsors;
	}

	public void setSponsors(List<Sponsor> sponsors) {
		this.sponsors = sponsors;
	}
	
	
	

}