public class ArraysLec {

    public static void main(String[] args) {

        String[] names = {"Fer", "Douglas", "Daniel"};
        double[] prices = new double[3];

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

    }
}
