package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CategoryForum
 *
 */
@Entity

public class CategoryForum implements Serializable {

	
	private int id_category;
	private String label;
	private static final long serialVersionUID = 1L;
	
	 private List<Subject> subjects;

	public CategoryForum() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_category() {
		return this.id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	 @OneToMany(mappedBy="categoryForums")
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	 
   
}
