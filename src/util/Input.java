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

    public boolean yesNo(){
        System.out.println("Please enter yes or no");
        String input = this.scanner.nextLine();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }


    public int getInt(int min,int max){
        while (true) {
            System.out.printf("Please enter an integer between %d and %d", min, max);

            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if (num >= min && num <= max)
                return num;
        }
    }
    public int getInt(){
        System.out.println("Please enter an integer");
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
