package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

@Entity
public class Articles implements Serializable {

	private int id_article;
	private String name_article;
	private String text;
	private static final long serialVersionUID = 1L;
	private TeamMedia teamMedia;

	public Articles() {
	}

	public Articles(int id_article, String name_article, String text,
			TeamMedia teamMedia) {
		this.id_article = id_article;
		this.name_article = name_article;
		this.text = text;
		this.teamMedia = teamMedia;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_article() {
		return this.id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public String getName_article() {
		return this.name_article;
	}

	public void setName_article(String name_article) {
		this.name_article = name_article;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@ManyToOne
	@JoinColumn(name = "teamMedia")
	public TeamMedia getTeamMedia() {
		return teamMedia;
	}

	public void setTeamMedia(TeamMedia teamMedia) {
		this.teamMedia = teamMedia;
	}

	
}
