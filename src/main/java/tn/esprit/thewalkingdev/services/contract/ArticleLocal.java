package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Articles;

@Local
public interface ArticleLocal {

	Boolean addArticle(Articles article);

	Boolean updateArticle(Articles article);

	void deleteArticle(int id);

	Articles findArticlebyId(Integer idArticle);

	List<Articles> findAllArticles();
}
