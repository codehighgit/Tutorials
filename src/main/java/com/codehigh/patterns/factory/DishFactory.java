package com.codehigh.patterns.factory;

import com.codehigh.patterns.factory.impl.Burger;
import com.codehigh.patterns.factory.impl.DefaultCake;
import com.codehigh.patterns.factory.impl.Pizza;
import com.codehigh.patterns.factory.impl.Samosa;

/**
 * Author : Nishant Varshney
 */
public class DishFactory {

    public static IDish findDish(String dishType){
        return switch (dishType) {
            case "samosa" -> new Samosa();
            case "burger" -> new Burger();
            case "pizza" -> new Pizza();
            default -> new DefaultCake();
        };
    }
}
