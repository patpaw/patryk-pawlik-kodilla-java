package com.kodilla.testing.forum.statistics;

public class Stats {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount == 0) {
            averageCommentsPerUser = 0;
            averagePostsPerUser = 0;
        } else {
            averageCommentsPerUser = commentsCount / (double) usersCount;
            averagePostsPerUser = postsCount / (double) usersCount;
        }

        if (postsCount == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = commentsCount / (double) postsCount;
        }
    }

    public void showStatistics() {

    }
}
