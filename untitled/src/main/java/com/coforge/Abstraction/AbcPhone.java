package com.coforge.Abstraction;

public class AbcPhone implements phone,SmartPhone,MyPhone {
    private int regNo;
    private String model;
    private float cost;

    public AbcPhone(int regNo, String model, float cost) {
        this.regNo = regNo;
        this.model = model;
        this.cost = cost;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public void calender() {
        System.out.println("abcphone has calender facility");
    }

    @Override
    public void email() {
        System.out.println("abcphone has email facility");
    }

    @Override
    public void call() {
        System.out.println("abcphone has call facility");
    }

    @Override
    public void message() {
        System.out.println("abcphone has messaging facility");
    }

    @Override
    public void playAudioSongs() {
        System.out.println("abcphone has playAudioSongs facility");

    }

    @Override
    public void playVideo() {
        System.out.println("abcphone has playVideo facility");
    }

    @Override
    public void netSurf() {
        System.out.println("abcphone has netSurf facility");
    }

    @Override
    public void payment() {
        System.out.println("abcphone has payment facility");
    }
}
