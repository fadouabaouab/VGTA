package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;
import javax.servlet.jsp.tagext.TryCatchFinally;

import tn.esprit.thewalkingdev.entites.Publication;

/**
 * Session Bean implementation class ManagePublication
 */
@Stateless
public class ManagePublication implements ManagePublicationRemotes, ManagePublicationLocal {
 
	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;
    public ManagePublication() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addPublication(Publication Publication) {
try {
	entityManager.persist(Publication);
	return true;
} catch (Exception e) {
	return false;}		
	}

	@Override
	public Boolean updatePublication(Publication Publication) {
 try {
	 entityManager.merge(Publication);
		return true;

} catch (Exception e) {
	return false;
}
	}

	@Override
	public Boolean deletePublication(Publication Publication) {
		 try {
			entityManager.remove(entityManager.merge(Publication));
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Publication findPublicationById(int idpublication) {
Publication Publication =null;
try {
	Publication=entityManager.find(Publication.class,idpublication);
		

} catch (Exception e) {
	return null;
}	
return Publication;}

	@Override
	public List<Publication> findAllPublication() {
List<Publication> listPublication;
Query query=entityManager.createNamedQuery("select a from publication");
return query.getResultList();
	}

}
