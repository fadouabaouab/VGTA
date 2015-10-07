package tn.esprit.thewalkingdev.services.gestionGamer;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Gamer;

@Local
public interface GestionGamerLocal {
	Boolean addGamer(Gamer gamer);

	Boolean updateGamer(Gamer gamer);

	Boolean deleteGamer(Gamer gamer);

	Gamer findGamerById(Integer idGamer);

	List<Gamer> findAllGamers();
}
