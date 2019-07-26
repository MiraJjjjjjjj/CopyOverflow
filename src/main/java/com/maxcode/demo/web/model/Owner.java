package com.maxcode.demo.web.model;

public class Owner {
    
    private Integer reputation;
    private Integer user_id;
    private String user_type;
    private Integer accept_rate;
    private String profile_image;
    private String display_name;
    private String link;

    public Owner(Integer reputation, Integer user_id, String user_type, Integer accept_rate, String profile_image, String display_name, String link) {
        this.reputation = reputation;
        this.user_id = user_id;
        this.user_type = user_type;
        this.accept_rate = accept_rate;
        this.profile_image = profile_image;
        this.display_name = display_name;
        this.link = link;
    }

    public Integer getReputation() {
        return this.reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return this.user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public Integer getAccept_rate() {
        return this.accept_rate;
    }

    public void setAccept_rate(Integer accept_rate) {
        this.accept_rate = accept_rate;
    }

    public String getProfile_image() {
        return this.profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}