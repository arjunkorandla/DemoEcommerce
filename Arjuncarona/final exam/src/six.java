import java.util.Scanner;

public class six {

    static class empoyee_class {
        String name = " ";
        int age;
        private double salary;
        double time;

        public void setName(String name) {
            System.out.println( "Employee Name:"+ name);


        }

        public void setSalary(double salary) {


            System.out.println("Employee salry:  " + salary);

        }

        public void setTime(double time) {





        }

        public void setAge(int age) {


        }

        public void callovertime()

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your age :  ");

            int age = sc.nextInt();
            System.out.println("Please enter your working hours :  ");
            double hoursperday = sc.nextInt();
            double salary = 200;
            System.out.println(name);
            System.out.println(salary);
            System.out.println(age);
            System.out.println(time);


            if (hoursperday > 8 & age > 30) {

                System.out.println(20 *salary);
            }

        }


    }

        static class my_main_class extends empoyee_class {


            /*public void setName(String name) {
                super.setName(name = "john");
                super.age = 30;
                super.setSalary(200);
                super.time = 45;
                System.out.println(name);
                System.out.println(age);
                double setSalary = 200;
                System.out.println(setSalary);
                System.out.println(time);*/

            }



        public static void main(String[] args) {

        my_main_class obj = new my_main_class();
        obj.setName("Abay");
        obj.setSalary(200);
        obj.setAge(33);
        obj.setTime(45);
        obj.callovertime();




        }




}

