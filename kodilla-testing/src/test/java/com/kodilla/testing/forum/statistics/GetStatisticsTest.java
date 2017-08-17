package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.GetStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GetStatisticsTest {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateStatisticsWithMockSimply() {
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
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        GetStatistics getStatisticsCalculated = new GetStatistics();

        getStatisticsCalculated.calculatedAdvStatistics(statisticsMock);
        //When
        int quantityUsers = getStatisticsCalculated.getUsersCount();
        double averageComments = getStatisticsCalculated.getAverageCommentCount();
        double averagePosts = getStatisticsCalculated.getAveragePostCount();
        double averageCommentsPosts = getStatisticsCalculated.getAverageCommentsPosts();

        //Then
        Assert.assertEquals(usersList.size(), quantityUsers);
        Assert.assertEquals(commentCount / usersList.size(), averageComments, 0.01);
        Assert.assertEquals(postCount / usersList.size(), averagePosts, 0.01);
        Assert.assertEquals(commentCount / postCount, averageCommentsPosts, 0.01);

    }
    @Test
    public void testCalculateStatisticsWithMockUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        int postCount = 10;
        int commentCount = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        GetStatistics getStatisticsCalculated = new GetStatistics();

        getStatisticsCalculated.calculatedAdvStatistics(statisticsMock);
        //When
        int quantityUsers = getStatisticsCalculated.getUsersCount();
        double averageComments = getStatisticsCalculated.getAverageCommentCount();
        double averagePosts = getStatisticsCalculated.getAveragePostCount();
        double averageCommentsPosts = getStatisticsCalculated.getAverageCommentsPosts();

        //Then
        Assert.assertEquals(usersList.size(), quantityUsers);
        Assert.assertEquals(0, averageComments, 0.01);
        Assert.assertEquals(0, averagePosts, 0.01);
        Assert.assertEquals(commentCount / postCount, averageCommentsPosts, 0.01);
    }

    @Test
    public void testCalculateStatisticsWithMock100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        int n;
        for(n = 0; n < 100; n++) {             usersList.add("KowalskiUser" + n);         }

        int postCount = 10;
        int commentCount = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        GetStatistics getStatisticsCalculated = new GetStatistics();

        getStatisticsCalculated.calculatedAdvStatistics(statisticsMock);
        //When
        int quantityUsers = getStatisticsCalculated.getUsersCount();
        double averageComments = getStatisticsCalculated.getAverageCommentCount();
        double averagePosts = getStatisticsCalculated.getAveragePostCount();
        double averageCommentsPosts = getStatisticsCalculated.getAverageCommentsPosts();

        //Then
        Assert.assertEquals(usersList.size(), quantityUsers);
        Assert.assertEquals(commentCount / usersList.size(), averageComments, 0.01);
        Assert.assertEquals(postCount / usersList.size(), averagePosts, 0.01);
        Assert.assertEquals(commentCount / postCount, averageCommentsPosts, 0.01);
    }

    @Test
    public void testCalculateStatisticsWithMockPostsGreatComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        usersList.add("KowalskiUser");
        usersList.add("KowalskaUser");
        usersList.add("MichalskiUser");
        usersList.add("NowakUser");
        int postCount = 50;
        int commentCount = 20;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        GetStatistics getStatisticsCalculated = new GetStatistics();

        getStatisticsCalculated.calculatedAdvStatistics(statisticsMock);
        //When
        int quantityUsers = getStatisticsCalculated.getUsersCount();
        double averageComments = getStatisticsCalculated.getAverageCommentCount();
        double averagePosts = getStatisticsCalculated.getAveragePostCount();
        double averageCommentsPosts = getStatisticsCalculated.getAverageCommentsPosts();

        //Then
        Assert.assertEquals(usersList.size(), quantityUsers);
        Assert.assertEquals(commentCount / usersList.size(), averageComments, 0.01);
        Assert.assertEquals(postCount / usersList.size(), averagePosts, 0.01);
        Assert.assertEquals(commentCount / postCount, averageCommentsPosts, 0.01);
    }

    @Test
    public void testCalculateStatisticsWithMockSimplyZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        int postCount = 0;
        int commentCount = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentCount);

        GetStatistics getStatisticsCalculated = new GetStatistics();

        getStatisticsCalculated.calculatedAdvStatistics(statisticsMock);
        //When
        int quantityUsers = getStatisticsCalculated.getUsersCount();
        double averageComments = getStatisticsCalculated.getAverageCommentCount();
        double averagePosts = getStatisticsCalculated.getAveragePostCount();
        double averageCommentsPosts = getStatisticsCalculated.getAverageCommentsPosts();

        //Then
        Assert.assertEquals(usersList.size(), quantityUsers);
        Assert.assertEquals(0, averageComments, 0.01);
        Assert.assertEquals(0, averagePosts, 0.01);
        Assert.assertEquals(0, averageCommentsPosts, 0.01);
    }
}