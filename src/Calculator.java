
import static java.io.IO.*;
import java.util.ArrayList;

public class Calculator {

    public static void calculate(char operator, ArrayList<Double> operands ) {

        if( operands.size() < 2 ) {

            println("För få operander\n");

            return;
        }

        if( operator == '-' ) {

            double result = operands.getFirst();

            for( int k = 1; k < operands.size(); k++ )
                result -= operands.get( k );

            println("Result: " + result );
        }

        // can not divide by zero, only first operand can be zero
        else if( operator == '/' || operator == '%' ) {

            try {

                for (int k = 1; k < operands.size(); k++) {

                    if ( operands.get(k) == 0)
                        throw new ArithmeticException("Division By Zero");
                }

                if( operator == '/' ) {

                    double result = operands.getFirst();

                    for( int k = 1; k < operands.size(); k++ )
                        result /= operands.get( k );

                    println("Result: " + result);
                }
            }

            catch (ArithmeticException e) {

                println("Can't divide by zero");
            }
        }

        println("");
    }
}
