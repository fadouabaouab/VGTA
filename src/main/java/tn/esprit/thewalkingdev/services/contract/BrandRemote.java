package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Brand;
import tn.esprit.thewalkingdev.entites.Equipment;

@Remote
public interface BrandRemote {
	Boolean addBrand(Brand Brand);
	Boolean updateBrand(Brand Brand);
	Boolean deleteBrand(Brand Brand);
	Brand findBrandById(Integer idBrand);
	List<Brand> findAllBrands();
	List<Brand> search(String keyword);
}
