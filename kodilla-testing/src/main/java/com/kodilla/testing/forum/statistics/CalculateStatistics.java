package com.kodilla.testing.forum.statistics;

public final class CalculateStatistics {

    final private Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private static int usersCount(Statistics statistics) {
        return statistics.usersNames().size();
    }


    private static double avrNumberPostsPerUserCount(Statistics statistics) {
        return statistics.postsCount() / (double) usersCount(statistics);
    }

    private static double avrNumberCommentsPerUserCount(Statistics statistics) {
        return statistics.commentsCount() / (double) usersCount(statistics);
    }

    private static double avrNumberCommentsPerPostCount(Statistics statistics) {

        return statistics.commentsCount() / (double) statistics.postsCount();
    }

    public static void calculateAdvStatistics(Statistics statistics) {

        CalculateStatistics result = new CalculateStatistics(statistics);
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
        return avrNumberCommentsPerPostCount(statistics);
    }
}
