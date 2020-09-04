import java.util.Scanner;
public class two {




        static int d;
        static void Average(){
            Scanner Grade = new Scanner(System.in);

            System.out.println("Number of Grades you want to enter");
            int length = Grade.nextInt();
            int[] arr = new int[length];
            for(int i=0;i<=length;i++)
            {
                System.out.println("To exit enter -1 to continue press any number");
                int a = Grade.nextInt();
                if(a == -1){
                    break;
                }
                System.out.println("you have selected to enter"+" "+length+"Grades");
                arr[i] =Grade.nextInt();
                d = d + i;
            }
            double total=0;
            for(int i=0; i<d; i++){
                total = total + arr[i];
            }
            double average = total /d;

            System.out.format("The average is: %.3f", average);
        }
        public static void main(String[] args) {
            Average();
        }
    }

