import ExprEval.evalExpr;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class exprEvalTest {

    @Test
    public void testShouldEvaluateExpressionThatContainsPlusOperatorAndTwoOperands(){
        String input = " 3 + 4";
        int expected = 7;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsMinusOperatorAndTwoOperands(){
        String input = " 4 - 3 ";
        int expected = 1;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsIntoOperatorAndTwoOperands(){
        String input = " 4 * 3";
        int expected = 12 ;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDivideByOperatorAndTwoOperands(){
        String input = "4 / 4";
        int expected = 1;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
   }
   @Test
   public void testShouldEvaluateExpressionThatContainsMultipleOperatorsAndOperands(){
       String input = "4 + 4 - 8";
       int expected = 0;
       evalExpr evaluateExpression = new evalExpr();
       int actual = evaluateExpression.evaluate(input);
       assertEquals(expected,actual);
   }


    @Test
    public void testShouldEvaluateExpressionThatContainsSinglePairBracketsWithOperatorsBeforeBrackets(){
        String input = "2 + ( 2 + 4 )";
        int expected = 8;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBrackets(){
        String input = "( 8 + ( 2 + 3 ) )";
        int expected = 13;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBracket(){
        String input = "( ( 8 + 4 ) + ( 2 + 3 ) )";
        int expected = 17;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
}

