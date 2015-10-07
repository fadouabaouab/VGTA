package tn.esprit.thewalkingdev.services.gestionTypeEvent;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.TypeEvent;

@Local
public interface GestionTypeEventLocal {

	Boolean addTypeEvent(TypeEvent typeevent);

	Boolean updateTypeEvent(TypeEvent typeevent);

	Boolean deleteTypeEvent(TypeEvent typeevent);

	TypeEvent findTypeEventbyId(Integer idTypeEvent);

	List<TypeEvent> findAllTypeEvent();
}
