package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("x must belong to range 1 =< x < 2 and y can't be 1.5 " + e);

        } finally {
            System.out.println("\n\"Remember Every mistake makes you stronger " +
                    "but every Exception makes you stronger much more\" - By Szymon Mędykowski");
        }
    }
}
