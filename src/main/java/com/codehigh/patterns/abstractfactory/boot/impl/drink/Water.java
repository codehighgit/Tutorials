package com.codehigh.patterns.abstractfactory.boot.impl.drink;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class Water implements IDish {
    @Override
    public String prepare() {
        return "water is ready";
    }

    @Override
    public String name() {
        return "water";
    }

    @Override
    public String category() {
        return "drink";
    }
}
