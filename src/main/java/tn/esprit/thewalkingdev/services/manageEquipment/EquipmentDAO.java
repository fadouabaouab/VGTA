package tn.esprit.thewalkingdev.services.manageEquipment;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Equipment;
import tn.esprit.thewalkingdev.manageEquipment.contract.EquipmentDAOLocal;
import tn.esprit.thewalkingdev.manageEquipment.contract.EquipmentDAORemote;

/**
 * Session Bean implementation class EquipementDAO
 */
@Stateless
public class EquipmentDAO implements EquipmentDAORemote, EquipmentDAOLocal {
@PersistenceContext(unitName="vgta")
   EntityManager entityManager ;
    public EquipmentDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEquipement(Equipment equipment) {
		try {
			entityManager.persist(equipment);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Boolean updateEquipement(Equipment equipment) {
		try {
			entityManager.merge(equipment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteEquipement(Equipment equipment) {
		try {
			entityManager.remove(entityManager.merge(equipment));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Equipment findEquipementById(Integer idEquipement) {
		Equipment equipment = null ;
		try {
			equipment = entityManager.find(Equipment.class, idEquipement);
		} catch (Exception e) {
			
		}
		return equipment;
	}

	@Override
	public List<Equipment> findAllEquipements() {
	Query query = entityManager.createQuery("select e from Equipement e");
		return query.getResultList();
	}

}
