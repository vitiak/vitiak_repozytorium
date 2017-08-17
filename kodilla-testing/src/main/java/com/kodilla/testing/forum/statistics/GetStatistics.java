package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class GetStatistics {
//    Statistics statistics;

//    public GetStatistics(Statistics statistics) {this.statistics = statistics;}

//    public Statistics getStatistics() {        return statistics;    }

    private int usersCount= 0 ;
    private int postsCount=0;
    private int commentsCount=0;
    private double averagePostCount=0.0;
    private double averageCommentCount=0.0;
    private double averageCommentsPosts=0.0;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAverageCommentCount() {
        return averageCommentCount;
    }

    public double getAveragePostCount() {
        return averagePostCount;
    }

    public double getAverageCommentsPosts() {
        return averageCommentsPosts;
    }

    public void calculatedAdvStatistics(Statistics statistics) {
//        GetStatistics statisticsCalculator = new GetStatistics(statistics);

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(usersCount==0) {averagePostCount = 0;} else {averagePostCount = postsCount / usersCount;}
        if(usersCount==0) {averageCommentCount = 0;} else {averageCommentCount = commentsCount / usersCount;}
        if(postsCount==0) {averageCommentsPosts = 0;} else {averageCommentsPosts = commentsCount / postsCount;}

    }

//    public double getAveragePostCount() { return averagePostCount; }

}
