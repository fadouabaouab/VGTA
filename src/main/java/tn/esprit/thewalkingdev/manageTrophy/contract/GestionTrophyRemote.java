package tn.esprit.thewalkingdev.manageTrophy.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Trophy;

@Remote
public interface GestionTrophyRemote {

	Boolean addTrophy(Trophy trophy);

	Boolean updateTrophy(Trophy trophy);

	Boolean deleteTrophy(Trophy trophy);

	Trophy findTrophyById(Integer idTrophy);

	List<Trophy> findAllTrophy();
}
