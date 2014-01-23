import ExprEval.evalExpr;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class exprEvalTest {
    @Test
    public void test_checking_tests(){
        assertEquals(1, 1);
    }

    @Test
    public void testShouldEvaluateExpressionThatContainsOneOperatorAndTwoOperands(){
        String input = "3 + 4";
        int expected = 7;
        evalExpr evaluateExpression = new evalExpr();
        int actual = evaluateExpression.evaluate(input);
        assertEquals(expected,actual);
    }
}

