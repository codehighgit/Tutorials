package com.codehigh.patterns.factory.boot.impl;

import com.codehigh.patterns.factory.boot.IDish;
import org.springframework.stereotype.Component;

/**
 * Author : Nishant Varshney
 */

@Component
public class Colddrink implements IDish {
    @Override
    public String prepare() {
        return "";
    }

    @Override
    public String name() {
        return "Colddrink";
    }
}
