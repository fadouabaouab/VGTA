package tn.esprit.thewalkingdev.manageTrophy.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Trophy;

@Local
public interface GestionTrophyLocal {

	Boolean addTrophy(Trophy trophy);

	Boolean updateTrophy(Trophy trophy);

	Boolean deleteTrophy(Trophy trophy);

	Trophy findTrophyById(Integer idTrophy);

	List<Trophy> findAllTrophy();
}
