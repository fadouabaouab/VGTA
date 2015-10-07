package tn.esprit.thewalkingdev.services.gestionMedia;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;
import javax.servlet.jsp.tagext.TryCatchFinally;

import tn.esprit.thewalkingdev.entites.Articles;

/**
 * Session Bean implementation class Managearticles
 */
@Stateless
public class Managearticles implements ManagearticlesRemote, ManagearticlesLocal {

	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;
	public Managearticles() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addArticles(Articles articles) {
		try {
			
			entityManager.persist(articles);
			return true;
			
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}		
	}

	@Override
	public Boolean updateArticles(Articles articles) {
		try {
			entityManager.merge(articles);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteArticles(Articles articles) {
		try {
			entityManager.remove(entityManager.merge(articles));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Articles findArticlesById(int idarticle) {
		Articles articles =null;
		try {
			articles=entityManager.find(Articles.class,idarticle);


		} catch (Exception e) {
			return null;
		}	
		return articles;}

	@Override
	public List<Articles> findAllArticles() {
		List<Articles> listArticles;
		Query query=entityManager.createNamedQuery("select a from Articles");
		return query.getResultList();
	}

}
