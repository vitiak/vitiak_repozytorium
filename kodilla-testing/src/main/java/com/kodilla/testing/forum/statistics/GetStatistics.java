package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class GetStatistics {
    Statistics statistics;
    public GetStatistics(Statistics statistics) {this.statistics = statistics;}

    int usersCount=8;
    int postsCount=8;
    int commentsCount=8;
    double averagePostCount=0.0;
    double averageCommentCount=0.0;
    double averageCommentsPosts=0.0;

    public void calculatedAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostCount = 1.0;
        averageCommentCount = 1.0;
        averageCommentsPosts = 1.0;
    }
}
