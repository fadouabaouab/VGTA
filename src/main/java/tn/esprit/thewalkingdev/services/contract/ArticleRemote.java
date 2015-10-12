package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Articles;


@Remote
public interface ArticleRemote {

	Boolean addArticle(Articles article);

	Boolean updateArticle(Articles article);

	void deleteArticle(int id);

	Articles findArticlebyId(Integer idArticle);

	List<Articles> findAllArticles();
}
