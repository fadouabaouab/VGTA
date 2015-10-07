package tn.esprit.thewalkingdev.services.gestionEquipment;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Equipment;

@Local
public interface EquipmentDAOLocal {
	Boolean addEquipement(Equipment equipment);
	Boolean updateEquipement(Equipment equipment);
	Boolean deleteEquipement(Equipment equipment);
	Equipment findEquipementById(Integer idEquipement);
	List<Equipment> findAllEquipements();
}
