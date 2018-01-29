package org.alicelives.gigsattended.models;

/**
 * Created by Lee on 28/01/2018.
 * Venue model
 */

public class Venue {
    private String name;
    private String city;
    private String country;
    private Integer dive_rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDive_Rating() {
        return dive_rating;
    }

    public void setDive_Rating(Integer dive_Rating) {
        this.dive_rating = dive_Rating;
    }
}
