package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("freeFlow")
public class FreeFlow {
    private String yearFrom;
    private String yearTo;
    private String monthFrom;
    private String monthTo;
    private String weekFrom;
    private String weekTo;
    private String dayFrom;
    private String dayTo;
    private String timeFrom;
    private String timeTo;

    public String getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(String yearFrom) {
        this.yearFrom = yearFrom;
    }

    public String getYearTo() {
        return yearTo;
    }

    public void setYearTo(String yearTo) {
        this.yearTo = yearTo;
    }

    public String getMonthFrom() {
        return monthFrom;
    }

    public void setMonthFrom(String monthFrom) {
        this.monthFrom = monthFrom;
    }

    public String getMonthTo() {
        return monthTo;
    }

    public void setMonthTo(String monthTo) {
        this.monthTo = monthTo;
    }

    public String getWeekFrom() {
        return weekFrom;
    }

    public void setWeekFrom(String weekFrom) {
        this.weekFrom = weekFrom;
    }

    public String getWeekTo() {
        return weekTo;
    }

    public void setWeekTo(String weekTo) {
        this.weekTo = weekTo;
    }

    public String getDayFrom() {
        return dayFrom;
    }

    public void setDayFrom(String dayFrom) {
        this.dayFrom = dayFrom;
    }

    public String getDayTo() {
        return dayTo;
    }

    public void setDayTo(String dayTo) {
        this.dayTo = dayTo;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }
}
