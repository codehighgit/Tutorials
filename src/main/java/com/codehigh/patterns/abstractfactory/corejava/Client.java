package com.codehigh.patterns.abstractfactory.corejava;

/**
 * Author : Nishant Varshney
 */
public class Client {
    public static void main(String[] args){
        HungerFactory.findDish("eat","burger").prepare();
    }
}