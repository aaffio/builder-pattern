package com.afrianpasa.builderpattern.models;

import com.afrianpasa.builderpattern.interfaces.Item;
import com.afrianpasa.builderpattern.interfaces.Packing;

public abstract class Burger implements Item {
   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}