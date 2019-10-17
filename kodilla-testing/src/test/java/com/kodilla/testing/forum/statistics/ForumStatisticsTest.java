package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {
    @Test
    public void calculateStatisticsWhenPostsCountEquals0() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        stats.calculateAdvStatistics(statistics);

        int postCount = stats.getPostsCount();
        Assert.assertEquals(0, postCount);
    }

    @Test
    public void calculateStatisticsWhenPostsCountEquals1000() {
        Stats stats = new Stats();
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        stats.calculateAdvStatistics(statistics);

        int postCount = stats.getPostsCount();
        Assert.assertEquals(1000, postCount);
    }

}
