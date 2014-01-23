package ExprEval;

import sun.org.mozilla.javascript.internal.ast.SwitchCase;

import java.util.ArrayList;

public class evalExpr {

    public boolean isOperator(String element){
        if( element.equals("+") || element.equals("-") || element.equals("*") ||
                element.equals("/") )
            return true;
        return false;
    }

    public int evaluate(String exp){

        int result;
        String[] expressionElements = exp.split(" ");
        ArrayList<String> operators = new ArrayList();
        ArrayList<Integer> operands = new ArrayList();

        for (String expressionElement : expressionElements) {
            if ( isOperator(expressionElement) )
                operators.add(expressionElement);
            else
                operands.add( Integer.parseInt(expressionElement) );
        }

        result = performOperation(operators,operands);
        return result;

    }

    public int performOperation(ArrayList<String> operators,ArrayList<Integer> operands){
        int result = operands.get(0) , i = 0;
        for (String operator : operators) {
            switch(operator.charAt(0)){

                case '+' : result = result + operands.get(++i); break;
                case '-' : result = result - operands.get(++i); break;
                case '*' : result = result * operands.get(++i); break;
                case '/' : result = result / operands.get(++i); break;

            }
        }
        return result;
    }

}
