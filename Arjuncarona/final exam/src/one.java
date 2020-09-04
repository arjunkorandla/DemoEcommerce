import java.text.DecimalFormat;
import java.util.Scanner;




public class one {


        //sum stands for sum of grades
        public static double sum;
        //avg stands for average of grades
        public static  double avg;
        //count stands for number of grades
        public static int count;

        private static DecimalFormat df2=new DecimalFormat("#0.00");





        public static double average(int a[])
        {
            for (int i=0;i<a.length;i++ ) {
                if(a[i]==-1)
                {
                    break;
                }
                else
                {

                    sum=sum+a[i];
                    count++;
                }

            }
            avg=sum/count;
            return avg;
        }

        public static void main(String[] args) {


            int average=0;
//arr stands for array which stores user grades
            int[] arr=new int[20];

            Scanner sc=new Scanner(System.in);

            System.out.println("enter your test grades");
            for (int i=0;i<arr.length ;i++ ) {
                arr[i]=sc.nextInt();
                if(arr[i]==-1)
                {
                    break;
                }
            }
            avg=average(arr);
            System.out.println("average of grades="+df2.format(avg));
        }
    }

