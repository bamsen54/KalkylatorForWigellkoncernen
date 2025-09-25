
public static char userChoiceOperator;
public static ArrayList<Double> operands;

void main() {

    println("");

    while( true ) {

        userChoiceOperator = Menu.displayOperatorMenuAndChoose();

        if( userChoiceOperator != '?' && userChoiceOperator != 'x' )
            operands           = Menu.inputOperands();

        if( operands != null ) {

            switch (userChoiceOperator) {

                case '+' -> {
                    Calculator.calculate('+', operands);
                }
                case '-' -> {
                    Calculator.calculate('-', operands);
                }
                case '*' -> {
                    Calculator.calculate('*', operands);
                }
                case '/' -> {
                    Calculator.calculate('/', operands);
                }
                case '%' -> {
                    Calculator.calculate('%', operands);
                }
                case '?' -> {
                    Help.getHelp();
                }
                case 'x' -> {
                    return;   // return from main exits program
                }
            }
        }
    }
}
