package tn.esprit.thewalkingdev.services.gestionTypeEquipment;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Equipment;
import tn.esprit.thewalkingdev.entites.TypeEquipment;

/**
 * Session Bean implementation class TypeEquipementDAO
 */
@Stateless
public class TypeEquipmentDAO implements TypeEquipmentDAORemote, TypeEquipmentDAOLocal {

	@PersistenceContext(unitName="vgta")
	   EntityManager entityManager ;
    public TypeEquipmentDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addTypeEquipment(TypeEquipment typeEquipment) {
		try {
			entityManager.persist(typeEquipment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateTypeEquipment(TypeEquipment typeEquipment) {
		try {
			entityManager.merge(typeEquipment);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteTypeEquipment(TypeEquipment typeEquipment) {
		try {
			entityManager.remove(entityManager.merge(typeEquipment));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public TypeEquipment findTypeEquipmentById(Integer idTypeEquipment) {
		TypeEquipment typeEquipment = null ;
		try {
			typeEquipment = entityManager.find(TypeEquipment.class, idTypeEquipment);
		} catch (Exception e) {
			
		}
		return typeEquipment;
	}

	@Override
	public List<TypeEquipment> findAllTypeEquipment() {
		Query query = entityManager.createQuery("select e from TypeEquipment e");
		return query.getResultList();
	}

}
