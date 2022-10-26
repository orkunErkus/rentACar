package kodlama.io.rentACarwebApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACarbusiness.abstracts.BrandService;
import kodlama.io.rentACarentities.concredes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {

		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {

		return brandService.getAll();
	}
}
