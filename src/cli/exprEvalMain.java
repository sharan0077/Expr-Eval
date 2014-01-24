package cli;


import ExprEval.evalExpr;

public class exprEvalMain {
    public static void main(String[] args) {
        evalExpr evaluateExpression = new evalExpr();
        double result = evaluateExpression.evaluate(args[0]);
        System.out.println(result);
    }
}
