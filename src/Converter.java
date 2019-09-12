
//Converter.class
//Al-Karam:Ali:CSC122812
//Submission 06
//Temperature Conversion, Part 6

/*
I tested out all the test values in the sample solution and got the same
results with no errors.
 */
import java.util.Scanner;

/**
 * A class that converts Fahrenheit temperatures to Celsius temperatures
 * or vice versa and displays their respective values.
 */
public class Converter
{
    Scanner kbd = new Scanner(System.in);
    private String userValue;
    private int numTries = 3;
    private double tempF, tempC;

    /**
     * Asks the user how they would like to proceed with the program. If
     * the user enters an invalid request, the user will have two more
     * tries before the program terminates.
     * @return the user's requested action.
     */
    public String readActionRequest()
    {
        do
        {
            System.out.print("\nWhat kind of value would you like to "
                + "convert?\nEnter f for Fahrenheit, c for Celsius, "
                + "or q to quit: ");
            userValue = kbd.nextLine();

            if (!isValidRequest())
            {
                numTries--;
                if (numTries > 1)
                {
                    System.out.println("\nError: Invalid response.\nTry "
                        + "again. (You have " + numTries + " tries "
                        + "left.)");
                    pause();
                }
                else if (numTries == 1)
                {
                    System.out.println("\nError: Invalid response.\nTry "
                        + "again. (You have 1 try left.)");
                    pause();
                }
                else
                {
                    System.out.println("\nSorry, but you are out of tries"
                        + ".\nThe quit option will now be returned.");
                    pause();
                    userValue = "q";
                }
            }
        }
        while (!isValidRequest());

        return userValue;
    }

    /**
     * Asks the user to enter a valid Fahrenheit temperature. If the
     * response is invalid, then the user will be asked to enter another
     * value, until a valid value is entered.
     */
    public void readFahrenheitTemperature()
    {
        do
        {
            System.out.print("\nEnter a Fahrenheit temperature in"
                + " the range -459.67 to 212.00: ");
            tempF = kbd.nextDouble();
            kbd.nextLine();

            if (!isValidTemp())
            {
                System.out.println("\nError: Invalid Fahrenheit "
                    + "temperature.\nTry again.");
                pause();
            }
        }
        while (!isValidTemp());
    }

    /**
     * Asks the user to enter a valid Celsius temperature. If the response
     * is invalid, then the user will be asked to enter another value,
     * until a valid value is entered.
     */
    public void readCelsiusTemperature()
    {
        do
        {
            System.out.print("\nEnter a Celsius temperature in"
                + " the range -273.15 to 100.00: ");
            tempC = kbd.nextDouble();
            kbd.nextLine();

            if (!isValidTemp())
            {
                System.out.println("\nError: Invalid Celsius "
                    + "temperature.\nTry again.");
                pause();
            }
        }
        while (!isValidTemp());
    }

    /**
     * Displays the temperature that was requested to be converted and
     * calculates the resulting converted temperature and displays it.
     */
    public void displayBothValues()
    {
        if (userValue.equals("f"))
        {
            System.out.printf("The corresponding Celsius value of "
                + "Fahrenheit value " + tempF + " is %.2f.\n",
                ((tempF - 32) * 5.0 / 9.0));
            pause();
        }
        else
        {
            System.out.printf("The corresponding Fahrenheit value of "
                + "Celsius value " + tempC + " is %.2f.\n",
                (tempC * (9.0 / 5.0) + 32));
            pause();
        }
    }

    /**
     * Checks whether the user entered a valid temperature.
     * @return If the degree type is Fahrenheit, returns true if the
     *         temperature falls between -459.67 and 212.00. If the degree
     *         type is Celsius, returns true if the temperature falls
     *         between -273.15 and 100.00.
     */
    private boolean isValidTemp()
    {
        if (userValue.equals("f"))
        {
            return tempF <= 212.00 && tempF >= -459.67;
        }
        else
        {
            return tempC <= 100.00 && tempC >= -273.15;
        }
    }

    /**
     * Checks whether the user entered a valid action request.
     * @return true if the user enters lowercase f, c, or q.
     */
    private boolean isValidRequest()
    {
        return (userValue.equals("f")) || (userValue.equals("c"))
            || (userValue.equals("q"));
    }

    /**
     * Waits for the user to press enter to continue.
     */
    private void pause()
    {
        System.out.print("Press Enter to continue ... ");
        kbd.nextLine();
    }
}
