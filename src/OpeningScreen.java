
//OpeningScreen.class
//Al-Karam:Ali:CSC122812
//Submission 06
//Temperature Conversion, Part 6
import java.util.Scanner;

/**
 * A class for an opening screen, with a main() method to test it.
 */
public class OpeningScreen
{
    Scanner kbd = new Scanner(System.in);
    private String studentInfo, numSubmission, projectName;

    /**
     * Creates an opening screen
     * @param studentInfo   Student name and account number
     * @param numSubmission The submission number
     * @param projectName   The project's title
     */
    public OpeningScreen(String studentInfo,
        String numSubmission,
        String projectName)
    {
        this.studentInfo = studentInfo;
        this.numSubmission = numSubmission;
        this.projectName = projectName;
    }

    /**
     * Displays an opening screen with each string on a separate line
     */
    public void display()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("                " + studentInfo + "\n"
            + "                " + numSubmission + "\n"
            + "                " + projectName);
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Press Enter to continue ... ");
        kbd.nextLine();
    }

    public static void main(String[] args)
    {
        OpeningScreen test = new OpeningScreen("Lastname:Firstname:"
            + "csc122801", "Submission xx", "Title of Submission");
        test.display();
    }
}
