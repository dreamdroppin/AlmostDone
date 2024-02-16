//Identify: Carmelina Jaramillo, 2/15/2024
import java.util.Scanner;

//Create a Class Called AlmostDone
public class AlmostDone {
    //With an Instance Variable of Type Scanner
    private Scanner scanner;
    //Prompt the User
    public AlmostDone() {
        scanner = new Scanner(System.in);
    }

    //Method to Print Strings with Appropriate Labeling
    public void printStrings(String str1, String str2) {
        //Printing the Text
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
    }
    //Method to get Strings from the User and Print them
    public void getTwoStrings() {
        //Prompting the User
        System.out.print("Enter the First String: ");
        //Collect the Prompt
        String firstString = scanner.nextLine();

        //Prompt the User
        System.out.print("Enter the Second String: ");
        //Collect the Prompt
        String secondString = scanner.nextLine();

        //Print the Entered Strings that've been Prompted
        printStrings(firstString, secondString);
    }

    public static void main(String[] args) {
        AlmostDone almostDone = new AlmostDone();

        //Call the Strings
        almostDone.getTwoStrings();
    }
}
