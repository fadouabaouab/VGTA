package tn.esprit.thewalkingdev.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Brand;
import tn.esprit.thewalkingdev.services.contract.BrandLocal;
import tn.esprit.thewalkingdev.services.contract.BrandRemote;

/**
 * Session Bean implementation class BrandDAO
 */
@Stateless
public class BrandCrud implements BrandRemote, BrandLocal {

	@PersistenceContext
	EntityManager entityManager;

	public BrandCrud() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addBrand(Brand brand) {

		entityManager.persist(brand);
		return true;

	}

	@Override
	public Boolean updateBrand(Brand brand) {

		entityManager.merge(brand);
		return true;

	}

	@Override
	public Boolean deleteBrand(Brand brand) {

		entityManager.remove(entityManager.merge(brand));
		return true;

	}

	@Override
	public Brand findBrandById(Integer idBrand) {
		Brand brand = null;

		brand = entityManager.find(Brand.class, idBrand);

		return brand;
	}

	@Override
	public List<Brand> findAllBrands() {
		Query query = entityManager.createQuery("select e from Brand e");
		return query.getResultList();
	}

	@Override
	public List<Brand> search(String keyword) {
		Query query = entityManager.createQuery("select e from Brand e where  e.label like :kw");

		query.setParameter("kw", "%"+keyword+"%");
		
				
		return query.getResultList();
	}

}
