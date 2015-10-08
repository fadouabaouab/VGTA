package tn.esprit.thewalkingdev.services.manageBrand;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.thewalkingdev.entites.Brand;
import tn.esprit.thewalkingdev.services.manageBrand.contract.BrandDAOLocal;
import tn.esprit.thewalkingdev.services.manageBrand.contract.BrandDAORemote;

/**
 * Session Bean implementation class BrandDAO
 */
@Stateless
public class BrandDAO implements BrandDAORemote, BrandDAOLocal {

	@PersistenceContext(unitName="vgta")
	   EntityManager entityManager ;
    public BrandDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addBrand(Brand brand) {
		
			entityManager.persist(brand);
			return true;
		
	}

	@Override
	public Boolean updateBrand(Brand brand) {
		try {
			entityManager.merge(brand);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteBrand(Brand brand) {
		try {
			entityManager.remove(entityManager.merge(brand));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Brand findBrandById(Integer idBrand) {
		Brand brand = null ;
		try {
			brand = entityManager.find(Brand.class, idBrand);
		} catch (Exception e) {
			
		}
		return brand;
	}

	@Override
	public List<Brand> findAllBrands() {
		Query query = entityManager.createQuery("select e from Brand e");
		return query.getResultList();
	}

}
