package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeutifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        String text1 = "Mój pierwszy test";
        PoemBeutifier poemBeutifier = new PoemBeutifier();

        poemBeutifier.beautify(text1, (poemDecorator) -> text1.toUpperCase());

    }
}