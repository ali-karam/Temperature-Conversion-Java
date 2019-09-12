
//ProgramDescription.class
//Al-Karam:Ali:CSC122812
//Submission 06
//Temperature Conversion, Part 6
import java.util.Scanner;

/**
 * A class for a program description with a main() method for testing.
 */
public class ProgramDescription
{
    Scanner kbd = new Scanner(System.in);

    /**
     * Displays the program description
     */
    public void display()
    {
        System.out.println("\nThis program allows the user to convert "
            + "either a Fahrenheit temperature value\nentered by the user"
            + " to its equivalent Celsius temperature value, or vice "
            + "versa.\nIn either case, it then displays both the original"
            + " and the converted values.");

        System.out.println("\nThe program may convert any number of "
            + "values of either type on any given run.\nOn each pass the "
            + "user must either choose to quit, or choose what kind of "
            + "value\nhe or she wishes to convert. If a conversion option"
            + " is chosen, then a valid\nnumerical value (real number or "
            + "integer) is the expected input, and the program\nis not "
            + "responsible if anything other than a number is entered.");

        System.out.println("\nA Fahrenheit temperature value is valid "
            + "(in our case) if it is a real number\nlying within the "
            + "range -459.67..212.00. A Celsius temperature value is "
            + "valid\n(in our case) if it is a real number lying within "
            + "the range -273.15..100.00.\nThese value ranges reflect the"
            + " fact that we are only interested in, and only\ndeal with,"
            + " temperatures between absolute zero and the boiling point "
            + "of water.");

        System.out.println("\nNote that input values may have any number"
            + " of places after the decimal point,\n" + "including none."
            + " A converted value is always displayed with two places"
            + " after the\n" + "decimal but input values are displayed as"
            + " entered, unless the entered value was\n" + "an integer, "
            + "in which case it is shown with a decimal point followed by"
            + " a single\n" + "zero (the default output format for a "
            + "floating-point integer).\n");

        //Page Break
        System.out.println("                                            "
            + "                        Page 1 of 2");
        System.out.print("Press Enter to continue ... ");
        kbd.nextLine();

        //Program conditions
        System.out.println("\nIf any temperature value does not satisfy "
            + "the necessary criteria, an error\nmust be reported and the"
            + " value must be ignored by the program, which simply\nasks "
            + "for another value after reporting the error. In addition, "
            + "if the user\ndoes not respond correctly when asked to "
            + "choose the kind of value to convert,\nat that point the "
            + "program also reports the error and repeats the request.");

        System.out.println("\nThe program is not responsible for dealing "
            + "with the kind of error that occurs\nif anything other than"
            + " a valid real number is entered when a valid temperature\n"
            + "is expected.");

        System.out.println("\nNote that the user is only allowed three "
            + "attempts to enter a valid choice of\naction when asked to "
            + "enter an f, c or q.");
        System.out.println("\n\n\n\n\n\n\n\n\n");

        //Page Break
        System.out.println("                                            "
            + "                        Page 2 of 2");
        System.out.print("Press Enter to continue ... ");
        kbd.nextLine();
    }

    public static void main(String[] args)
    {
        ProgramDescription testDescription = new ProgramDescription();
        testDescription.display();
    }
}
