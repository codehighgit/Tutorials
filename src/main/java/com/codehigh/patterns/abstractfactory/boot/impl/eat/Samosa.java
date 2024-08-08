package com.codehigh.patterns.abstractfactory.boot.impl.eat;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class Samosa implements IDish {
    @Override
    public String prepare() {
        return "Samosa is preapred";
    }

    @Override
    public String name() {
        return "Samosa";
    }

    @Override
    public String category() {
        return "dish";
    }
}
