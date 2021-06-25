package com.adam.driver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.driver.models.License;
import com.adam.driver.models.Person;
import com.adam.driver.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	
	public List<License> allLicense(){
		return licenseRepository.findAll();
	}
	public License createLicense(License license) {
		license.setNumber(this.generateNumber());
		return licenseRepository.save(license);
	}
	public License findLicense(Long id) {
		Optional <License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		}
		else {
			return null;
		}
	}
	
	public String generateNumber() {
		License license = licenseRepository.findTopByOrderByNumberDesc();
		if (license== null) {
			return "000001";
		}
		float num = Float.parseFloat(license.getNumber());
		
		num++;
		num /= 1000000;
		String number = String.format("%.6f", num);
		return number.substring(2);
		

	}
	
	
}
