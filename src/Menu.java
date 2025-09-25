

import static java.io.IO.*;

import java.io.IO;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static boolean is_input_valid(char input) {

        String validInput = "+-*/%x";

        String inputAsString = String.valueOf( input );

        return validInput.contains( inputAsString );
    }

    // returns choice as a character
    public static char displayMenuAndChoose() {

        Scanner scanner = new Scanner(System.in);

        char userChoice;

        while( true ) {

            print("Välj operand (+, -, *, /, %)  eller att avsluta programmet (x): ");

            userChoice = scanner.next().charAt(0);

            if( Menu.is_input_valid( userChoice ) )
                break;

            else
                IO.println("Ej korrekt val");
        }

        println("");

        return userChoice;
    }
}
