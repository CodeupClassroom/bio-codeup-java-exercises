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
        try {
            dangerZone();
        } catch (BIOException bex) {
            bex.printStackTrace();
        }
        System.out.println("Finish Second");
    }
    static void dangerZone() throws BIOException{
        System.out.println("Start dangerZone");
        try {
            // dangerous code goes here
//            hello.length();
        } catch (NullPointerException nex) {
            nex.printStackTrace();
        } finally {
            System.out.println("Finish dangerZone");
        }
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
        first();
//        if (Math.floor(Math.random()*3) == 0)
//            throw new Exception("A problem happened");
        System.out.println("Program Finished Successfully. Yay!!");
    }

}

class BIOException extends Exception {}
