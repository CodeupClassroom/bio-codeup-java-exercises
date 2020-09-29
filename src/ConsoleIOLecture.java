import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {
        System.out.println("Console IO Lecture");
//
//        System.out.print("here");
//        System.out.print("there");
//
//        System.out.print("here\n");
//        System.out.print("there\n");
//
//        System.out.println("Hello" + " " + "World");
//        //Is the same
//        System.out.println("Hello " + "World");
//
//        System.out.printf("Hello ");
//        System.out.printf("World\n");
//
//        String name = "World";
//        System.out.printf("Hello %s\n", name);

        String myName = "Douglas";
        System.out.printf("Hello %s\n", myName);
        System.out.printf("Hello %S\n", myName); //All caps

        int number = 4;
        String typeOfPet = "cats";
        System.out.printf("I have %d %s.", number, typeOfPet);

        double dollars = 10.12345;
        System.out.printf("The cost of a typical drink at Starbucks is $%.2f.\n", dollars);

        //What about input?
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your first name.");
//        String firstName = sc.next();
//        System.out.printf("Hello, %s!\n", firstName);

//        System.out.println("Please enter your full name.");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Hello, %s %s %s!\n", firstName, middleName, lastName);

//        System.out.println("How old are you?");
//        int age = sc.nextInt();
//        System.out.printf("You are %s years old. Wow!", age);

        //Wait, I want the whole line! How do I do that?
        System.out.println("What is your favorite quote?");
        String quote = sc.nextLine();
        System.out.printf("Wow \"%s\" is a great quote.\n", quote);

    }
}
