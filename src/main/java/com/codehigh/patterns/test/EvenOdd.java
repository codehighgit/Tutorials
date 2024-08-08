package com.codehigh.patterns.test;

/**
 * Author : Nishant Varshney
 */
public class EvenOdd {

    public final int counter = 20;
    public int i = 0;

    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (i <= counter) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    i = i + 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (i <= counter) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    i = i + 1;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }

    public static void main(String args[]){
        EvenOdd obj = new EvenOdd();
        Thread evenT = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread oddT = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printOdd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        evenT.start();
        oddT.start();
    }
}
