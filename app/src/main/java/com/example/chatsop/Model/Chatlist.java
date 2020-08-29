package com.example.chatsop.Model;

public class Chatlist {
    private double time;

    private String id;

    public Chatlist() {
    }

    public Chatlist(String id ,double time) {
        this.id = id;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
