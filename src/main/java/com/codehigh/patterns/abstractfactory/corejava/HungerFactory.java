package com.codehigh.patterns.abstractfactory.corejava;

import com.codehigh.patterns.abstractfactory.corejava.childfactory.DishFactory;
import com.codehigh.patterns.abstractfactory.corejava.childfactory.DrinkFactory;

/**
 * Author : Nishant Varshney
 */
public class HungerFactory {

    public static IDish findDish(String mood,String type){
        return switch (mood) {
            case "eat" -> DishFactory.findDish(type);
            case "drink" -> DrinkFactory.findDrink(type);
            default -> throw new RuntimeException("We don't have anything for mood "+mood);
        };
    }
}
