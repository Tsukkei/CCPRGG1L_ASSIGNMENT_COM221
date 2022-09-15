// import the Scanner class
import java.util.Scanner;

public class crush {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        String crushName = revealMyCrush();
        System.out.println(crushName);

        // Close scanner
        scan.close();
    }

    static String revealMyCrush() {
        System.out.println("This will reveal the name of your 1st crush");
        System.out.print("Enter the your name: ");

        String myName = scan.nextLine();

        System.out.print("Enter the name of your 1st crush: ");

        String nameOfMy1stCrush = scan.nextLine();

        System.out.print("Enter the name of your 2nd crush: ");

        String nameOfMy2ndCrush = scan.nextLine();

        return myName + " Is Married to " + nameOfMy1stCrush + "\n" + myName + " Is Married to " + nameOfMy2ndCrush;
    }

    
}
