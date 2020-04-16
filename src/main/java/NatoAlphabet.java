import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.Console;

public class NatoAlphabet{
    public static void main(String[] args){
        getYourNameInNato("Username");
    }

    private static void getYourNameInNato(String nameEntered) {
        Console usersName = System.console();
        System.out.println("Please input your name below: ");
        String enteredName = usersName.readLine();

        enteredName.toCharArray();
        String a = enteredName.replaceAll("a", "Alpha");

        System.out.println("In the Army you would be called: " + a + "!");
    }
}
