Expression Evaluator:

Release 0.1 :

-> Will evaluate expression that contains two operands and an operator and returns the result.
-> The operands should be of type int.
-> The supported operators are as follows : +,-,*,/.
 Example :
    ExprEval_GS.sh "3 + 4"
    result : 7

Release 0.2 :

-> Will evaluate expression that contains multiple operators and operands and returns the result.
->The operands should be of type int.
->The supported operators are as follows : +,-,*,/.
Example:
    ExprEval_GS.sh "2 * 3 + 4"
        result : 10

Release 0.3

-> Will evaluate expression  that has single pair brackets.
-> Will handle space in between the expression.
-> Will take expression that contains multiple operators and operands and returns the result.
->The operands should be of type int.
-> Program cannot handle operators or operands outside brackets ex :3 + ( 5 + 7)
->The supported operators are as follows : +,-,*,/.
Example:
    ExprEval_GS.sh "(2 * 3 + 4)"
        result : 10