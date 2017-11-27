package com.migu.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("BarrageActivity")
public class BarrageActivity {
    private String filmId;
    private String activityId;
    private String activityName;
    private String barrageFlag;

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getBarrageFlag() {
        return barrageFlag;
    }

    public void setBarrageFlag(String barrageFlag) {
        this.barrageFlag = barrageFlag;
    }
}
