package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;
import javax.servlet.jsp.tagext.TryCatchFinally;

import tn.esprit.thewalkingdev.entites.CategoryForum;

/**
 * Session Bean implementation class ManageCategoryForum
 */
@Stateless
public class ManageCategoryForum implements ManageCategoryForumRemotes, ManageCategoryForumLocal {
 
	@PersistenceContext(unitName="vgta")
	EntityManager entityManager;
    public ManageCategoryForum() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addCategoryForum(CategoryForum CategoryForum) {
try {
	entityManager.persist(CategoryForum);
	return true;
} catch (Exception e) {
	return false;}		
	}

	@Override
	public Boolean updateCategoryForum(CategoryForum CategoryForum) {
 try {
	 entityManager.merge(CategoryForum);
		return true;

} catch (Exception e) {
	return false;
}
	}

	@Override
	public Boolean deleteCategoryForum(CategoryForum CategoryForum) {
		 try {
			entityManager.remove(entityManager.merge(CategoryForum));
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public CategoryForum findCategoryForumById(int idCategoryForum) {
CategoryForum CategoryForum =null;
try {
	CategoryForum=entityManager.find(CategoryForum.class,idCategoryForum);
		

} catch (Exception e) {
	return null;
}	
return CategoryForum;}

	@Override
	public List<CategoryForum> findAllCategoryForum() {
List<CategoryForum> listCategoryForum;
Query query=entityManager.createNamedQuery("select a from categoryForum");
return query.getResultList();
	}

}
