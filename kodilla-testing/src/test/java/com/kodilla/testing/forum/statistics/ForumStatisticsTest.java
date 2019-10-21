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
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        Assert.assertEquals(0, postsCount);
    }

    @Test
    public void calculateStatisticsWhenPostsCountEquals1000() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        Assert.assertEquals(1000, postsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountEquals0() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        stats.calculateAdvStatistics(statistics);

        int comentsCount = stats.getCommentsCount();
        Assert.assertEquals(0, comentsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsSmallerThanPostsCount() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(5);
        when(statistics.postsCount()).thenReturn(7);
        stats.calculateAdvStatistics(statistics);

        int comentsCount = stats.getCommentsCount();
        int postsCount = stats.getPostsCount();
        Assert.assertEquals(true, comentsCount < postsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsBiggerrThanPostsCount() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(7);
        when(statistics.postsCount()).thenReturn(5);
        stats.calculateAdvStatistics(statistics);

        int comentsCount = stats.getCommentsCount();
        int postsCount = stats.getPostsCount();
        Assert.assertEquals(true, comentsCount > postsCount);
    }

    @Test
    public void calculateStatisticsWhenUsersCountEquals100() {
        List<String> usersNames = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
            usersNames.add(i,"Jan");
            }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int usersCount = stats.getUsersCount();
        Assert.assertEquals(100, usersCount);
    }

    @Test
    public void calculateStatisticsWhenUsersCountEquals0() {
        List<String> usersNames = new ArrayList<>();
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int usersCount = stats.getUsersCount();
        Assert.assertEquals(0, usersCount);
    }
}
