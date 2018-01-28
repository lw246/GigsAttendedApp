package org.alicelives.gigsattended.models;

import java.util.List;

/**
 * Created by Lee on 28/01/2018.
 */

public class Band {
    private String name;
    private List<String> songs_played;
    private Integer rating;
    private Integer volume;
    private Boolean main_act;
    private String genera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs_played() {
        return songs_played;
    }

    public void setSongs_played(List<String> songs_played) {
        this.songs_played = songs_played;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getMain_act() {
        return main_act;
    }

    public void setMain_act(Boolean main_act) {
        this.main_act = main_act;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }
}
