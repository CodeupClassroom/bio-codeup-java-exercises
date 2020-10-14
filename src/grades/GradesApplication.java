package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student fer = new Student("Fer");
        Student douglas = new Student("Douglas");

        fer.addGrade(90);
        fer.addGrade(50);
        fer.addGrade(90);

        douglas.addGrade(100);
        douglas.addGrade(99);
        douglas.addGrade(99);
        douglas.addGrade(100);

        students.put("fmendozaro", fer);
        students.put("douglasCodeup", douglas);

//        System.out.println(fer.getName());
//        System.out.println(students.get("fmendozaro").getName());

        cli(students);
    }

    public static void cli(HashMap<String,Student> students){
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        for (String ghUsername : students.keySet()) {
            System.out.print(ghUsername+" ");
        }

        do {

            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String keyTyped = input.getString();

            if (students.containsKey(keyTyped)) {
                System.out.printf("Name: %s - GitHub Username: %s\n" +
                                "Current Average: %f\n",
                        students.get(keyTyped).getName(),
                        keyTyped,
                        students.get(keyTyped).getGradeAverage());
            } else {
                System.err.println("Sorry, no student found with the GitHub keyTyped of " + keyTyped);
            }
        } while (input.yesNo("Would you like to see another student? Y/N"));

        System.out.println("Goodbye, and have a wonderful day!");

    }
}
