package com.codehigh.patterns.abstractfactory.corejava.childfactory;

import com.codehigh.patterns.abstractfactory.corejava.IDish;
import com.codehigh.patterns.abstractfactory.corejava.impl.eat.Burger;
import com.codehigh.patterns.abstractfactory.corejava.impl.eat.DefaultCake;
import com.codehigh.patterns.abstractfactory.corejava.impl.eat.Pizza;
import com.codehigh.patterns.abstractfactory.corejava.impl.eat.Samosa;

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
