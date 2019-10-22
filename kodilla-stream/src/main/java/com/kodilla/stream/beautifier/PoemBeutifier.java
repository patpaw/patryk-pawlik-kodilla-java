package com.kodilla.stream.beautifier;

public class PoemBeutifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate();
        System.out.println("Result equals: " + result);
    }


}
