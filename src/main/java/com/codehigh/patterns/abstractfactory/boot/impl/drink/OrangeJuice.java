package com.codehigh.patterns.abstractfactory.boot.impl.drink;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class OrangeJuice implements IDish {
    @Override
    public String prepare() {
        return "Orange Juice is ready";
    }

    @Override
    public String name() {
        return "orange";
    }

    @Override
    public String category() {
        return "drink";
    }
}
