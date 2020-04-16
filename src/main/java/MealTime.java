import java.io.Console;

public class MealTime {
    public static void main(String[] args) {
        whatYouAte ("breakfast");
        whatYouAte ("Lunch");
        whatYouAte ("Dinner");

        System.out.println("Thank you for using the Meal Time App!");
    }

    public static void whatYouAte(String foodEaten){
        Console inputFromConsole = System.console();

        System.out.println("What did you eat for " + foodEaten + " today?");
        String inputMeal = inputFromConsole.readLine();
        System.out.println("You ate " + inputMeal + " for your " + foodEaten + "!");
    }
}