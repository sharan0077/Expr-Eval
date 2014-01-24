package ExprEval;


import java.io.IOException;
import java.util.ArrayList;

public class evalExpr {

    public boolean isOperator(String element){
        if( element.equals("+") || element.equals("-") || element.equals("*") ||
                element.equals("/") || element.equals("^"))
            return true;
        return false;
    }


    public double evaluate(String exp)throws Exception{


        double result;
        boolean operatorPresent;
        String expression = getModifiedString(exp);
        String[] expressionElements;
        ArrayList<String> operators = new ArrayList();
        ArrayList<Double> operands = new ArrayList();



        expressionElements = expression.split(" ");



        if(expression.trim().charAt(0) == ')' || expression.trim().charAt(expression.length()-1) == '(' )
             throw new IndexOutOfBoundsException();

        for(int i = 0 ; i < expression.length() ; i++){
            if(expression.charAt(i) == '(')
                return evaluate(expression.substring(0,i) + evaluate(expression.substring(i+1,expression.length())));
            if(expression.charAt(i) == ')'){
                return evaluate(expression.substring(0,i) + expression.substring(i+1,expression.length()));
            }
        }

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

    public String getModifiedString(String expression){
        return expression.replaceAll(" +", "").replaceAll("\\+", " + ").replaceAll("\\/", " / ")
        .replaceAll("\\-", " - ") .replaceAll("\\*", " * ").replaceAll("\\^", " ^ ").replaceAll("\\(", "( ")
        .replaceAll("\\)", " )").replaceAll("  - ", " -").replaceFirst("^ - ", "-");
    }

    public double performOperation(ArrayList<String> operators,ArrayList<Double> operands)throws Exception{
        double result = operands.get(0) ;
        int i = 0;
        for (String operator : operators) {
            switch(operator.charAt(0)){

                case '+' : result = result + operands.get(++i); break;
                case '-' : result = result - operands.get(++i); break;
                case '*' : result = result * operands.get(++i); break;
                case '/' : result = result / operands.get(++i); break;
                case '^' : result = Math.pow(result,operands.get(++i)); break;

            }
        }
        return result;
    }


}