public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish d) {
        System.out.println(d.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish d) {
        String message = (d.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) ? "Less expensive than average" : "More expensive than average";
        System.out.println(message);
    }

    public static void flipRecommendation(Dish d) {
        d.wouldRecommend = !d.wouldRecommend;
    }

}
