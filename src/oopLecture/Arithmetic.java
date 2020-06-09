package oopLecture;

// ======================== slide 5 (class fields)
public class Arithmetic {
//if get rid of static we would need to create a new object to access it called instance
    //field with static can access method instances like below (bag of tools and get tool by refering to the tool bag name

    // static property
    public static final double PI = 3.14159;

    // static methods
    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

}
