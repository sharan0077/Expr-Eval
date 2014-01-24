import ExprEval.evalExpr;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class exprEvalTest {

    @Test
    public void testShouldEvaluateExpressionThatContainsPlusOperatorAndTwoOperands(){
        String input = " 3 + 4";
        double expected = 7.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsMinusOperatorAndTwoOperands(){
        String input = " 4 - 3 ";
        double expected = 1.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsIntoOperatorAndTwoOperands(){
        String input = " 4 * 3";
        double expected = 12.0 ;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDivideByOperatorAndTwoOperands(){
        String input = "4 / 4";
        double expected = 1.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
   }
   @Test
   public void testShouldEvaluateExpressionThatContainsMultipleOperatorsAndOperands(){
       String input = "4 + 4 - 8";
       double expected = 0.0;
       evalExpr evaluateExpression = new evalExpr();
       double actual = evaluateExpression.evaluate(input);
       assertEquals(expected,actual);
   }


    @Test
     public void testShouldEvaluateExpressionThatContainsSinglePairBracketsWithOperatorsBeforeBrackets(){
        String input = "2 + ( 2 + 4 )";
        double expected = 8.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
//
    @Test
    public void testShouldEvaluateExpressionThatContainsMultiplePairBracketsWithOperatorsBeforeBrackets(){
        String input = "( 2 + 4) + ( 2 + 4 )";
        double expected = 12.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBrackets(){
        String input = "( 8 + ( 2 + 3 ) )";
        double expected = 13.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
     public void testShouldEvaluateExpressionThatContainsNestedBracket(){
        String input = "( ( 8 + 4 ) + ( 2 + 3 ) )";
        double expected = 17.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBracketandOperatorsandOperandsOutside(){
        String input = "( ( 8 + 4 ) ) + 2 + 3  ";
        double expected = 17.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumber(){
        String input = "2.0 + 3.0";
        double expected = 5.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultipleOperators(){
        String input = "2.0 + 3.0 * 5.0";
        double expected = 25.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultipleOperatorsWithSinglePairBrackets(){
        String input = "( 2.0 + 3.0 * 5.0 )";
        double expected = 25.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithSinglePairBracketsAndOperatorsOutsideBrackets(){
        String input = "( 2.0 + 3.0 * 5.0 ) + 2.0";
        double expected = 27.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultiplePairBrackets(){
        String input = "( 2.0 + 3.0 ) + ( 5.0 + 2.0 )";
        double expected = 12.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithNestedBrackets(){
        String input = "( ( 2.0 + 3.0 ) + ( 5.0 + 2.0 ) + 8.0)";
        double expected = 20.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
}

