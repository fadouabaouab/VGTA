package tn.esprit.thewalkingdev.services.gestionTypeEvent;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.TypeEvent;

@Remote
public interface GestionTypeEventRemote {

	Boolean addTypeEvent(TypeEvent typeevent);

	Boolean updateTypeEvent(TypeEvent typeevent);

	Boolean deleteTypeEvent(TypeEvent typeevent);

	TypeEvent findTypeEventbyId(Integer idTypeEvent);

	List<TypeEvent> findAllTypeEvent();
}
