package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity
public class Subject implements Serializable {

	private int id;
	private String name_subject;
	private String message;

	private static final long serialVersionUID = 1L;
	private CategoryForum categoryForums;
	private List<Publication> publications;

	public Subject() {
	}

	public Subject(int id, String name_subject, String message,
			CategoryForum categoryForums, List<Publication> publications) {
		super();
		this.id = id;
		this.name_subject = name_subject;
		this.message = message;
		this.categoryForums = categoryForums;
		this.publications = publications;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_subject() {
		return this.id;
	}

	public void setId_subject(int id_subject) {
		this.id = id_subject;
	}

	public String getName_subject() {
		return this.name_subject;
	}

	public void setName_subject(String name_subject) {
		this.name_subject = name_subject;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@OneToMany(mappedBy = "subject")
	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	@ManyToOne
	@JoinColumn(name = "categoryForums")
	public CategoryForum getCategoryForums() {
		return categoryForums;
	}

	public void setCategoryForums(CategoryForum categoryForums) {
		this.categoryForums = categoryForums;
	}

}
