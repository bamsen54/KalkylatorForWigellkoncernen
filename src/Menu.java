

import static java.io.IO.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static char userChoice;

    public static boolean is_input_valid(char input) {

        String validInput = "+-*/%x";

        String inputAsString = String.valueOf( input );

        return validInput.contains( inputAsString );
    }
}
