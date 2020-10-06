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

            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
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
        int num = Integer.parseInt(input);
        return num;
    }

    public double getDouble(double min,double max){
        while (true) {
            System.out.printf("Please enter a number between %f and %f", min, max);

            String input = scanner.nextLine();
            double num = Double.parseDouble(input);
            if (num >= min && num <= max)
                return num;
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number");
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }
}
