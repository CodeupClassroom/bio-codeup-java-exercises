public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, my name is %s.\n",this.name);
    }

    public static void main(String[] args) {
        Person bob = new Person("Bob");
        System.out.println("bob's name = " + bob.getName());
        bob.setName("Mando");
        bob.sayHello();

//        Person person1 = new Person("Micheal");
//        Person person2 = new Person("Micheal");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("Cory");
        Person person2 = person1;
        System.out.println(person1.getName()); // Cory
        System.out.println(person2.getName()); // Cory
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane

    }
}
