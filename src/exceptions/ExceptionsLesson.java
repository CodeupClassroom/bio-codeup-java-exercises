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
        try {
            // ArrayIndexOutOfBoundsException
//            System.out.println("Tenth color is: " + colors[9]);
            // NumberFormatException
//            int numHello = new Integer("hello");
            Input input = new Input();
            int nameInt = input.getInt("Please enter you name:");
            System.out.println("nameInt = " + nameInt);
            // ArithmeticException
            int numerator = 1, denominator = 0;
            int num = numerator / denominator;
            // NullPointerException
            if (hello.equals("hello"))
                System.out.println("Hello!");
            // IllegalArgumentException
            for (String color : colors)
                System.out.printf("Hex value of %s is %s.\n", color, getColorHexValue(color));
        } catch (ArrayIndexOutOfBoundsException aibex) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(aibex.getMessage());
        } catch (NumberFormatException nfex) {
            System.out.println("Number Format Exception");
            System.out.println(nfex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        }
        System.out.println("Finish dangerZone");
    }

    static String getColorHexValue(String colorName) {
        switch (colorName.toLowerCase()) {
            case "red": return "FF0000";
            case "green": return "00FF00";
            case "blue": return "0000FF";
            default: throw new IllegalArgumentException("Unknown Color");
                // or RuntimeException
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
//        first();
        if (Math.floor(Math.random()*3) == 0)
            throw new Exception("A problem happened");
        System.out.println("Program Finished Successfully. Yay!!");
    }

}

class BIOException extends Exception {}
