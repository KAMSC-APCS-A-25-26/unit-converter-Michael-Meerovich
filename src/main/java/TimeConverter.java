import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        double hours, minutes, seconds;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run)
        {
            System.out.println ("Convert time to total seconds\n");
            System.out.print ("Enter hours:  ");
            hours = sc.nextDouble ();
            System.out.print ("\nEnter minutes:  ");
            minutes = sc.nextDouble ();
            System.out.print ("\nEnter seconds:  ");
        }
    }
}