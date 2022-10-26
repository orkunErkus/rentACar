package kodlama.io.rentACarbusiness.concredes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACarbusiness.abstracts.BrandService;
import kodlama.io.rentACardataAccess.abstracts.BrandRepository;
import kodlama.io.rentACarentities.concredes.Brand;

@Service
public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		
		return brandRepository.getAll();
	}

}
