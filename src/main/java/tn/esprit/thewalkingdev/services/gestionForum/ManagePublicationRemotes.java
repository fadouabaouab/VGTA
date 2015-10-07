package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Publication;

@Remote
public interface ManagePublicationRemotes {
	public Boolean addPublication(Publication Publication);
	public Boolean updatePublication(Publication Publication);
	public Boolean deletePublication(Publication Publication);
	public Publication findPublicationById(int idpublication);
	public List<Publication> findAllPublication();

}
