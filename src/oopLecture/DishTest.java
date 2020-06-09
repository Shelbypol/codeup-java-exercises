package oopLecture;

public class DishTest {

    public static void main(String[] args) {

        Dish d1 = new Dish(.34, "Good Burger", true);
//        System.out.println(d1.costInCents);
//        System.out.println(d1.nameOfDish);
//        System.out.println(d1.wouldRecommend);

        System.out.println(DishTools.analyzeDishCost(d1.costInCents));
        System.out.println(DishTools.shoutDishName(d1.nameOfDish));
        System.out.println(DishTools.flipRecommendation(d1.wouldRecommend));

//            Dish dish1 = new Dish();
//            dish1.setCostInCents(.34);
//            dish1.setNameOfDish("Hotdog Delux");
//            dish1.setWouldRecommend(true);
//            dish1.printSummary();
        }
    }

