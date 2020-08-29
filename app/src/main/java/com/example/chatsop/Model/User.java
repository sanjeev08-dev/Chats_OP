package com.example.chatsop.Model;

public class User {
    private String id;
    private  String  name;
    private String  imageURL;
    private String status;
    private String email;

    public User(String id, String name, String imageURL, String status, String email) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.status = status;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
