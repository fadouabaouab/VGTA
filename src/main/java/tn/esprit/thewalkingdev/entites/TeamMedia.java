package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("t_media")
public class TeamMedia extends Team implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Articles> articles;

	public TeamMedia(List<Articles> articles) {
		super();
		this.articles = articles;
	}

	public TeamMedia() {
		super();
	}

	@OneToMany(mappedBy="teamMedia")
	public List<Articles> getArticles() {
		return articles;
	}

	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}

}