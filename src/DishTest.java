public class DishTest {
    public static void main(String[] args) {
        Dish d = new Dish();
        d.costInCents = 4500;
        d.nameOfDish = "Four Horsemen Burger";
        d.wouldRecommend = false;
        d.printSummary();
    }
}
