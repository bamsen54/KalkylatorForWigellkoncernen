
import static java.io.IO.*;

public static char userChoiceOperator;

void main() {

    while( true ) {

        userChoiceOperator = Menu.displayOperatorMenuAndChoose();

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
