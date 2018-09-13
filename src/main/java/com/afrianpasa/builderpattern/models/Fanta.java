package com.afrianpasa.builderpattern.models;

public class Fanta extends Drink {

	   @Override
	   public float price() {
	      return 35.0f;
	   }

	   @Override
	   public String name() {
	      return "Fanta";
	   }
	}