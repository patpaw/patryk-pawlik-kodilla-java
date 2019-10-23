package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueIdentifier;
    private final String userName;
    private final char sex;
    private final LocalDate birdthDate;
    private final int numberOfPublishedPosts;

    public ForumUser(int uniqueIdentifier, String userName, char sex, LocalDate birdthDate, int numberOfPublishedPosts) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.userName = userName;
        this.sex = sex;
        this.birdthDate = birdthDate;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirdthDate() {
        return birdthDate;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueIdentifier=" + uniqueIdentifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birdthDate=" + birdthDate +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
