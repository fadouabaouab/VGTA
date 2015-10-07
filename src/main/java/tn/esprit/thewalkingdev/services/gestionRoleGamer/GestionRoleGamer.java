package tn.esprit.thewalkingdev.services.gestionRoleGamer;

import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.thewalkingdev.entites.Gamer;
import tn.esprit.thewalkingdev.entites.Role;

/**
 * Session Bean implementation class GestionRoleGamer
 */
@Stateless
public class GestionRoleGamer implements GestionRoleGamerRemote,
		GestionRoleGamerLocal {

	@PersistenceContext(unitName = "vgta")
	EntityManager entityManager;

	public GestionRoleGamer() {
	}

	@Override
	public Boolean addRoleGamer(Role role) {
		try {
			entityManager.persist(role);
			return true;

		} catch (Exception e) {
			return false;		
	}
	}

	@Override
	public Boolean updateRoleGamer(Role role) {
		try {
			entityManager.merge(role);
			return true;

		} catch (Exception e) {
			return false;
	}
	}

	@Override
	public Boolean deleteRoleGamer(Role role) {
		try {
			entityManager.remove(role);
			return true;

		} catch (Exception e) {
			return false;	
	}
	}

	@Override
	public Role findRoleGamerById(Integer idRole) {
		Role role = null;
		try {
			role = entityManager.find(Role.class, idRole);
		} catch (Exception e) {
		}
		return role;		
	}

	@Override
	public List<Role> findAllRoleGamers() {
		Query query = (Query) entityManager
				.createQuery("select g from Gamer g");
		return ((javax.persistence.Query) query).getResultList();
	}

}
