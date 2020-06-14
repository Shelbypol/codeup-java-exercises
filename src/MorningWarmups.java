public class MorningWarmups {
    public static void main(String[] args) {

       // Create a loop that prints out the numbers one through fifty
//        for(int i = 0; i <=50; i+=5){
//            System.out.println(i);
//        }

            int n = 100;
            for (int i=1; i<=n; i++) {
                if (i % 15 == 0)
                    System.out.println("FizzBuzz" + " ");

                else if (i % 5 == 0)
                    System.out.println("Buzz" + " ");

                else if (i % 3 == 0)
                    System.out.println("Fizz" + " ");

                else
                    System.out.println(i+" ");
            }
        }
    }


