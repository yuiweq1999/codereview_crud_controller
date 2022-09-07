package com.fstop.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstop.test.entity.country;

public interface countryDao extends JpaRepository<country, Long>{

}
