package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Brand;

@Remote
public interface BrandRemote {
	Boolean addBrand(Brand Brand);
	Boolean updateBrand(Brand Brand);
	Boolean deleteBrand(Brand Brand);
	Brand findBrandById(Integer idBrand);
	List<Brand> findAllBrands();
}
