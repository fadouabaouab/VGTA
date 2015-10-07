package tn.esprit.thewalkingdev.services.gestionRoleGamer;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Role;

@Local
public interface GestionRoleGamerLocal {

	Boolean addRoleGamer(Role role);

	Boolean updateRoleGamer(Role role);

	Boolean deleteRoleGamer(Role role);

	Role findRoleGamerById(Integer idRole);

	List<Role> findAllRoleGamers();
}
