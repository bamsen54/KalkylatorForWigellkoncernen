
import static java.io.IO.*;

public static char userChoiceOperator;
public static ArrayList<Double> operands;

void main() {

    while( true ) {

        userChoiceOperator = Menu.displayOperatorMenuAndChoose();
        operands           = Menu.inputOperands();

        switch( userChoiceOperator ) {

            case '+' -> {  }
            case '-' -> {  }
            case '*' -> {  }
            case '%' -> {  }
            case 'x' -> {
                return;   // return from main exits program
            }
        }
    }
}
