package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {
    @Test
    public void calculateStatisticsWhenPostsCountEquals0() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            usersNames.add("User" + i);
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(8);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(0, postsCount);
        Assert.assertEquals(8, commentsCount);
        Assert.assertEquals(10, usersCount);
        Assert.assertEquals(0.0, averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, averageCommentsPerPost, 0.1);
        Assert.assertEquals(0.8, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenPostsCountEquals1000() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            usersNames.add("User" + i);
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5300);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(1000, postsCount);
        Assert.assertEquals(5300, commentsCount);
        Assert.assertEquals(300, usersCount);
        Assert.assertEquals(3.3, averagePostsPerUser, 0.1);
        Assert.assertEquals(5.3, averageCommentsPerPost, 0.1);
        Assert.assertEquals(17.6, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenComentsCountEquals0() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            usersNames.add("User" + i);
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(100, postsCount);
        Assert.assertEquals(0, commentsCount);
        Assert.assertEquals(50, usersCount);
        Assert.assertEquals(2.0, averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, averageCommentsPerPost, 0.1);
        Assert.assertEquals(0.0, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsSmallerThanPostsCount() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 120; i++) {
            usersNames.add("User" + i);
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(521);
        when(statistics.postsCount()).thenReturn(753);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(true, commentsCount < postsCount);
        Assert.assertEquals(753, postsCount);
        Assert.assertEquals(521, commentsCount);
        Assert.assertEquals(120, usersCount);
        Assert.assertEquals(6.2, averagePostsPerUser, 0.1);
        Assert.assertEquals(0.6, averageCommentsPerPost, 0.1);
        Assert.assertEquals(4.3, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsBiggerrThanPostsCount() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            usersNames.add("User" + i);
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(953);
        when(statistics.postsCount()).thenReturn(452);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(true, commentsCount > postsCount);
        Assert.assertEquals(452, postsCount);
        Assert.assertEquals(953, commentsCount);
        Assert.assertEquals(300, usersCount);
        Assert.assertEquals(1.5, averagePostsPerUser, 0.1);
        Assert.assertEquals(2.1, averageCommentsPerPost, 0.1);
        Assert.assertEquals(3.1, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenUsersCountEquals100() {
        List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
            usersNames.add("User" + i);
            }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(70);
        when(statistics.commentsCount()).thenReturn(150);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(70, postsCount);
        Assert.assertEquals(150, commentsCount);
        Assert.assertEquals(100, usersCount);
        Assert.assertEquals(0.7, averagePostsPerUser, 0.1);
        Assert.assertEquals(2.1, averageCommentsPerPost, 0.1);
        Assert.assertEquals(1.5, averageCommentsPerUser, 0.1);
    }

    @Test
    public void calculateStatisticsWhenUsersCountEquals0() {
        List<String> usersNames = new ArrayList<>();
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        int commentsCount = stats.getCommentsCount();
        int usersCount = stats.getUsersCount();
        double averagePostsPerUser = stats.getAveragePostsPerUser();
        double averageCommentsPerUser = stats.getAverageCommentsPerUser();
        double averageCommentsPerPost = stats.getAverageCommentsPerPost();

        Assert.assertEquals(0, postsCount);
        Assert.assertEquals(0, commentsCount);
        Assert.assertEquals(0, usersCount);
        Assert.assertEquals(0.0, averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, averageCommentsPerPost, 0.1);
        Assert.assertEquals(0.0, averageCommentsPerUser, 0.1);
    }
}
