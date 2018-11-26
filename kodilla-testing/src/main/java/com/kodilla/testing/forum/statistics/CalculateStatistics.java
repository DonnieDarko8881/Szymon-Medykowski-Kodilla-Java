package com.kodilla.testing.forum.statistics;

public final class CalculateStatistics {

    public CalculateStatistics(int numberPosts, int numberComments, int numberUsers) {
        this.numberPosts = numberPosts;
        this.numberComments = numberComments;
        this.numberUsers = numberUsers;

    }

    //final
    final private int numberPosts;
    final private int numberComments;
    final private int numberUsers;

    private static double avrNumberPostsPerUser;
    private static double avrNumberCommentsPerUser;
    private static double avrNumberCommentsPerPost;



    /* public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }*/

    private static int usersCount(Statistics statistics) {
        return statistics.usersNames().size();
    }


    private static double avrNumberPostsPerUserCount(Statistics statistics) {
        avrNumberPostsPerUser = statistics.postsCount() / (double) usersCount(statistics);
        return avrNumberPostsPerUser;
    }

    private static double avrNumberCommentsPerUserCount(Statistics statistics) {
        avrNumberCommentsPerUser = statistics.commentsCount() / (double) usersCount(statistics);

        return avrNumberCommentsPerUser;
    }

    private static double avrNumberCommentsPerPostCount(Statistics statistics) {
        avrNumberCommentsPerPost = statistics.commentsCount() / (double) statistics.postsCount();
        return avrNumberCommentsPerPost;
    }

    public static void calculateAdvStatistics(Statistics statistics) {

        CalculateStatistics result = new CalculateStatistics(statistics.postsCount(),statistics.commentsCount(),statistics.usersNames().size());
        result.getNumberPosts(statistics);
        result.getNumberComments(statistics);
        result.getNumberUsers(statistics);
        result.getAvrNumberPostsPerUser(statistics);
        result.getAvrNumberCommentsPerPost(statistics);
        result.getAvrNumberCommentsPerUser(statistics);

    }

    public static String showStatistics(Statistics statistics) {
        return "CalculateStatistics{" +
                "numberPosts=" + getNumberPosts(statistics) +
                ", numberComments=" + getNumberComments(statistics) +
                ", numberUsers=" + getNumberUsers(statistics) +
                ", avrNumberPostsPerUser=" + getAvrNumberPostsPerUser(statistics) +
                ", avrNumberCommentsPerUser=" + getAvrNumberCommentsPerUser(statistics) +
                ", avrNumberCommentsPerPost=" + getAvrNumberCommentsPerPost(statistics) +
                '}';
    }



    public static int getNumberPosts(Statistics statistics) {
        return statistics.postsCount();
    }

    public static int getNumberComments(Statistics statistics) {
        return statistics.commentsCount();
    }

    public static int getNumberUsers(Statistics statistics) {
        return statistics.usersNames().size();
    }

    public static double getAvrNumberPostsPerUser(Statistics statistics) {
        return avrNumberPostsPerUserCount(statistics);
    }

    public static double getAvrNumberCommentsPerUser(Statistics statistics) {
        return avrNumberCommentsPerUserCount(statistics);
    }

    public static double getAvrNumberCommentsPerPost(Statistics statistics) {
        return avrNumberCommentsPerPostCount(statistics) ;
    }
}
