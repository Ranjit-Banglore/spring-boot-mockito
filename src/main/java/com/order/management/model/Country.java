package com.order.management.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;
    private float surfacearea;
    private Integer indepyear;
    private Integer population;
    private Float lifeexpectancy;
    private Integer gnp;
    private Integer gnpold;
    private Integer localname;
    private String governmentform;
    private String headofstate;
    private Integer capital;
    private String code2;
}
