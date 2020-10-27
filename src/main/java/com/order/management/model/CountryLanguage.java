package com.order.management.model;

public class CountryLanguage {
    countrycode bpchar(3) NOT NULL,
	"language" text NOT NULL,
    isofficial bool NOT NULL,
    percentage float4 NOT NULL,

}
