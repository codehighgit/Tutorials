package com.codehigh.patterns.abstractfactory.boot.impl.eat;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class DefaultCake implements IDish {

    @Override
    public String prepare() {
        return "Default Cake is prepared";
    }

    @Override
    public String name() {
        return "DefaultCake";
    }

    @Override
    public String category() {
        return "dish";
    }
}
