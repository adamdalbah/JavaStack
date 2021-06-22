package com.adam.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.languages.models.Language;

@Repository
public interface languageRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();

}
