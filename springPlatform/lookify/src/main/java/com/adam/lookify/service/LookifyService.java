package com.adam.lookify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.lookify.models.Lookify;
import com.adam.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository lookifyRepository;
	
	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	
	public List<Lookify> allLookifies(){
		return lookifyRepository.findAll();
	}
	
	public Lookify createLookify(Lookify lookify) {
		return lookifyRepository.save(lookify);
	}
	
	public Lookify findLookify(Long id) {
		Optional<Lookify> optionalLookify = lookifyRepository.findById(id);
		if(optionalLookify.isPresent()) {
			return optionalLookify.get();
		}
		else {
			return null;
		}
	}
	
	public void delete(Long id) {
		lookifyRepository.deleteById(id);
	}
	
	public List<Lookify> findByName(String name) {
		List<Lookify> lookify= lookifyRepository.findByArtist(name);
		return lookify;
	}
	
}
