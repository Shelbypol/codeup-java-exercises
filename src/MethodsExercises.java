public class MethodsExercises {

    //addition
    public static int addition(int a, int b) {
        return (a + b);
    }

    //subtraction
    public static int subtraction(int a, int b) {
        return (a - b);
    }

    //multiplication
    public static int multiplication(int a, int b){
        return (a * b);
    }

    //division
    public static int division(int a, int b){
        return (a / b);
    }

    //modulus
    public static int modulus(int a, int b){
        return (a % b);
    }

    //bonus
    private static int multiply(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (y > 0) {
            System.out.println("x " + x);
            System.out.println("y " + y);

            int count = x + multiply(x, y - 1);

            System.out.println("count " + count);

            return count;
        }
        return multiply(x, y);
    }


    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 2));
//        System.out.println(multiplication(3, 2));
//        System.out.println(division(6, 2));
//        System.out.println(modulus(20, 2));
//        System.out.println("times for loop " + times(2, 3));
        System.out.println("answer "+ multiply(4,10));
    }
}
