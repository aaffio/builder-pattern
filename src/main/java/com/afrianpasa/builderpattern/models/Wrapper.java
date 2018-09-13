package com.afrianpasa.builderpattern.models;

import com.afrianpasa.builderpattern.interfaces.Packing;

public class Wrapper implements Packing {
   @Override
   public String pack() {
      return "Wrapper";
   }
}