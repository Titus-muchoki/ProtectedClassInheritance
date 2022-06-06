package org.example;

public class Main {
    protected String name = "myCity";
    protected String country = "australia";

    public void myHood() {
        System.out.println("one day i will be balling in australia");
    }
}
 class europe extends Main{
    private String myDream = "queensLand";
    public static void main (String [] args) {
        europe myObj = new europe();
        System.out.println(myObj.country);
        System.out.println(myObj.name);
        System.out.println(myObj.myDream);
        myObj.myHood();
    }
    }