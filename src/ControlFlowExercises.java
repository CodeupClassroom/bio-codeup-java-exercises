import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("Control Flow Exercise");
        // While

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // Do While
//        int counter = 0;
//
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);

//        int counter = 100;

//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);

        //Refactor to a for loop.
//        for(int counter = 100; counter >= -10; counter -= 5) {
//            System.out.println(counter);
//        }

//        long counter = 2;
//
//        do {
//            System.out.println(counter);
//            counter *= counter;
//            //counter = counter * counter;
//        } while (counter < 1000000L);

        //Refactor to a for loop.
//        for(long counter = 2; counter < 1000000; counter *= counter) {
//            System.out.println(counter);
//        }

        // FizzBuzz
//        for(int i = 1; i <= 100; i++) {
//
//            //if((i % 3 == 0) && (i % 5 == 0)) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // Table of powers
//        Scanner scanner = new Scanner(System.in);
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//                System.out.printf("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);


        Scanner scanner = new Scanner(System.in);
        boolean userContinues = true;

        do {
            System.out.print("Please enter a numerical grade from 0 to 100 ");

            int numericGrade = scanner.nextInt();

            /*
            A : 100 - 88
            B : 87 - 80
            C : 79 - 67
            D : 66 - 60
            F : 59 - 0
             */
            if(numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to enter another grade (y/n)?");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while(userContinues);

    }
}
