package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Subject;

@Remote
public interface ManageSubjectRemotes {
	public Boolean addSubject(Subject Subject);
	public Boolean updateSubject(Subject Subject);
	public Boolean deleteSubject(Subject Subject);
	public Subject findSubjectById(int idSubject);
	public List<Subject> findAllSubject();

}
