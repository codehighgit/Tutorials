package com.codehigh.patterns.abstractfactory.corejava.impl.eat;

import com.codehigh.patterns.abstractfactory.corejava.IDish;


public class Samosa implements IDish {
    @Override
    public void prepare() {
        System.out.println("Samosa is prepared");
    }
}
