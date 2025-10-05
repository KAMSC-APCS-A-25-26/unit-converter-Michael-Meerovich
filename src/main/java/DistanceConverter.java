import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles
        // , 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        double distance;
        int choice;
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run)
        {
            System.out.println ("--- Distance Converter ---");
            System.out.println ("1. Convert Miles to Kilometers");
            System.out.println ("2. Convert Kilometers to Miles");
            System.out.println ("3. Exit");
            System.out.print ("\nEnter choice:  ");
            choice = sc.nextInt ();
            switch(choice)
            {
                case 1:
                    System.out.print ("Enter distance in miles:  ");
                    distance = sc.nextDouble ();
                    System.out.println ("\nConversion Results:");
                    System.out.println ("Miles: " + distance);
                    distance *= 1.60935;
                    System.out.println ("kilometers: " + distance + "\n");
                    break;
                case 2:
                    System.out.print ("\n\nEnter distance in kilometers:  ");
                    distance = sc.nextDouble ();
                    System.out.println ("\nConversion Results:");
                    System.out.println ("Kilometers:" + distance);
                    distance /= 1.60935;
                    System.out.println ("Miles: " + distance + "\n");
                    break;
                case 3:
                    run = false;
                    System.out.println ("\nGoodbye!");
                    break;
            }
        }
    }
}