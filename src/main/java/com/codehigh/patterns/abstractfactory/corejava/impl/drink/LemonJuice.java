package com.codehigh.patterns.abstractfactory.corejava.impl.drink;

import com.codehigh.patterns.abstractfactory.corejava.IDish;

/**
 * Author : Nishant Varshney
 */
public class LemonJuice implements IDish {
    @Override
    public void prepare() {
        System.out.println("Lemon Juice is ready");
    }
}