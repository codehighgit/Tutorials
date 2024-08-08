package com.codehigh.patterns.singleton;

/**
 * Author : Nishant Varshney
 */
public class DBConnection {

    /*
      5th Way : Java specific using Inner Class
     */
    private DBConnection() {
        System.out.println("Instance created");
    }

    private static class Inner{
        private static final DBConnection INSTANCE=new DBConnection();
    }

    public static DBConnection getInstance()
    {
        System.out.println("I will get you the object");
        return Inner.INSTANCE;
    }
}
