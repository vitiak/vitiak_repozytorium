package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.GetStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GetStatisticsTest {
    @Test
    public void testCalculateStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("KowalskiUser");
        usersList.add("KowalskaUser");
        usersList.add("MichalskiUser");
        usersList.add("NowakUser");
        int postCount = 10;
        int commentCount = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);

        GetStatistics statistics = new GetStatistics(statisticsMock);

        //When
        int quantityUsers = statistics.usersCount;

        //Then
        Assert.assertEquals(4, quantityUsers);
    }



}
