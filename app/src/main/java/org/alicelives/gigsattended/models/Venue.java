package org.alicelives.gigsattended.models;

/**
 * Created by Lee on 28/01/2018.
 */

public class Venue {
    private String Name;
    private String City;
    private String Country;
    private Integer Dive_Rating;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getDive_Rating() {
        return Dive_Rating;
    }

    public void setDive_Rating(Integer dive_Rating) {
        Dive_Rating = dive_Rating;
    }
}
