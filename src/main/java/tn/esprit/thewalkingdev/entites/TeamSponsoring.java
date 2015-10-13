package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_sponsoring")
@DiscriminatorValue("t_sponsoring")
public class TeamSponsoring extends Team implements Serializable {

	private static final long serialVersionUID = 1L;
	
	

	public TeamSponsoring() {
		super();
	}
	

	public TeamSponsoring(List<Sponsor> sponsors) {
		super();
	
	}


	
	
	

}