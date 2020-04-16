import java.io.Console;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Let us get to know you better. What is your favourite color?");
        Console input = System.console();

        String color = input.readLine();
        System.out.println("Oh shit your favourite color is " + color + "? Me too!");
    }
}