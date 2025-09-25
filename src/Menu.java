
import static java.io.IO.*;
import java.io.IO;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static boolean is_input_valid(char input) {

        String validInput = "+-*/%?x";

        String inputAsString = String.valueOf( input );

        return validInput.contains( inputAsString );
    }

    // returns choice as a character
    public static char displayOperatorMenuAndChoose() {

        Scanner scanner = new Scanner(System.in);

        char userChoice;

        while( true ) {

            print("Välj operand (+, -, *, /, %), hjälp (?) eller avsluta programmet (x): ");

            userChoice = scanner.next().charAt(0);

            if( Menu.is_input_valid( userChoice ) )
                break;

            else
                IO.println("\nEj korrekt val\n");
        }

        println("");

        return userChoice;
    }

    public static ArrayList<Double> inputOperands() {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> operands = new ArrayList<>();

        String input;

        try {

            IO.println("Skriv in flytal separerade med mellanslag:");
            input = scanner.nextLine();
            input = input.replaceAll("\n", " ");
            input = input.replaceAll("\t", " ");
            input = input.replaceAll("\\s+", " ");
            input = input.trim();

            String[] operands_array = input.split(" ");

            for (int k = 0; k < operands_array.length; k++)
                operands.add(Double.parseDouble(operands_array[k]) + 0.0 );

            println("");

            return operands;
        }

        catch (NumberFormatException e) {

            println("");
            println("Input är inkorrekt");
            println("");
        }

        return null;
    }
}
