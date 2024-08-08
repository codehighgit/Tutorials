package com.codehigh.patterns.factory.impl;

import com.codehigh.patterns.factory.IDish;
import org.springframework.stereotype.Component;


public class Burger implements IDish {
    @Override
    public void prepare() {
        System.out.println("Burger is prepared");
    }
}
