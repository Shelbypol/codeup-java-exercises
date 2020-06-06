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

    public static int times(int a, int b){
        int result = 1;
        for(int i = 0; i <= a ; i++){
            result = a * b
        }
    }


    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(3, 2));
        System.out.println(multiplication(3, 2));
        System.out.println(division(6, 0));
        System.out.println(modulus(20, 2));
    }
}
