package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Article;
import tn.esprit.thewalkingdev.services.contract.ArticleLocal;
import tn.esprit.thewalkingdev.services.contract.ArticleRemote;

@Stateless
public class ArticleCrud implements ArticleLocal,ArticleRemote {
	@PersistenceContext(unitName="vgta")
	   EntityManager entityManager ;
	
	@Override
	public Boolean addArticle(Article article) {
		entityManager.persist(article);
		return true;
	}

	@Override
	public Boolean updateArticle(Article article) {
		entityManager.merge(article);
		return true;
	}

	@Override
	public void deleteArticle(int id) {
		entityManager.remove(findArticlebyId(id));
		
		
	}

	@Override
	public Article findArticlebyId(Integer idArticle) {
		Article article = null;

		article = entityManager.find(Article.class, idArticle);

		return article;
	}

	@Override
	public List<Article> findAllArticles() {
		Query query = entityManager.createQuery("select a from Articles a");
		return query.getResultList();
	}

}
