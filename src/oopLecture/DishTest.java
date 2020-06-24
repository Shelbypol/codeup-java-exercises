package oopLecture;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.setCostInCents(.34);
        dish1.setNameOfDish("Hotdog Delux");
        dish1.setWouldRecommend(true);
//        dish1.printSummary();

        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.flipRecommendation(dish1));
//        dish1.printSummary();


    }
}

