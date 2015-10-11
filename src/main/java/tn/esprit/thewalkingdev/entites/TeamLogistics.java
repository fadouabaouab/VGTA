package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_logistics")
@DiscriminatorValue("t_logistics")
public class TeamLogistics extends Team implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Equipment> equipments;

	public TeamLogistics() {
		super();
	}

	public TeamLogistics(List<Equipment> equipments) {
		super();
		this.equipments = equipments;
	}

	@OneToMany(mappedBy = "teamLogistics")
	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

}
