

import static java.io.IO.*;

import java.io.IO;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static boolean is_input_valid(char input) {

        String validInput = "+-*/%x";

        String inputAsString = String.valueOf( input );

        return validInput.contains( inputAsString );
    }

    // returns choice as a character
    public static char displayOperatorMenuAndChoose() {

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

    public static ArrayList<Double> inputOperands() {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Double> operands = new ArrayList<>();

        IO.println("Enter each double one after another separated with a space: ");

        try {
            String input = scanner.nextLine();

            input = input.replaceAll("\n", " ");
            input = input.replaceAll("\t", " ");
            input = input.replaceAll("\\s+", " ");
            input = input.trim();

            println(input);

            String[] operands_array = input.split(" ");

            for( int k = 0; k < operands_array.length; k++ )
                operands.add( Double.parseDouble( operands_array[k] ) );
        }

        catch (InputMismatchException e) {

            println(e);
        }

        println("");

        return operands;
    }
}
