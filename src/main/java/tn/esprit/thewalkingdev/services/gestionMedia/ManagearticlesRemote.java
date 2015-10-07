package tn.esprit.thewalkingdev.services.gestionMedia;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Articles;

@Remote
public interface ManagearticlesRemote {
	public Boolean addArticles(Articles articles);
	public Boolean updateArticles(Articles articles);
	public Boolean deleteArticles(Articles articles);
	public Articles findArticlesById(int idarticle);
	public List<Articles> findAllArticles();

}
