package com.codehigh.patterns.singleton;

/**
 * Author : Nishant Varshney
 */
public class Client {

    public static void main(String[] args){
        // Connection conObj = new Connection();
        Connection conObj1 = Connection.getInstance();
        Connection conObj2 = Connection.getInstance();
        System.out.println("conObj1 is :{}"+conObj1);
        System.out.println("conObj2 is :{}"+conObj2);

        DBConnection dbConObj1 = DBConnection.getInstance();
        DBConnection dbConObj2 = DBConnection.getInstance();
        System.out.println("dbConObj1 is :{}"+dbConObj1);
        System.out.println("dbConObj2 is :{}"+dbConObj2);
    }
}
