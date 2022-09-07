package com.fstop.test.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "countries")
@Entity
public class country {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;

}
