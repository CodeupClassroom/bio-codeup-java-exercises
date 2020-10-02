import java.util.Scanner;

public class ControlStructuresLec {
    public static boolean canSellTobacco(int age) {
        System.out.println("Checking if cashier can sell tobacco.");
        return age >= 18;
    }

    public static boolean canSellAlcohol(int age) {
        System.out.println("Checking if cashier can sell alcohol.");
        return age >= 21;
    }

    public static void main(String[] args) {
        System.out.println("Control Structures Lec");

        int operatorId = 8922;
        int operatorAge = 16;

        boolean isSignedIn = operatorId == 8922;
        //This cannot work.
        //isSignedIn = operatorId == "8922";
        System.out.println("isSignedIn = " + isSignedIn);

        boolean isTerminated = operatorId != 8922;
        System.out.println("isTerminated = " + isTerminated);

        boolean isMinor = operatorAge < 18;
        System.out.println("isMinor = " + isMinor);

        //Will work the same as above.
        isMinor = operatorAge <= 17;
        System.out.println("isMinor = " + isMinor);

        boolean canSellTobacco = operatorAge > 17;
        System.out.println("canSellTobacco = " + canSellTobacco);

        boolean canSellAlcohol = operatorAge >= 21;
        System.out.println("canSellAlcohol = " + canSellAlcohol);

        boolean canProceed = isSignedIn && canSellAlcohol;
        System.out.println("Alcohol canProceed = " + canProceed);

        canProceed = isSignedIn && canSellTobacco;
        System.out.println("Tobacco canProceed = " + canProceed);

        boolean isRestrictedCashier = !canSellAlcohol || !canSellTobacco;
        System.out.println("isRestrictedCashier = " + isRestrictedCashier);

        boolean isUnrestrictedCashier = canSellTobacco(operatorAge) && canSellAlcohol(operatorAge);
        System.out.println("isUnrestrictedCashier = " + isUnrestrictedCashier);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue? [y/N] ");
//        String userInput = sc.next();

        // Don't do this!!!!!!1!!!11111!!!11
        //boolean confirmation = userInput == "y";
        //This is how we do it.
        //boolean confirmation = userInput.equals("y");
        //y or Y will be valid.
//        boolean confirmation = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
//
//        System.out.println("confirmation = " + confirmation);

        isTerminated = true;
        isSignedIn = false;
        if(!isTerminated && isSignedIn) {
            //If true run this code please!
            System.out.println("Start ringing items.");
        } else if (isTerminated) {
            System.out.println("Hasta la vista! You are terminated!");
        } else if (!isSignedIn) {
            System.out.println("You are not signed in. Please sign in.");
        } else {
            //If false run this code instead please.
            System.out.println("Cannot compute!");
        }

        int dayOfWeekNumber = 500;
        String dayOfWeek = "";

        switch (dayOfWeekNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                System.out.println("Setting the day string to Thursday.");
                dayOfWeek = "Thursday";
                break;
            case 6:
                System.out.println("Setting the day string to Friday.");
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Unknown";
                break;
        }

        System.out.println("Today is " + dayOfWeek);

        //While Loop
        int i = 0;

        while (i <= 10) {
            //While true keep running please
            System.out.println("While loop: i: " + i);
            i++;
        }

        int counter = 0;
        do {
            System.out.println("Do while loop: counter: " + counter);
            counter++;
        } while (counter <= 0);

        for(int x = 0; x < 10; x++) {
            System.out.println("The value of x: " + x);
        }

        //Break and continue
        for(int a = 0; a <= 10; a++) {  //<-
            if(a % 2 == 1) {            // |
                continue; //----------------
            } else if( a > 5 ) {
                break; // ---------------------
            }                               //|
                                            //|
            System.out.println("a = " + a); //|
        }                                   //|
        // <-----------------------------------
        System.out.println("Finished");
    }
}
