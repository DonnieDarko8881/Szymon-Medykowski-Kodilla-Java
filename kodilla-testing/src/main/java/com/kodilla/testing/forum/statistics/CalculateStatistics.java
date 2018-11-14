package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    Statistics statistics;
    private int numberPosts;
    private int numberComments;
    private int numberUsers;
    private double avrNumberPostsPerUser;
    private double avrNumberCommentsPerUser;
    private double avrNumberCommentsPerPost;


    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int usersCount() {
        numberUsers = statistics.usersNames().size();
        return numberUsers;
    }


    private double avrNumberPostsPerUserCount() {
        avrNumberPostsPerUser = statistics.postsCount() / (double) usersCount();
        return avrNumberPostsPerUser;
    }

    private double avrNumberCommentsPerUserCount() {
        avrNumberCommentsPerUser = statistics.commentsCount() / (double) usersCount();

        return avrNumberCommentsPerUser;
    }

    private double avrNumberCommentsPerPostCount() {
        avrNumberCommentsPerPost = statistics.commentsCount() / (double) statistics.postsCount();
        return avrNumberCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberPosts = statistics.postsCount();
        numberComments = statistics.commentsCount();
        numberUsers = usersCount();
        avrNumberPostsPerUser = avrNumberPostsPerUserCount();
        avrNumberCommentsPerUser = avrNumberCommentsPerUserCount();
        avrNumberCommentsPerPost = avrNumberCommentsPerPostCount();
    }

    public void showStatistics() {
        toString();
    }

    @Override
    public String toString() {
        return "CalculateStatistics{" +
                "numberPosts=" +  numberPosts +
                ", numberComments=" + numberComments +
                ", numberUsers=" + numberUsers+
                ", avrNumberPostsPerUser=" + avrNumberPostsPerUser +
                ", avrNumberCommentsPerUser=" + avrNumberCommentsPerUser +
                ", avrNumberCommentsPerPost=" + avrNumberCommentsPerPost +
                '}';
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public int getNumberComments() {
        return numberComments;
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    public double getAvrNumberPostsPerUser() {
        return avrNumberPostsPerUser;
    }

    public double getAvrNumberCommentsPerUser() {
        return avrNumberCommentsPerUser;
    }

    public double getAvrNumberCommentsPerPost() {
        return avrNumberCommentsPerPost;
    }
}
