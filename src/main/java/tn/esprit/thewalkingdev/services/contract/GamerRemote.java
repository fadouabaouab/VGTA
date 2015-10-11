package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Gamer;

@Remote
public interface GamerRemote {

	Boolean addGamer(Gamer gamer);

	Boolean updateGamer(Gamer gamer);

	Boolean deleteGamer(Gamer gamer);

	Gamer findGamerById(Integer idGamer);

	List<Gamer> findAllGamers();
}
