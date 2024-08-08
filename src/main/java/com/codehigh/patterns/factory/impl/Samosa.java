package com.codehigh.patterns.factory.impl;

import com.codehigh.patterns.factory.IDish;
import org.springframework.stereotype.Component;


public class Samosa implements IDish {
    @Override
    public void prepare() {
        System.out.println("Samosa is prepared");
        //Bowl the patotos
        //Keep the saucess with you...
    }
}
