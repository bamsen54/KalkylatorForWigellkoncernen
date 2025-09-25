
public static char userChoiceOperator;
public static ArrayList<Double> operands;

void main() {

    while( true ) {

        userChoiceOperator = Menu.displayOperatorMenuAndChoose();

        if( userChoiceOperator != '?' && userChoiceOperator != 'x' )
            operands           = Menu.inputOperands();

        switch( userChoiceOperator ) {

            case '+' -> {  }
            case '-' -> {  }
            case '*' -> {  }
            case '%' -> {  }
            case '?' -> { Help.getHelp(); }
            case 'x' -> {
                return;   // return from main exits program
            }
        }
    }
}
