import java.io.Console;

import static java.lang.Integer.parseInt;

public class DoubleDigits{
    public static void main(String[] args){
        enterYourNumber ("number");
    }

    public static void enterYourNumber(String input){
        Console consoleInput = System.console();

        System.out.println("Please enter your " + input);
        String entered = consoleInput.readLine();
        int doublets = parseInt(entered);

        if ( doublets >=10 && doublets <= 99){
            System.out.println("Your number is double digits");
        } else {
            System.out.println("You have input an invalid number!");
        }
    }
}