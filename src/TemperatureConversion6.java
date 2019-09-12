
//TemperatureConversion6.java
//Al-Karam:Ali:CSC122812
//Submission 06
//Temperature Conversion, Part 6

/*
I tested out all the test values in the sample solution and got the same
results with no errors.
 */
import java.util.Scanner;

/**
 * This class contains objects and methods from other classes and a main()
 * method, for converting Fahrenheit temperatures to Celsius temperatures
 * or vice versa. The user can perform as many conversions as they like,
 * unless they quit the program, or if the user enters more than three
 * invalid responses when asked to enter f, c, and q.
 */
public class TemperatureConversion6
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        String answer;

        //Create and display opening screen
        OpeningScreen submissionSix = new OpeningScreen("Al-Karam:Ali:"
            + "csc122812", "Submission 06", "Temperature "
            + "Conversion, Part 6");
        submissionSix.display();

        //Create and display program description
        ProgramDescription descriptionSix = new ProgramDescription();
        descriptionSix.display();

        Converter tempConverter = new Converter();
        do
        {
            //Read user response
            answer = tempConverter.readActionRequest();
            switch (answer)
            {

            //Convert to Celsius
            case "f":
                tempConverter.readFahrenheitTemperature();
                tempConverter.displayBothValues();
                break;

            //Convert to Fahrenheit
            case "c":
                tempConverter.readCelsiusTemperature();
                tempConverter.displayBothValues();
                break;

            //Quit program
            case "q":
                System.out.println("\nQuit option chosen.\nProgram now "
                    + "terminating.");
                System.out.print("Press Enter to continue ... ");
                kbd.nextLine();
                break;
            }

        }
        while (!answer.equals("q"));

    }

}
