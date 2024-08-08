package com.codehigh.patterns.abstractfactory.boot.impl.drink;

import com.codehigh.patterns.abstractfactory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */
@Component
public class MangoJuice implements IDish {
    @Override
    public String prepare() {
        return "Mango Juice is ready";
    }

    @Override
    public String name() {
        return "mango";
    }

    @Override
    public String category() {
        return "drink";
    }
}
