import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int range = 100 - 1 + 1;
        int numberToGuess = (int) ((Math.random() * range) + 1);
        System.out.println("numberToGuess = " + numberToGuess);
        game(numberToGuess, scan);
    }

    public static void game(int numberToGuess, Scanner scan){
        while(true){
            System.out.println("Guess a number between 1 and 100");
            short userInput = Short.parseShort(scan.nextLine());
            if( userInput > numberToGuess){
                System.out.println("LOWER");
            } else if (userInput < numberToGuess){
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS!");
                break;
            }
        }
    }
}
