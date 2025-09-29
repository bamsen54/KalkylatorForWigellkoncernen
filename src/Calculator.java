
import static java.io.IO.*;
import java.util.ArrayList;

public class Calculator {

    public static void calculate(char operator, ArrayList<Double> operands ) {

        if( operands.size() == 1 )
            println( "Resultat: " + operands.getFirst() + "\n" );

        if( operands.size() < 2 )
            return;

        // can not divide by zero, only first operand can be zero
        if( operator == '/' || operator == '%' ) {

            try {

                for (int k = 1; k < operands.size(); k++) {

                    if ( operands.get(k) == 0)
                        throw new ArithmeticException("Division By Zero");
                }

                double result = operands.getFirst();

                for( int k = 1; k < operands.size(); k++ ) {

                    switch ( operator ) {

                        case '/' -> result /= operands.get( k );
                        case '%' -> result %= operands.get( k );
                    }
                }

                println("Resultat: " + result);
            }

            catch (ArithmeticException e) {

                println("Fel: delade med noll");
            }
        }

        else if( operator == '^') {

            boolean includesNonPositive = false;

            for( double e: operands ) {

                if( e <= 0 )
                    includesNonPositive = true;
            }

            if( includesNonPositive )
                println("Exponentiering kan endast ha positiva operander");

            
        }

        else {

            double result = operands.getFirst();

            for( int k = 1; k < operands.size(); k++ ) {

                double operand = operands.get( k );

                switch( operator ) {

                    case '+' -> result += operand;
                    case '-' -> result -= operand;
                    case '*' -> result *= operand;
                }
            }

            println("Resultat: " + result );
        }

        operands.clear();

        println("");
    }
}
