package collections;

import java.util.ArrayList;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Fernando");
        System.out.println(names.size());
        names.add("Daniel");
        names.add("Kenneth");

        System.out.println("names.get(0) = " + names.get(0));
//        System.out.println("names.get(1) = " + names.get(1));
//        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth"));
        if (names.contains("Fernando")) {
            System.out.println("names.get(2) = " + names.get(names.indexOf("Fernando")).toUpperCase());
        }


    }
}
