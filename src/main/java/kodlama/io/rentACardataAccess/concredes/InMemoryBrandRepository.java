package kodlama.io.rentACardataAccess.concredes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACardataAccess.abstracts.BrandRepository;
import kodlama.io.rentACarentities.concredes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands;
	
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(2,"mercedes"));
		brands.add(new Brand(3,"audi"));
		brands.add(new Brand(4,"fiat"));
		brands.add(new Brand(5,"renauld"));
	}


	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
