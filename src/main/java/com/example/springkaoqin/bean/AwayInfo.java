package com.example.springkaoqin.bean;


import java.sql.Timestamp;

public class AwayInfo {
    private String wno;
    private String bistate;
    private Timestamp bitime;
    private String bireason;

    // Getter and Setter methods for 'wno'
    public String getWno() {
        return wno;
    }

    public void setWno(String wno) {
        this.wno = wno;
    }

    // Getter and Setter methods for 'bistate'
    public String getBistate() {
        return bistate;
    }

    public void setBistate(String bistate) {
        this.bistate = bistate;
    }

    // Getter and Setter methods for 'bitime'
    public Timestamp getBitime() {
        return bitime;
    }

    public void setBitime(Timestamp bitime) {
        this.bitime = bitime;
    }

    // Getter and Setter methods for 'bireason'
    public String getBireason() {
        return bireason;
    }

    public void setBireason(String bireason) {
        this.bireason = bireason;
    }
}
