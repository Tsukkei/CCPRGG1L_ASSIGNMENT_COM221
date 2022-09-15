// import the Scanner class
import java.util.Scanner;

public class myorder {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Welcome To KFC May I Take Your Order?");

        System.out.println("What is your first order? ");
        String myFirstOrder = scan.nextLine();
        System.out.print("Price: ");
        double firstOrderPrice = scan.nextDouble();

        scan.nextLine();

        System.out.print("What is your second order? ");
        String mySecondOrder = scan.nextLine();
        System.out.print("Price: ");
        double secondOrderPrice = scan.nextDouble();
        scan.nextLine();

        System.out.print("What is your third order? ");
        String myThirdOrder = scan.nextLine();
        System.out.print("Price: ");
        double thirdOrderPrice = scan.nextDouble();

        double totalPrice = firstOrderPrice + secondOrderPrice + thirdOrderPrice;

        System.out.println("Your orders are " + myFirstOrder + ", " + mySecondOrder + ", " + myThirdOrder + " with the total of " + totalPrice);

        // Close scanner
        scan.close();
    }
}
