package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        return yesNo("Please enter yes or no");
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }

    public int getInt(int min,int max){

        return getInt(min,max,"Please enter an integer between "+min+" and "+max);

    }
    public int getInt(int min,int max,String prompt){
        while (true) {
            System.out.println(prompt);
            int num;
            try {
                String input = scanner.nextLine();
                num = Integer.parseInt(input);
//            int num = scanner.nextInt();
            } catch (RuntimeException re) {
                System.err.println("You must enter an integer.");
                return getInt(min,max,prompt);
            }
                if (num >= min && num <= max)
                    return num;
        }
    }

    public int getInt(){
        return getInt("Please enter an integer");
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();

        int num;
        try {
//            num = Integer.valueOf(input);
            num = Integer.parseInt(input);
        } catch (NumberFormatException nfex) {
            System.err.println("You must enter an integer.");
            return getInt(prompt);
        }
        return num;
    }

    public double getDouble(double min,double max) {
        return getDouble(min,max,"Please enter a number between "+min+" and "+max);
    }

    public double getDouble(double min,double max,String prompt){
        while (true) {
            System.out.printf(prompt);

            String input = scanner.nextLine();
            double num;
            try {
                num = Double.parseDouble(input);
            } catch (NumberFormatException nfex) {
                System.err.println("You must enter a number.");
                return getDouble(min,max,prompt);
            }
            if (num >= min && num <= max)
                return num;
        }
    }

    public double getDouble(){
        return getDouble("Please enter a number");
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException nfex) {
            System.err.println("You must enter a number.");
            return getDouble(prompt);
        }
    }
}
