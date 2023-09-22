import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer [] numeric = { 1,2,3,4,5,6,7,8,9,0};
        String [] alphabetic = {"een", "twee", "drie", "vier", "vijd", "zes", "zeven", "acht", "negen", "nul"};
        Translator firstTry = new Translator(alphabetic, numeric);
        boolean play = true;
        String ongeldig = "Ongeldige invoer";

        while(play)
        {
            System.out.println("Input a value between 0 and 9");
            int userOption = userInput.nextInt();
            System.out.println("Your input is translated to " + firstTry.Translate(userOption));
            System.out.println("Type 'x' om te stoppen of Type 'v' om te vertalen");
            String stoppenOfDoorgaan = userInput.next();

            if(stoppenOfDoorgaan.equals("x"))
            {
                System.out.println("Thanks for using");
                play = false;
                break;
            }
            else if(stoppenOfDoorgaan.equals("v"))
            {
                System.out.println("WhooHoo lets go again!");
            }
            else
            {
                System.out.println(ongeldig);
            }
        }
    }
}
