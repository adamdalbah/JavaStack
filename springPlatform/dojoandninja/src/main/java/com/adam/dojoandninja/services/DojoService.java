package com.adam.dojoandninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.dojoandninja.models.Dojo;
import com.adam.dojoandninja.models.Ninja;
import com.adam.dojoandninja.repositories.DojoRepository;
import com.adam.dojoandninja.repositories.NinjaRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;

	public DojoService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}

	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}

	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}

	public Ninja findNinjaByID(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		return null;
	}

	public Dojo findDojoByID(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		return null;
	}
	
}
