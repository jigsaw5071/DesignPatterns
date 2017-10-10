package com.jigsaw5071;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGoogPrice(676.40);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(224.20);
        stockGrabber.setAaplPrice(2475.25);
        stockGrabber.setGoogPrice(1475.25);
    }
}
