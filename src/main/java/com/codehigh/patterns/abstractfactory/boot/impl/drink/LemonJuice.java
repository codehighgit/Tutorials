package com.codehigh.patterns.abstractfactory.boot.impl.drink;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class LemonJuice implements IDish {
    @Override
    public String prepare() {
        return "Lemon Juice is ready";
    }

    @Override
    public String name() {
        return "lemon";
    }

    @Override
    public String category() {
        return "drink"; //drinkableobejct
    }
}
