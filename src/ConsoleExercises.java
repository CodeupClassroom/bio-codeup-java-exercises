import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("Console exercise");
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        //Explore the Scanner
        //Create the scanner
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your number.");
//        int number = sc.nextInt();
//        System.out.printf("The number entered was %s.", number);

//        System.out.println("Please enter 3 words");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("Your three words are %s %s %s.\n", word1, word2, word3);
//        sc.nextLine();
//
//        System.out.println("Tell me something.");
//        String something = sc.nextLine();
//        System.out.printf("%s is very interesting.", something);

        System.out.println("Please enter the length of the classroom.");
        int length = parseInt(sc.nextLine());

        System.out.println("Please enter the width of the classroom.");
        int width = parseInt(sc.nextLine());

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The perimeter is: %d\n", perimeter);

    }
}
