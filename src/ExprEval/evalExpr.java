package ExprEval;

import java.util.ArrayList;

public class evalExpr {

    public boolean isOperator(String element){
        if( element.equals('+') || element.equals('-') || element.equals('*') ||
                element.equals('/') )
            return true;
        return false;
    }

    public int evaluate(String exp){

        String[] expressionElements = exp.split(" ");
        String operator = expressionElements[1];
        int operand1 = Integer.parseInt(expressionElements[0]) , operand2 = Integer.parseInt(expressionElements[2]);
        int result = performOperation(operator,operand1,operand2);
        return result;

    }

    public int performOperation(String operator,int operand1,int operand2){
        if(operator.equals("+"))
            return operand1 + operand2;
        if(operator.equals("-"))
            return operand1 - operand2;
        if(operator.equals("*"))
            return operand1 * operand2;
        return operand1 / operand2;
    }

}
