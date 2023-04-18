package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Bob", 3.0, "Audio");
        DVD myDvd = new DVD("Hunter", 8.0, "Movies");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCd.spinDisc();
        myDvd.spinDisc();
        System.out.println("\n");
        myCd.storeData("Hello World The Album!!!");
        myCd.readDisc();
    }
}
