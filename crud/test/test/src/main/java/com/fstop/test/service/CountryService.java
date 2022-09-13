package com.fstop.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstop.test.dao.countryDao;
import com.fstop.test.entity.country;


@Service
public class CountryService {
	@Autowired
	private countryDao countrydao;
	
	public country getCountryData(int id) {
		Optional<country> stu = countrydao.findById((long) id);
		return stu.get();
	}
}
