package exceptions;
import util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsLesson {

    static String hello;
    static String[] colors = {"red","green","blue","yellow","orange","purple"};

    static void first() {
        System.out.println("Start First");
        second();
        System.out.println("Finish First");
    }
    static void second() {
        System.out.println("Start Second");
        dangerZone();
        System.out.println("Finish Second");
    }
    static void dangerZone() {
        System.out.println("Start dangerZone");

        // dangerous code goes here
        // ArrayIndexOutOfBoundsException
        System.out.println("Tenth color is: " + colors[9]);
        // NumberFormatException
        int numHello = new Integer("hello");
        Input input = new Input();
        int nameInt = input.getInt("Please enter you name:");
        System.out.println("nameInt = " + nameInt);
        // ArithmeticException
        int num = 1 / 0;
        // NullPointerException
        if (hello.equals("hello"))
            System.out.println("Hello!");
        // IllegalArgumentException
        for (String color:colors)
            System.out.printf("Hex value of %s is %s.\n",color,getColorHexValue(color));

        System.out.println("Finish dangerZone");
    }

    static String getColorHexValue(String colorName){
        switch (colorName.toLowerCase()) {
            case "red":
                return "110000";
            case "green":
                return "001100";
            case "blue":
                return "000011";
            default:
                throw new IllegalArgumentException("Unknown Color");
                // or RuntimeException
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");
        first();
        System.out.println("Program Finished Successfully. Yay!!");
    }

}




//class BIOException extends Exception {}
