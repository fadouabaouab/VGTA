package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Articles implements Serializable {

	private int id_article;
	private String title;
	private String text;
	private static final long serialVersionUID = 1L;
	private TeamMedia teamMedia;
	private Blob image;
	private Date pubDate;

	public Articles() {
	}


	public Articles(String title, String text, TeamMedia teamMedia, Blob image,
			Date pubDate) {
		super();
		this.title = title;
		this.text = text;
		this.teamMedia = teamMedia;
		this.image = image;
		this.pubDate = pubDate;
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

	@ManyToOne
	@JoinColumn(name = "teamMedia")
	public TeamMedia getTeamMedia() {
		return teamMedia;
	}

	public void setTeamMedia(TeamMedia teamMedia) {
		this.teamMedia = teamMedia;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	
}
