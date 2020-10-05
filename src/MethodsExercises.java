import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("(3 == sum(1,2)) = " + (3 == sum(1,2)));
        System.out.println("(3 == sum(1,4)) = " + (3 == sum(1,4)));

        System.out.println("(3 == subtract(4, 1)) = " + (3 == subtract(4, 1)));

        System.out.println("(9 == multiplication(3, 3)) = " + (9 == multiplication(3, 3)));

        System.out.println("(2 == division(10, 5)) = " + (2 == division(10, 5)));

        System.out.println("(1 == modulus(5, 2)) = " + (1 == modulus(5, 2)));

//        System.out.println("getInteger(1,10) = " + getInteger(1, 10));
//        System.out.println("getInteger(5, 8) = " + getInteger(5, 8));

//        while(true){
//            System.out.println("factorial() = " + factorial());
//            System.out.println("Do you want to continue? y/n");
//            String answer = scan.nextLine();
//            if(answer.equalsIgnoreCase("n")){
//                System.out.println("Ok, bye");
//                break;
//            }
//        }

        rollDice(scan);

    }

    public static double sum(double arg1, double arg2){
        return arg1+arg2;
    }

    public static double subtract(double arg1, double arg2){
        return arg1-arg2;
    }

    public static double multiplication(double arg1, double arg2){
        return arg1*arg2;
    }

    public static double division(double arg1, double arg2){
        return arg1/arg2;
    }

    public static double modulus(double arg1, double arg2){
        return arg1 % arg2;
    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number between " +  min + " and " + max);
        int userInput = Integer.parseInt(scan.nextLine());

        if(userInput < min){
            System.out.println("This number is lower than " + min);
            return getInteger(min, max);
        } else if ( userInput > max) {
            System.out.println("This number is bigger than " + max);
            return getInteger(min, max);
        }

        return userInput;
    }

    public static long factorial(){
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= userInput; counter++){
            output *= counter;
        }

        return output;
    }

    public static void randomize(short sides){
        System.out.println( (int) Math.floor(Math.random() * sides) );
        System.out.println( (int) Math.floor(Math.random() * sides) );
    }

    public static void rollDice(Scanner scan){
        while(true){
            System.out.println("Roll Dice method");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Ok, bye");
                break;
            }
        }
    }

}
