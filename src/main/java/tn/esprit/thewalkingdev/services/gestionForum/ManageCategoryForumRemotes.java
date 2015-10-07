package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.CategoryForum;

@Remote
public interface ManageCategoryForumRemotes {
	public Boolean addCategoryForum(CategoryForum CategoryForum);
	public Boolean updateCategoryForum(CategoryForum CategoryForum);
	public Boolean deleteCategoryForum(CategoryForum CategoryForum);
	public CategoryForum findCategoryForumById(int idCategoryForum);
	public List<CategoryForum> findAllCategoryForum();

}
