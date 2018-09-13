package com.afrianpasa.builderpattern.models;

public class VegieBurger extends Burger {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Vegie Burger";
	   }
	}