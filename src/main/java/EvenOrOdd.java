import java.io.Console;

import static java.lang.Integer.parseInt;

public class EvenOrOdd{
    public static void main (String[] args){
        Console myConsole = System.console();

        System.out.println("Please enter a number greater than 1 and we will tell you if it is even or odd: ");
        String number = myConsole.readLine();
        Integer actNumber = parseInt(number);

        for ( Integer i = 1; i < actNumber; i += 1){
            if ( i % 2 == 0){
                System.out.println(i + " is an even number");
            }else{
                System.out.println(i + " is not an even number");
            }
        }
    }
}