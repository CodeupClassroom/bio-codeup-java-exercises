public class DishTest {
    public static void main(String[] args) {
        Dish dish = new Dish();
        dish.costInCents = 4500;
        dish.nameOfDish = "Four Horsemen Burger";
        dish.wouldRecommend = false;
        dish.printSummary();

        System.out.println("=============");

        DishTools.analyzeDishCost(dish);
        DishTools.shoutDishName(dish);
        DishTools.flipRecommendation(dish);
        dish.printSummary();

    }
}
