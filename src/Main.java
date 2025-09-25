
import static java.io.IO.*;

public static char userChoice;

void main() {

    while( true ) {

        userChoice = Menu.displayMenuAndChoose();

        switch( userChoice ) {

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
