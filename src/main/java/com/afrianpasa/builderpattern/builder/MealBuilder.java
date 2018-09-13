package com.afrianpasa.builderpattern.builder;

import com.afrianpasa.builderpattern.models.ChickenBurger;
import com.afrianpasa.builderpattern.models.Coke;
import com.afrianpasa.builderpattern.models.Fanta;
import com.afrianpasa.builderpattern.models.Meal;
import com.afrianpasa.builderpattern.models.VegieBurger;

public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegieBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Fanta());
      return meal;
   }
}