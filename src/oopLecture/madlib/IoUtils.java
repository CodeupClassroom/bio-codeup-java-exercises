package oopLecture.madlib;

import java.util.Scanner;

/**
 * A class that offers methods to handle user IO.
 */
public class IoUtils {

    private static Scanner sc;
    private static String outputMode = "sout";

    public static Scanner getScanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }

    // if passed string is null, set to default
    public static String nullCoalesceStr(String str, String defaultStr) {
        return (str == null) ? defaultStr : str;
    }

    public static void output(String str) {
        switch (outputMode) {
            case "sout": {
                System.out.println(str);
                break;
            }
            case "html": {
                // write html
                break;
            }
            case "file": {
                // write to file
                break;
            }
            // additional implementations of output
        }
    }

}
