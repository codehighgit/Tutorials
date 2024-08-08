package com.codehigh.patterns.factory.boot.impl;

import com.codehigh.patterns.factory.boot.IDish;
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
}
