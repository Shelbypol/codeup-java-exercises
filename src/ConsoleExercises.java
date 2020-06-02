import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        System.out.printf("Your number is %d", num);
//        System.out.println("Enter three words:");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("%n%s%n%s%n%s%n ", word1, word2, word3);

//        System.out.println("Enter a sentence");
//        String sentence1 = sc.nextLine();
//        System.out.printf("Your sentence is: %s", sentence1);

        System.out.println("In words enter the length and width of your classroom");
        String stringLength = sc.nextLine();
        String stringWidth = sc.nextLine();

        int length = Integer.parseInt(stringLength);
        int width = Integer.parseInt(stringWidth);

        System.out.printf("The length of the classroom is: %s%nThe width of the classroom is: %s%nThe area of the classroom is: %d%nThe perimeter of the classroom is: %d", stringLength, stringWidth, length*width, ((length*2)+(width*2)));






//        int length = sc.nextInt();
//        int width = sc.nextInt();
//
//        System.out.printf("The length of the classroom is: %s%nThe width of the classroom is %s%nThe area of the classroom is %d%nThe perimeter of the classroom is %d", length, width, length*width, ((length*2)+(width*2)));


    }
}
