package tn.esprit.thewalkingdev.manageTypeEvent.contract;

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
