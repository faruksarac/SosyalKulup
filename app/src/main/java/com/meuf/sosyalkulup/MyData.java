package com.meuf.sosyalkulup;


/**
 * Created by filipp on 9/16/2016.
 */
public class MyData {

    private int clubId;
    private String clubName,pics;

    public MyData(int clubId, String clubName, String pics) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.pics = pics;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }
}
