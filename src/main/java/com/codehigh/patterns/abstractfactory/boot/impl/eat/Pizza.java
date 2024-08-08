package com.codehigh.patterns.abstractfactory.boot.impl.eat;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class Pizza implements IDish {
    @Override
    public String prepare() {
        return "Pizza is prepared";
    }

    @Override
    public String name() {
        return "Pizza";
    }

    @Override
    public String category() {
        return "dish";
    }
}
