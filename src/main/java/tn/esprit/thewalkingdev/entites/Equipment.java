package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Equipment implements Serializable {

	private int id_equipement;
	private int quantity;
	private static final long serialVersionUID = 1L;
	private TeamLogistics teamLogistics;
	private Brand brand;
	private TypeEquipment typeEquipment;

	public Equipment() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_equipement() {
		return this.id_equipement;
	}

	public void setId_equipement(int id_equipement) {
		this.id_equipement = id_equipement;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@ManyToOne
	@JoinColumn(name = "teamLogistics")
	public TeamLogistics getTeamLogistics() {
		return teamLogistics;
	}

	public void setTeamLogistics(TeamLogistics teamLogistics) {
		this.teamLogistics = teamLogistics;
	}

	@ManyToOne
	@JoinColumn(name = "brand")
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@ManyToOne
	@JoinColumn(name = "typeEquipment")
	public TypeEquipment getTypeEquipment() {
		return typeEquipment;
	}

	public void setTypeEquipment(TypeEquipment typeEquipment) {
		this.typeEquipment = typeEquipment;
	}

	
}
