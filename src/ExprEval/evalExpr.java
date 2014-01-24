package ExprEval;


import java.util.ArrayList;

public class evalExpr {

    public boolean isOperator(String element){
        if( element.equals("+") || element.equals("-") || element.equals("*") ||
                element.equals("/") )
            return true;
        return false;
    }


    public double evaluate(String exp){

        double result;
        boolean operatorPresent;
        String expression = exp;
        String[] expressionElements;
        ArrayList<String> operators = new ArrayList();
        ArrayList<Double> operands = new ArrayList();

        for(int i = 0 ; i < expression.length() ; i++){
            if(expression.charAt(i) == '(')
                return evaluate(expression.substring(0,i) + evaluate(expression.substring(i+1,expression.length())));
            if(expression.charAt(i) == ')')
                return evaluate(expression.substring(0,i) + expression.substring(i+1,expression.length()));
        }
        expressionElements = expression.split(" ");
        for (String expressionElement : expressionElements) {
            operatorPresent = isOperator(expressionElement);
            if ( operatorPresent )
                operators.add(expressionElement);
            else if( !operatorPresent && !(expressionElement.equals("")) )
                operands.add( Double.parseDouble(expressionElement) );
        }

        result = performOperation(operators,operands);
        return result;

    }

    public double performOperation(ArrayList<String> operators,ArrayList<Double> operands){
        double result = operands.get(0) ;
        int i = 0;
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