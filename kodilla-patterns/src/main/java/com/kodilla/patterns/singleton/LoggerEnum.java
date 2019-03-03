package com.kodilla.patterns.singleton;

public enum LoggerEnum {
    INSTANCE;

    private String lastLog = "";

    public void log(String log) {
        if(log!=null){
            lastLog = log;
            System.out.println("Log: [" + log + "]");
        } else
            throw new WrongContentException("Log cant be null");
    }

    public String getLastLog() {
        return lastLog;
    }
}
