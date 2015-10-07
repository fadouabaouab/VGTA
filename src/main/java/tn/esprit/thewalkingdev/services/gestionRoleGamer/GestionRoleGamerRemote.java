package tn.esprit.thewalkingdev.services.gestionRoleGamer;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Role;

@Remote
public interface GestionRoleGamerRemote {


	Boolean addRoleGamer(Role role);

	Boolean updateRoleGamer(Role role);

	Boolean deleteRoleGamer(Role role);

	Role findRoleGamerById(Integer idRole);

	List<Role> findAllRoleGamers();
}
