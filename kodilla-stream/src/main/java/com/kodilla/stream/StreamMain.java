package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeutifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeutifier poemBeutifier = new PoemBeutifier();
        String text = "my first exercise lambda";
        System.out.println(poemBeutifier.beautify(text, s -> s.replaceFirst("m", "M")));
        System.out.println(poemBeutifier.beautify(text, StreamMain::decorator1));
        System.out.println(poemBeutifier.beautify(text, StreamMain::decorator2));
        System.out.println(poemBeutifier.beautify(text, String::toUpperCase));

        Forum forum = new Forum();
        Map<Integer, ForumUser> users = forum.getUserList()
                .stream()
                .filter(fu -> fu.getSex() == 'M')
                .filter(fu -> fu.getBirdthDate().getYear() <= 1999)
                .filter(fu -> fu.getNumberOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(fu -> fu.getUniqueIdentifier(), fu -> fu));
        System.out.println(users);
    }

    public static String decorator1(String s) {
        return "!!!" + s + "!!!";
    }

    public static String decorator2(String s) {
        return "~~~~ " + s.replaceFirst("m", "M") + "." + " ~~~~";
    }
}