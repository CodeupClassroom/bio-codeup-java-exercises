public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf(
                "Cost: %d%nName: %s%nRecommended: %b%n",
                costInCents,
                nameOfDish,
                wouldRecommend);
    }

    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        Math.random();
//        Math.floor();

//        Dish d = new Dish();
//        d.printSummary();
//        Dish.sayHowdy();
    }

}
