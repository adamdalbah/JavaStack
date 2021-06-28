package com.adam.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.countries.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	@Query("SELECT ci FROM City ci JOIN ci.country c WHERE c.name='Mexico' AND c.population > 500000 ORDER BY c.population DESC")
	List<City> mexicanCities();
	
	@Query("SELECT c.name, ci.name, ci.district, ci.population FROM City ci JOIN ci.country c WHERE c.name='Argentina' AND ci.district = 'Buenos Aires' AND c.population > 500000 ")
	List<Object[]> argentinaBuenous();
	
	
}
