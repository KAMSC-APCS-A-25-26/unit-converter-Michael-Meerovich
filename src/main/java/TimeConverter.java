import java.util.Scanner;
import java.lang.String;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        int hours, minutes, seconds, hourseconds, minuteseconds, total;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run) {
            System.out.println("Convert time to total seconds\n");
            System.out.print("Enter hours:  ");
            hours = sc.nextInt();
            System.out.print("Enter minutes:  ");
            minutes = sc.nextInt();
            System.out.print("Enter seconds:  ");
            seconds = sc.nextInt();

            hourseconds = hours * 3600;
            minuteseconds = minutes * 60;
            total = hourseconds + minuteseconds + seconds;

            System.out.println("\nTime Conversion:  ");
            System.out.println ("Input: " + hours + " hour, " + minutes + " minute, and " + seconds + " second");
            System.out.println ("Total seconds: " + total + " seconds\n");

            System.out.println ("Calculation:");
            System.out.println(hours + " hours * 3600 = " + hourseconds + " seconds");
            System.out.println(minutes + " minutes * 60 = " + minuteseconds + " seconds");
            System.out.println(seconds + " seconds = " + seconds + " seconds");
            System.out.println("Total: " + total + " seconds\n");

            System.out.print("Do you want to convert another time?  (y/n):  ");
            char repeat = sc.next().charAt(0);
            if (repeat == 'y')
            {
                run = true;
                System.out.println();
            }
            else
            {
                run = false;
                System.out.print ("\nGoodbye!");
            }
        }
    }
}