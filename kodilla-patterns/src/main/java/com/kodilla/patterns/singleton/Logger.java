package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    private static Object object = new Object();
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (object) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String log) {
        if (log != null) {
            lastLog = log;
            System.out.println("Log: [" + log + "]");
        } else
            //zmien wyjatek unikamy nullPointerException
            throw new WrongContentException("Log cant be null");
    }

    public String getLastLog() {
        return lastLog;
    }
}

