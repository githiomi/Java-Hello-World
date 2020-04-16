import java.io.Console;

import static java.lang.Integer.parseInt;

public class DoubleNumber{
    public static void main(String[] args){
        Console number = System.console();

        System.out.println("Give me any number!");
        String numberWrapperClass = number.readLine();

        Integer doubledNumber = parseInt(numberWrapperClass) * 2;
        System.out.println("Your number doubled is: " + doubledNumber +"! isn't it like magic?");
    }
}