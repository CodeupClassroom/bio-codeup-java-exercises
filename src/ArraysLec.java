import java.util.Arrays;

public class ArraysLec {

    public static void main(String[] args) {

        String[] names = {"Fer", "Douglas", "Daniel"};
        double[] prices = new double[3];
        int[] numbers = new int[8];
        int[] otherNumbers = new int[8];
        Person[] persons = new Person[2];

        persons[0] = new Person("Fer");
        persons[1] = new Person("Nando");

        prices[0] = Double.parseDouble("1.0");
        prices[1] = 2.0 * 2;
        prices[2] = 3.0;

        System.out.println("names = " + names.length);

//        System.out.println("prices = " + prices);

//        System.out.println(names[0]);
//        System.out.println(names[2]);

        System.out.println("prices = " + prices.length);

//        System.out.println("prices[0] = " + prices[0]);
//        System.out.println("prices[2] = " + prices[2]);

        for (int i = 0; i < prices.length; i++){
            System.out.println("prices[i] = " + prices[i]);
        }

        for (String name: names) {
            System.out.println("name = " + name);
        }

        Arrays.sort(prices);
        Arrays.sort(names);

        System.out.println("Arrays.names = " + Arrays.toString(names));
        System.out.println("Arrays.prices = " + Arrays.toString(prices));

        Arrays.fill(numbers, 10);
        Arrays.fill(otherNumbers, 5);

        System.out.println("Arrays.equals(otherNumbers, otherNumbers) = " + Arrays.equals(otherNumbers, otherNumbers));
        System.out.println("Arrays.equals(numbers, otherNumbers) = " + Arrays.equals(numbers, otherNumbers));
        System.out.println("Arrays.toString() = " + Arrays.toString(numbers));

//        String[] copyOfNames = new String[names.length+1]; // you have to bring each item manually
        String[] copyOfNames = Arrays.copyOf(names, names.length+1);

        System.out.println("copyOfNames = " + copyOfNames.length);
        copyOfNames[3] = "Justin";
        System.out.println("Arrays.toString(copyOfNames) = " + Arrays.toString(copyOfNames));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// access the first element in the second row
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int cell : row) {
                System.out.print(cell + " | ");
            }

            System.out.println();
        }
//
//        System.out.println("matrix.length = " + matrix.length);

//        for (int x= 0 ; x < matrix.length ; x++) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int y= 0 ; y < matrix.length ; y++) {
//                System.out.print(matrix[x][y] + " | ");
//            }
//
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");

        for (Person person: persons) {
            person.sayHello();
            System.out.println("Hi " + person.getName() + " welcome to my world");
        }

    }
}
