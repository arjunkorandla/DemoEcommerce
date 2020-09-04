public class three {

        public static void main(String[] args)
        {
            String[] names = {
                    "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                    "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
            };

            int[] times = {
                    341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
            };

            int firstplace = times[0];
            String firstname = names[0];

            int secondplace = times[0];
            String secondname = names[0];

            for (int counter = 0; counter < times.length; counter++)
            {
                if (times[counter] < firstplace) {
                    firstplace = times[counter];
                    firstname = names[counter]; }
            }

            for (int counter = 0; counter < times.length; counter++)
            {
                if (times[counter] > firstplace)
                    if (times[counter] < secondplace) {
                        secondplace = times[counter];
                        secondname = names[counter]; }
            }
            System.out.printf("The fastest runner is: %s (%d Minutes)%n", firstname, firstplace);
        } // end main
    } // end class Lab

