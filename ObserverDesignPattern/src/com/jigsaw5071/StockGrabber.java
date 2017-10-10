package com.jigsaw5071;

import java.util.ArrayList;

/***
 * uses the subject interface to update all the observers
 */


public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver){
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
    }

    @Override
    public void notifyObserver(){
        //cycles through all observers associated with this srockgrabber and update them all
        for(Observer observer : observers){
            observer.update(ibmPrice,aaplPrice,googPrice);
        }
    }

    /*
    * Changes Price for all stocks and notifies observers of changes
    * */
    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
