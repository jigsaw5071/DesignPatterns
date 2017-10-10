package com.jigsaw5071;

/**
 * This class represents all the observers that are monitoring changes in the subject
 * */

public class StockObserver implements Observer {
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int ObserverIdTracker = 0;
    private int observerId ; // this is used to track the observers

    private Subject stockGrabber; // this keeps the reference to the StockGrabber Object(Any base class can hold ref to sub class)

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerId = ++ObserverIdTracker;
        System.out.println("New Observer added : " + this.observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice , double aaplPrice , double googPrice){
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println("Observer :" + observerId + "  ==> IBM : " + ibmPrice + " AAPL : " + aaplPrice + " GOOG : " + googPrice);
    }
}
