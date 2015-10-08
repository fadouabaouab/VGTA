package tn.esprit.thewalkingdev.services.manageTypeEquipment.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.TypeEquipment;

@Local
public interface TypeEquipmentDAOLocal {
	Boolean addTypeEquipment(TypeEquipment typeEquipment);
	Boolean updateTypeEquipment(TypeEquipment typeEquipment);
	Boolean deleteTypeEquipment(TypeEquipment typeEquipment);
	TypeEquipment findTypeEquipmentById(Integer typeEquipment);
	List<TypeEquipment> findAllTypeEquipment();
}
