package com.codehigh.patterns.abstractfactory.boot.impl.eat;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */
@Component
public class Burger implements IDish {

    @Override
    public String prepare() {
        return "Burger is prepared";
    }

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public String category() {
        return "dish"; //eatable objects
    }
}
