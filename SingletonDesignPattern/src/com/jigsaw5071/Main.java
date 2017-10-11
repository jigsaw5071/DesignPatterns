package com.jigsaw5071;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}
