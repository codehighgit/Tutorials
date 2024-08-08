package com.codehigh.patterns.abstractfactory.boot;

public interface IHungerMood {
    String onMood();
    IDish get(String type);
}
