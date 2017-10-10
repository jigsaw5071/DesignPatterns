package com.jigsaw5071;

/*
* This Subject Interface deals with adding , deleting and updating observers
* */


public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
