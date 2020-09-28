public class SyntaxLecture {

    public static void main(String[] args) {

        // ================== STATEMENTS

        // Statements may be...
            // Declarations
                int x;

            // Assignment expressions
                x = 3;

            // Any use of ++ or --
                x++;
                --x;

            // Method invocations
                Math.random();

            // Object creation expressions
//                 SomeObject = new SomeObject();

        // ================== COMMENTS

        // single line comment

        /*

            multi-line comment

         */

        /**
         * Comment block
         */

        // ================== DATA TYPES

            int primitiveExample = 3;

//            Student referenceExample = new Student();


            // use the smallest type needed for the job


            // primitive types...

                byte age = 32;
                short minimumAnnualSalary = 15080;
                int distanceToSaturn = 1200000000;
                long numberOfHumanCells = 37000000000000L; // L needed for compiler
                float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
                double widthOfAtomInMeters = .00000000001;
                char seatingSection = 'M'; // must wrap in single quotes
                boolean everythingIsAwesome = false;

            // strings (not a primitive type)

                String thisIsAString = "Hello";

//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting



        // ================== VARIABLES

        // declaration separate from initialization

            int seven;
            seven = 7;

        // declaration and initialization

            int eight = 8;



        // ================== IDENTIFIERS AND KEYWORDS

            // see curriculum


        // ================== CONSTANTS

            // see curriculum


        // ================== EXPRESSIONS

            // basically the same as JS


        // ================== OPERATORS

            // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS

            // basically the same as JS


        // ================== CASTING

            // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/

            // implicit casting - less to more precise (widening)

                float num1 = 2.22F;
                double num2 = num1;


            // explicit casting - more to less explicit casting (narrowing)

                double num3 = 3.1;
                float num4 = (float) num3;




    }

}
