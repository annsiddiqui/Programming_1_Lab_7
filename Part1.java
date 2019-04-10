import java.util.Scanner;

/**
 * A program that uses methods to convert an amount in Euro to Canadian
 * Dollars.
 *
 * @assumptions Assumes the user will enter a valid double value.
 * @errors If you know of any errors, give them here (or put "None")
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class Part1
{

    /**
     * Calls a Welcome Message and then a method that reads and
     *  calculates the Canadian dollar value for a given Euro amount
     *
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);

        welcomeMessage();

        System.out.print ("Please enter the amount in Euro: € ");
        double euro = keyboard.nextDouble();

        double canadianDollars = convertEuroToCad(euro);

        System.out.format("The Canadian Dollar amount is:   $ %.2f%n", canadianDollars);
    }


    /**
     * Prints a welcome message for the user.
     */
    public static void welcomeMessage()
    {
        System.out.println("Welcome to the Euro converter!");
        System.out.println();
    }


    /**
     * This method calculates the Canadian Dollar equivalent of a given Euro
     * amount.
     *
     * The exchange rate used in 1.492 which was retrieved on October 30, 2017.
     *
     * @param euro The amount in Euro to convert.
     * @return The equivalent amount in Canadian Dollars.
     */
    public static double convertEuroToCad(double amountEur)
    {
        final double EUR_TO_CAD_EXCHANGE = 1.492;

        double ammountCad = amountEur * EUR_TO_CAD_EXCHANGE;

        return ammountCad;
    }

}
