package oopLecture;

public class OopLecture {

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)

//            Person rick1 = new Person();
//            rick1.firstName = "Rick";
//            rick1.lastName = "Smith";
//            System.out.println(rick1.firstName);
//            System.out.println(rick1.lastName);
//
//
//            Person rick2 = new Person();
//            rick2.firstName = "Rick";
//            rick2.lastName = "Smith";
//            System.out.println(rick2.firstName);
//            System.out.println(rick2.lastName);




        // -- Dog Example --

//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Sparky");


        // ======================== slide 5 (class fields)

//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));


        // -- DogHelper Example --

//        System.out.println(DogHelper.NUMBER_OF_DOG_BREEDS);


        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);


//        Person person = new Person();
//        person.name = "John Smith";
//        person.age = 32;
//
//        System.out.println(person.name);
//
//        Post post = new Post();
//        post.setTitle("A Day in the Life");
//        System.out.println(post.getTitle());
//        post.title = "A Day in the Life";
//        post.category = "Funny";
//        post.content = "I am what I am.";
//        post.createdAt = new Date();
//        post.editedAt = new Date();
//        post.author = person;








        // ======================== slide 8 (constructors)

//        Student s = new Student("Cathy Smith");
//        s.name = "Justin Reich";
//        s.cohort = "Lassen";

//        Student s1 = new Student("Justin Reich", "Lassen");
//        System.out.println(s1.name);
//        System.out.println(s1.cohort);




//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }

}

