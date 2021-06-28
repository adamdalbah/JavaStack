package com.adam.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	@Query("SELECT c.name, l.language, l.percentage FROM Country c INNER JOIN c.languages l WHERE l.language = ?1 ORDER BY l.percentage DESC")
	List<Object[]> findCountrySpeaks(String language);

	@Query("SELECT c.name, COUNT(ci.id) AS num_cities FROM Country c JOIN c.cities ci GROUP BY c.id ORDER BY num_cities DESC")
	List<Object[]> findNumCitiesForCountry();
	
	@Query("SELECT l.language, l.percentage FROM Country c INNER JOIN c.language l WHERE l.percentaga > 0.89 GROUP BY l.percentage ORDER BY l.percentage DESC")
	List<Object[]> findLanguagePercentage();

	@Query("SELECT c FROM Country c WHERE c.surface_area < 501 AND c.population > 100000")
	List<Country> findBasedOnSurfaceAndPopulation();
	
	@Query("SELECT c FROM Country c WHERE c.government_form='Constitutional Monarchy' AND c.surface_area > 200 AND c.life_expectancy > 75")
	List<Country> findBasedOnGovernAndSurfaceAndLife();
	
	@Query("SELECT c.region, COUNT(c.id) AS num_countries FROM Country c  GROUP BY c.region ORDER BY num_contries DESC")
	List<Object[]> findByRegion();
}
