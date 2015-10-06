package tn.esprit.thewalkingdev.services.gestionEquipment;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Equipment;

@Remote
public interface EquipmentDAORemote {

	Boolean addEquipement(Equipment equipment);
	Boolean updateEquipement(Equipment equipment);
	Boolean deleteEquipement(Equipment equipment);
	Equipment findEquipementById(Integer idEquipement);
	List<Equipment> findAllEquipements();
}
