package com.codehigh.patterns.factory;

/**
 * Author : Nishant Varshney
 */
public class Client {
    public static void main(String[] args){
        DishFactory.findDish("pizza").prepare();
    }
}