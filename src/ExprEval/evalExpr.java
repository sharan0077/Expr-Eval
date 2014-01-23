package ExprEval;


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
        boolean operatorPresent;
        String expression = exp.replaceAll(" +","");
        String[] expressionElements = expression.split("");
        ArrayList<String> operators = new ArrayList();
        ArrayList<Integer> operands = new ArrayList();
        String modifiedString;

        for(int i = 0 ; i < expression.length() ; i++){
            if(expression.charAt(i) == '('){
                modifiedString =  getModifiedString(expression,i);
                return evaluate(modifiedString);
            }
        }
        for (String expressionElement : expressionElements) {
            operatorPresent = isOperator(expressionElement);
            if ( operatorPresent )
                operators.add(expressionElement);
            else if( !operatorPresent && !(expressionElement.equals("")) )
                operands.add( Integer.parseInt(expressionElement) );
        }

        result = performOperation(operators,operands);
        return result;

    }

    public String getModifiedString(String expr,int indexOfOpeningBracket){
        int i;
        for(i = 0 ; i < expr.length() ; i++){
            if(expr.charAt(i) == ')')
                break;
        }
        return expr.substring(indexOfOpeningBracket+1,i);
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
