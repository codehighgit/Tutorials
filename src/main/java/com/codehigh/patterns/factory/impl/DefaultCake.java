package com.codehigh.patterns.factory.impl;

import com.codehigh.patterns.factory.IDish;
import org.springframework.stereotype.Component;


public class DefaultCake implements IDish {
    @Override
    public void prepare() {
        System.out.println("This is default cake");
    }
}
