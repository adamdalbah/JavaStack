package com.adam.countries.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adam.countries.models.City;
import com.adam.countries.models.Country;
import com.adam.countries.models.Language;
import com.adam.countries.services.ApiService;

@RestController
public class ApiController {
	private ApiService apiService;
	@RequestMapping("/{language}")
	public List<Object[]> Index(@PathVariable("language") String language) {
		return apiService.getContriesSpeaks(language);
	}

	@RequestMapping("/n")
	public List<Object[]> numberOfCities() {
		return apiService.numOfCities();
	}
	@RequestMapping("/percent")
	public List<Object[]> languagePercentage() {
		return apiService.languagePercentage();
	}
	@RequestMapping("/sri")
	public List<Country> surfaceRegion() {
		return apiService.surfaceRegion();
	}
	@RequestMapping("/govern")
	public List<Country> governSurfaceLife() {
		return apiService.governSurfaceLife();
	}
	@RequestMapping("/reg")
	public List<Object[]> findByRegion(){
		return apiService.findByRegion();
	}
	
	@RequestMapping("/mexico")
	public List<City> findMexicoCity() {
		return apiService.findMexicoCity();
	}
	@RequestMapping("/argentina")
	public List<Object[]> argentinaBuenos() {
		return apiService.argentinaBuenos();
	}
}
