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
            usersNames.add(i,"Jan");
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        Assert.assertEquals(0, postsCount);
    }

    @Test
    public void calculateStatisticsWhenPostsCountEquals1000() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            usersNames.add(i,"Jan");
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5300);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int postsCount = stats.getPostsCount();
        Assert.assertEquals(1000, postsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountEquals0() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            usersNames.add(i,"Jan");
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int comentsCount = stats.getCommentsCount();
        Assert.assertEquals(0, comentsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsSmallerThanPostsCount() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 120; i++) {
            usersNames.add(i,"Jan");
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(521);
        when(statistics.postsCount()).thenReturn(753);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int comentsCount = stats.getCommentsCount();
        int postsCount = stats.getPostsCount();
        Assert.assertEquals(true, comentsCount < postsCount);
    }

    @Test
    public void calculateStatisticsWhenComentsCountIsBiggerrThanPostsCount() {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            usersNames.add(i,"Jan");
        }
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(953);
        when(statistics.postsCount()).thenReturn(452);
        when(statistics.usersNames()).thenReturn(usersNames);
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
        when(statistics.postsCount()).thenReturn(70);
        when(statistics.commentsCount()).thenReturn(150);
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
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        stats.calculateAdvStatistics(statistics);

        int usersCount = stats.getUsersCount();
        Assert.assertEquals(0, usersCount);
    }
}
