package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Brand
 *
 */
@Entity

public class Brand implements Serializable {

	
	private int idMarque;
	private String label;
	private List<Equipment> equipments;
	private static final long serialVersionUID = 1L;

	public Brand() {
	}   
	@Id    
	public int getIdMarque() {
		return this.idMarque;
	}

	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@OneToMany(mappedBy="brand")
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	public Brand(int idMarque, String label, List<Equipment> equipments) {
		this.idMarque = idMarque;
		this.label = label;
		this.equipments = equipments;
	}
	@Override
	public String toString() {
		return label ;
	}
	
	
	
   
}
