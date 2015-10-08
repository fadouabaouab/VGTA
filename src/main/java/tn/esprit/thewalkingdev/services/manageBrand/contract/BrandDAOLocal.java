package tn.esprit.thewalkingdev.services.manageBrand.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Brand;

@Local
public interface BrandDAOLocal {
	Boolean addBrand(Brand Brand);
	Boolean updateBrand(Brand Brand);
	Boolean deleteBrand(Brand Brand);
	Brand findBrandById(Integer idBrand);
	List<Brand> findAllBrands();
}
