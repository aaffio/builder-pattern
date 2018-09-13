package com.afrianpasa.builderpattern.models;

import com.afrianpasa.builderpattern.interfaces.Item;
import com.afrianpasa.builderpattern.interfaces.Packing;

public abstract class Drink implements Item {
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}