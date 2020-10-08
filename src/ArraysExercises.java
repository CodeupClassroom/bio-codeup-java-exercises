import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Fer");
        people[1] = new Person("Ana");
        people[2] = new Person("Betty");

        for (Person aPerson : people) {
            System.out.println("aPerson.getName() = " + aPerson.getName());
        }

        Person[] newArray = addPerson(people, new Person("Robert"));

        for (Person aPerson : newArray) {
            System.out.println("aPerson.getName() = " + aPerson.getName());
        }

    }

    public static Person[] addPerson(Person[] tempArray, Person personToAdd){
        tempArray = Arrays.copyOf(tempArray, tempArray.length+1);
        tempArray[tempArray.length-1] = personToAdd;
        return tempArray;
    }

}
