package com.order.management.model;

import javax.persistence.Entity;

@Entity
public class City {
    private Integer id;
	private String name;
    private String countrycode;
    private String text ;
    private Integer population;
}
