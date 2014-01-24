import ExprEval.evalExpr;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class exprEvalTest {

    @Test
    public void testShouldEvaluateExpressionThatContainsPlusOperatorAndTwoOperands() throws Exception{
        String input = " 3 + 4";
        double expected = 7.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsMinusOperatorAndTwoOperands()throws Exception{
        String input = " 4 - 3 ";
        double expected = 1.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsIntoOperatorAndTwoOperands()throws Exception{
        String input = " 4 * 3";
        double expected = 12.0 ;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDivideByOperatorAndTwoOperands()throws Exception{
        String input = "4 / 4";
        double expected = 1.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
   }
   @Test
   public void testShouldEvaluateExpressionThatContainsMultipleOperatorsAndOperands()throws Exception{
       String input = "4 + 4 - 8";
       double expected = 0.0;
       evalExpr evaluateExpression = new evalExpr();
       double actual = evaluateExpression.evaluate(input);
       assertEquals(expected,actual);
   }


    @Test
     public void testShouldEvaluateExpressionThatContainsSinglePairBracketsWithOperatorsBeforeBrackets()throws Exception{
        String input = "2 + ( 2 + 4 )";
        double expected = 8.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testShouldEvaluateExpressionThatContainsMultiplePairBracketsWithOperatorsBeforeBrackets()throws Exception{
        String input = "( 2 + 4) + ( 2 + 4 )";
        double expected = 12.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBrackets()throws Exception{
        String input = "( 8 + ( 2 + 3 ) )";
        double expected = 13.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
     public void testShouldEvaluateExpressionThatContainsNestedBracket()throws Exception{
        String input = "( ( 8 + 4 ) + ( 2 + 3 ) )";
        double expected = 17.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNestedBracketandOperatorsandOperandsOutside()throws Exception{
        String input = "( ( 8 + 4 ) ) + 2 + 3  ";
        double expected = 17.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumber()throws Exception{
        String input = "2.0 + 3.0";
        double expected = 5.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultipleOperators()throws Exception{
        String input = "2.0 + 3.0 * 5.0";
        double expected = 25.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultipleOperatorsWithSinglePairBrackets()throws Exception{
        String input = "( 2.0 + 3.0 * 5.0 )";
        double expected = 25.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithSinglePairBracketsAndOperatorsOutsideBrackets()throws Exception{
        String input = "( 2.0 + 3.0 * 5.0 ) + 2.0";
        double expected = 27.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithMultiplePairBrackets()throws Exception{
        String input = "( 2.0 + 3.0 ) + ( 5.0 + 2.0 )";
        double expected = 12.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsDecimalNumberWithNestedBrackets()throws Exception{
        String input = "( ( 2.0 + 3.0 ) + ( 5.0 + 2.0 ) + 8.0)";
        double expected = 20.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNegativeNumber()throws Exception{
        String input = "3 - -2";
        double expected = 5.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNegativeNumberWithMulipleOperators()throws Exception{
        String input = "3 + -2 * -2";
        double expected = -2.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNegativeNumberWithMulipleOperatorsWithBrackets()throws Exception{
        String input = "( ( 3 + -2 ) * ( -2 * -2 ) )";
        double expected = 4.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsNegativeDecimalNumberWithMulipleOperatorsWithBrackets()throws Exception{
        String input = "( ( 3.0 + -2.0 ) * ( -2.0 * -2.0 ) )";
        double expected = 4.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsPowerOperator()throws Exception{
        String input = "( 3 ^ 2)";
        double expected = 9.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatContainsPowerOperatorWithMultipleOperands()throws Exception{
        String input = "( 3 ^ 2 ) + 5";
        double expected = 14.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatNoSpace()throws Exception{
        String input = "(3+2)+5";
        double expected = 10.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatNoSpaceAndHasMultipleNestedBrackets() throws Exception {
        String input = "(4+(3+2)+5))";
        double expected = 14.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatExtraWideSpaces()throws Exception{
        String input = "2       +    3      ";
        double expected = 5.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
    @Test
    public void testShouldEvaluateExpressionThatExtraWideSpacesWithBrackets()throws Exception{
        String input = "(8*9) +  2       +    3      ";
        double expected = 77.0;
        evalExpr evaluateExpression = new evalExpr();
        double actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }

}

