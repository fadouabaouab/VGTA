package tn.esprit.thewalkingdev.services.manageBrand.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Brand;

@Remote
public interface BrandDAORemote {
	Boolean addBrand(Brand Brand);
	Boolean updateBrand(Brand Brand);
	Boolean deleteBrand(Brand Brand);
	Brand findBrandById(Integer idBrand);
	List<Brand> findAllBrands();
}
