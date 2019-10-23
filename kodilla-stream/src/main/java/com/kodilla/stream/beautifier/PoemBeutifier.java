package com.kodilla.stream.beautifier;

public class PoemBeutifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
       return poemDecorator.decorate(text);
    }

}
