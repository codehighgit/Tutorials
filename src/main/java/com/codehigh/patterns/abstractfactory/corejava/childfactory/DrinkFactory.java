package com.codehigh.patterns.abstractfactory.corejava.childfactory;

import com.codehigh.patterns.abstractfactory.corejava.IDish;
import com.codehigh.patterns.abstractfactory.corejava.impl.drink.LemonJuice;
import com.codehigh.patterns.abstractfactory.corejava.impl.drink.MangoJuice;
import com.codehigh.patterns.abstractfactory.corejava.impl.drink.OrangeJuice;
import com.codehigh.patterns.abstractfactory.corejava.impl.drink.Water;

/**
 * Author : Nishant Varshney
 */
public class DrinkFactory {

    public static IDish findDrink(String drinkType){
        return switch (drinkType) {
            case "mango" ->  new MangoJuice();
            case "orange" -> new OrangeJuice();
            case "lemon" -> new LemonJuice();
            default -> new Water();
        };
    }
}
