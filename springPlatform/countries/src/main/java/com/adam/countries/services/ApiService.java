package com.adam.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adam.countries.models.City;
import com.adam.countries.models.Country;
import com.adam.countries.repositories.CityRepository;
import com.adam.countries.repositories.CountryRepository;
import com.adam.countries.repositories.LanguageRepository;

@Service
public class ApiService {
	private final CityRepository cityRepository;
	private final CountryRepository countryRepository;
	private final LanguageRepository languageRepository;

	public ApiService(CityRepository cityRepository, CountryRepository countryRepository,
			LanguageRepository languageRepository) {
		this.cityRepository = cityRepository;
		this.countryRepository = countryRepository;
		this.languageRepository = languageRepository;
	}
	
	public List<Object[]> getContriesSpeaks(String lang){
		return this.countryRepository.findCountrySpeaks(lang);
	}
	
	public List<Object[]> numOfCities(){
		return this.countryRepository.findNumCitiesForCountry();
	}
		
	public List<Object[]> languagePercentage(){
		return this.countryRepository.findLanguagePercentage();
	}
	
	public List<Country> surfaceRegion(){
		return this.countryRepository.findBasedOnSurfaceAndPopulation();
	}
	
	public List<Country> governSurfaceLife(){
		return this.countryRepository.findBasedOnGovernAndSurfaceAndLife();
	}
	
	public List<Object[]> findByRegion(){
		return this.countryRepository.findByRegion();
	}
	
	public List<City> findMexicoCity(){
		return this.cityRepository.mexicanCities();
	}
	
	public List<Object[]> argentinaBuenos(){
		return this.cityRepository.argentinaBuenous();
	}
}
