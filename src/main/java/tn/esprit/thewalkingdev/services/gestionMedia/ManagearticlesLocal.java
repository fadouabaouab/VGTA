package tn.esprit.thewalkingdev.services.gestionMedia;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Articles;

@Local
public interface ManagearticlesLocal {
	public Boolean addArticles(Articles articles);
	public Boolean updateArticles(Articles articles);
	public Boolean deleteArticles(Articles articles);
	public Articles findArticlesById(int idarticle);
	public List<Articles> findAllArticles();

}
