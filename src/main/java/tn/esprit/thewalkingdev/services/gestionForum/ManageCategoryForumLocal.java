package tn.esprit.thewalkingdev.services.gestionForum;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.CategoryForum;

@Local
public interface ManageCategoryForumLocal {
	public Boolean addCategoryForum(CategoryForum CategoryForum);
	public Boolean updateCategoryForum(CategoryForum CategoryForum);
	public Boolean deleteCategoryForum(CategoryForum CategoryForum);
	public CategoryForum findCategoryForumById(int idCategoryForum);
	public List<CategoryForum> findAllCategoryForum();

}
