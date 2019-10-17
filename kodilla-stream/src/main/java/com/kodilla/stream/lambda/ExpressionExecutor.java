package com.kodilla.stream.lambda;


public class ExpressionExecutor {
    public void executeExpression(double a, double b, MatchExpression matchExpression) {
        double result = matchExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}
