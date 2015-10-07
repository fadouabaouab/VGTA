package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;
import javax.servlet.jsp.tagext.TryCatchFinally;

import tn.esprit.thewalkingdev.entites.Subject;

/**
 * Session Bean implementation class ManageSubject
 */
@Stateless
public class ManageSubject implements ManageSubjectRemotes, ManageSubjectLocal {
 
	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;
    public ManageSubject() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSubject(Subject Subject) {
try {
	entityManager.persist(Subject);
	return true;
} catch (Exception e) {
	return false;}		
	}

	@Override
	public Boolean updateSubject(Subject Subject) {
 try {
	 entityManager.merge(Subject);
		return true;

} catch (Exception e) {
	return false;
}
	}

	@Override
	public Boolean deleteSubject(Subject Subject) {
		 try {
			entityManager.remove(entityManager.merge(Subject));
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Subject findSubjectById(int idSubject) {
Subject Subject =null;
try {
	Subject=entityManager.find(Subject.class,idSubject);
		

} catch (Exception e) {
	return null;
}	
return Subject;}

	@Override
	public List<Subject> findAllSubject() {
List<Subject> listSubject;
Query query=entityManager.createNamedQuery("select a from Subject");
return query.getResultList();
	}

}
