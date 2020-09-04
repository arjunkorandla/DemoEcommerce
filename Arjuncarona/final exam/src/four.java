import java.util.Scanner;

public class four {
    public static void main(String[] args) {


        int[] num = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int number = sc.nextInt();

            System.out.println("Odd Numbers:");
            if (number>0 ) {
                for (int i = 0; i < num.length; i++) {
                    if (num[i] % 2 != 0) {
                        System.out.println(num[i]);
                    }
                }
                System.out.println("Even Numbers:");
                for (int i = 0; i < num.length; i++) {
                    if (num[i] % 2 == 0) {
                        System.out.println(num[i]);
                    }
                }
            }
            else if (number<0) {
                System.out.println("Plesse enter the valid input greater than 0");
            }
            else
            {
                System.out.println("invalid number and code extited");
            }
        }


    }
