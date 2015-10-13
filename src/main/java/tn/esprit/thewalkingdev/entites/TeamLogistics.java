package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("t_logistics")
public class TeamLogistics extends Team implements Serializable {

	private static final long serialVersionUID = 1L;

	

	public TeamLogistics() {
		super();
	}

	public TeamLogistics(List<Equipment> equipments) {
		super();
		
	}



	
}
