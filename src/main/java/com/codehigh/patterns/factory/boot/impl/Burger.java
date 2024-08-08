package com.codehigh.patterns.factory.boot.impl;

import com.codehigh.patterns.factory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */
@Component
public class Burger implements IDish {

    @Override
    public String prepare() {
        //Keepp the tomatoes
        //Keep the onion...
        return "Burger is prepared";
    }

    @Override
    public String name() {
        return "Burger";
    }
}
