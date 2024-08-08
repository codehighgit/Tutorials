package com.codehigh.patterns.factory.impl;

import com.codehigh.patterns.factory.IDish;
import org.springframework.stereotype.Component;


public class Pizza implements IDish {
    @Override
    public void prepare() {
        System.out.println("Pizza is prepared");
        //
    }
}
