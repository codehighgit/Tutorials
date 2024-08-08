package com.codehigh.patterns.singleton;

/**
 * Author : Nishant Varshney
 */
public class Connection {
    private static Connection obj;

    private Connection(){}

    /*
        1st Way : Using Lazy Initilization
     */
   /* public static Connection getInstance()
    {
        if (obj == null)
            obj = new Connection(); //lazy Initilization
        return obj;
    }*/

    /*
     2nd Way : Thread Safe
    */

 /*   public static synchronized Connection getInstance()
    {
        if (obj == null)
            obj = new Connection();
        return obj;
    }
*/

    /*
     3rd Way : Thread Safe with mimimal locking
    */


/*
    public static Connection getInstance()
    {
        if (obj == null) {
            synchronized (Connection.class)
            { //synchronized only when you are creating an object
                if (obj == null)
                    obj = new Connection();
            }
        }
        return obj;
    }*/



     /*
     4th Way : Eager Object
    */

    private static Connection eagerObj = new Connection();

    public static Connection getInstance() { return eagerObj; }

}
