package com.afrianpasa.builderpattern.models;

import com.afrianpasa.builderpattern.interfaces.Packing;

public class Bottle implements Packing {
   @Override
   public String pack() {
      return "Bottle";
   }
}