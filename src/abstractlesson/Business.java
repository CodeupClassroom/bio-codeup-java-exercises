package abstractlesson;

import abstractlesson.Accountant;

public class Business {
    public static void main(String[] args) {
        Employee[] employees = {
                new Accountant("Cindy"),
                new Developer("Mike"),
                new Manager("Anne", "Development")
        };

        for (Employee e : employees) {
            e.sayHello();
            e.doWork();
        }
    }

    // class -> extends
    // interface -> implements
    // abstract method cannot have implementation, must be overridden
    // abstract class cannot be instantiated, must be extended

}
