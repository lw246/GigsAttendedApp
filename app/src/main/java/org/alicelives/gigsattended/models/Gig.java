package org.alicelives.gigsattended.models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Lee on 28/01/2018.
 * Gig Model
 */

public class Gig {
    private Venue venue;
    private List<Band> bands;
    private Date date;
    private String flavour;
    private Integer rating;

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Band> getBands() {
        return bands;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public Calendar getDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar;
    }

    void setDate(Date date) {
        this.date = date;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
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

    private Integer volume;
}
