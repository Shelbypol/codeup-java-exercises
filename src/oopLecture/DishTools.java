package oopLecture;

public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static String shoutDishName(Dish d){
        return d.getNameOfDish().toUpperCase();
    }

    public static String analyzeDishCost(Dish d){
        if(d.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS){
            return "More expensive than average";
        }else{
            return "Less expensive than average";
        }
    }

    public static boolean flipRecommendation(Dish d){
        return !d.getWouldRecommend();
    }

}
