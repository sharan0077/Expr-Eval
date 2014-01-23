import ExprEval.evalExpr;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class exprEvalTest {
    @Test
    public void test_checking_tests(){
        assertEquals(1, 1);
    }

    @Test
    public void testShouldEvaluateExpressionThatContainsPlusOperatorAndTwoOperands(){
        String input = "3+4";
        int expected = 7;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsMinusOperatorAndTwoOperands(){
        String input = "4-3";
        int expected = 1;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsIntoOperatorAndTwoOperands(){
        String input = "4*3";
        int expected = 12;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDivideByOperatorAndTwoOperands(){
        String input = "4/4";
        int expected = 1;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
   }
   @Test
   public void testShouldEvaluateExpressionThatContainsMultipleOperatorsAndOperands(){
       String input = "4+4-8";
       int expected = 0;
       evalExpr evaluateExpression = new evalExpr();
       int actual = evaluateExpression.evaluate(input);
       assertEquals(expected,actual);
   }

    @Test
    public void testShouldEvaluateExpressionThatContainsMultipleOperatorAndOperands(){
        String input = "2+4/2+8";
        int expected = 11;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testShouldEvaluateExpressionThatContainsSinglePairBrackets(){
        String input = "(2+4/2+8)";
        int expected = 11;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testShouldEvaluateExpressionWhenThereIsSpaceInExpression(){
        String input = "2 + 4";
        int expected = 6;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testShouldEvaluateExpressionWhenThereIsSpaceInExpressionWithBracketsEnclosed(){
        String input = " ( 2 + 4 - 2 )";
        int expected = 4;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
}

