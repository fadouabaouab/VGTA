package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Subject;

@Local
public interface ManageSubjectLocal {
	public Boolean addSubject(Subject Subject);
	public Boolean updateSubject(Subject Subject);
	public Boolean deleteSubject(Subject Subject);
	public Subject findSubjectById(int idSubject);
	public List<Subject> findAllSubject();

}
