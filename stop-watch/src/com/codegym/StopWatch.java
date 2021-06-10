package com.codegym;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = new Date();
    }
    public void start() {
        this.startTime = new Date();
    }
    public void end() {
        this.endTime = new Date();
    }
    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }
}
