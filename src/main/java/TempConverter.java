import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        double temperature;
        int choice;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while (run)
        {
            System.out.println ("--- Temperature Converter ---");
            System.out.println ("1. Convert Fahrenheit to Celsius");
            System.out.println ("2. Convert Celsius to Fahrenheit");
            System.out.println ("3. Exit");
            System.out.print ("\nEnter choice:  ");
            choice = sc.nextInt ();
            switch(choice)
            {
                case 1:
                    System.out.print ("Enter temperature in Fahrenheit:  ");
                    temperature = sc.nextDouble ();
                    System.out.println ("\nConversion Results:");
                    System.out.println ("Fahrenheit: " + temperature);
                    temperature -= 32;
                    temperature *= (5.0/9.0);
                    System.out.print ("Celsius: " + temperature + "\n\n");
                    break;
                case 2:
                    System.out.print ("Enter the temperature in Celsius:  ");
                    temperature = sc.nextDouble ();
                    System.out.println ("\nConversion Results:");
                    System.out.println ("Celsius: " + temperature);
                    temperature *= (9.0/5.0);
                    temperature += 32;
                    System.out.print ("Fahrenheit: " + temperature + "\n\n");
                    break;
                case 3:
                    run = false;
                    System.out.println ("\nGoodbye!");
                    break;
            }
        }
    }
}