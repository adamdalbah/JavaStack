package com.adam.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.languages.models.Language;
import com.adam.languages.repositories.languageRepository;

@Service
public class LanguageService {
	private final languageRepository langRepository;
	
	public LanguageService(languageRepository langRepository) {
		this.langRepository = langRepository;
	}
	
	public List<Language> allLanguages(){
		return langRepository.findAll();
	}
	
	public Language createLanguage(Language l) {
		return langRepository.save(l);
	}
	
	public Language findLanguge(Long id) {
		Optional<Language> optionalLanguge = langRepository.findById(id);
		if(optionalLanguge.isPresent()) {
			return optionalLanguge.get();
		}
		else {
			return null;
		}
	}
	
	public Language update(Language language) {
		return this.createLanguage(language);
	}
	public void delete(Long id) {
		langRepository.deleteById(id);
	}
}
