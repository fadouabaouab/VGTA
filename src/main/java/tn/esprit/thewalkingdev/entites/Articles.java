package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;
import java.sql.Date;

import javax.persistence.*;

@Entity
public class Articles implements Serializable {

	private int id_article;
	private String title;
	private String text;
	private Date pubDate;
	private static final long serialVersionUID = 1L;
	private TeamMedia teamMedia;
	private Blob picture;

	public Articles() {
	}

	public Articles(int id_article, String title, String text,Date pubDate,
			TeamMedia teamMedia, Blob picture) {

		this.id_article = id_article;
		this.title = title;
		this.text = text;
		this.pubDate = pubDate;
		this.teamMedia = teamMedia;
		this.picture = picture;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_article() {
		return this.id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	@ManyToOne
	@JoinColumn(name = "teamMedia")
	public TeamMedia getTeamMedia() {
		return teamMedia;
	}

	public void setTeamMedia(TeamMedia teamMedia) {
		this.teamMedia = teamMedia;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

}
