package org.alicelives.gigsattended.models.builders;

import org.alicelives.gigsattended.models.Band;
import org.alicelives.gigsattended.models.Gig;
import org.alicelives.gigsattended.models.Venue;
import org.junit.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lee on 28/01/2018.
 * Tests for the GigBuilder class
 */

public class GigBuilderTest {
    @Test
    public void buildGigListFromJson_CreateGigListFromJsonArray_FullObjects() throws IOException {
        String gigJson = createGigJsonArray();
        List<Gig> gigList = GigBuilder.buildGigListFromJson(gigJson);

        assertEquals(2, gigList.size());

        // First Gig
        Gig gigOne = gigList.get(0);
        assertEquals("spicy", gigOne.getFlavour());
        assertEquals(5, gigOne.getRating().intValue());
        assertEquals(11, gigOne.getVolume().intValue());
        assertEquals(2011, gigOne.getDate().get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, gigOne.getDate().get(Calendar.MONTH));
        assertEquals(31, gigOne.getDate().get(Calendar.DAY_OF_MONTH));
        // First Band
        Band bandOne = gigOne.getBands().get(0);
        assertEquals("First Band", bandOne.getName());
        assertEquals("Song One", bandOne.getSongs_played().get(0));
        assertEquals("Song Two", bandOne.getSongs_played().get(1));
        assertEquals(3, bandOne.getRating().intValue());
        assertEquals(7, bandOne.getVolume().intValue());
        assertEquals(true, bandOne.getMain_act());
        assertEquals("Rock", bandOne.getGenera());
        // Second Band
        Band bandTwo = gigOne.getBands().get(1);
        assertEquals("Second Band", bandTwo.getName());
        assertEquals("Song Three", bandTwo.getSongs_played().get(0));
        assertEquals("Song Four", bandTwo.getSongs_played().get(1));
        assertEquals(3, bandTwo.getRating().intValue());
        assertEquals(7, bandTwo.getVolume().intValue());
        assertEquals(false, bandTwo.getMain_act());
        assertEquals("metal", bandTwo.getGenera());
        // Venue One
        Venue venueOne = gigOne.getVenue();
        assertEquals("venue one", venueOne.getName());
        assertEquals("Sheffield", venueOne.getCity());
        assertEquals("England", venueOne.getCountry());
        assertEquals(4, venueOne.getDive_Rating().intValue());

        // Second Gig
        Gig gigTwo = gigList.get(1);
        assertEquals("salty", gigTwo.getFlavour());
        assertEquals(3, gigTwo.getRating().intValue());
        assertEquals(4, gigTwo.getVolume().intValue());
        assertEquals(2017, gigTwo.getDate().get(Calendar.YEAR));
        assertEquals(Calendar.DECEMBER, gigTwo.getDate().get(Calendar.MONTH));
        assertEquals(31, gigTwo.getDate().get(Calendar.DAY_OF_MONTH));
        // Third Band
        Band bandThree = gigTwo.getBands().get(0);
        assertEquals("Third Band", bandThree.getName());
        assertEquals("Song Five", bandThree.getSongs_played().get(0));
        assertEquals("Song Six", bandThree.getSongs_played().get(1));
        assertEquals(5, bandThree.getRating().intValue());
        assertEquals(9, bandThree.getVolume().intValue());
        assertEquals(false, bandThree.getMain_act());
        assertEquals("Country", bandThree.getGenera());
        // Fourth Band
        Band bandFour = gigTwo.getBands().get(1);
        assertEquals("Fourth Band", bandFour.getName());
        assertEquals("Song Seven", bandFour.getSongs_played().get(0));
        assertEquals("Song Eight", bandFour.getSongs_played().get(1));
        assertEquals(2, bandFour.getRating().intValue());
        assertEquals(4, bandFour.getVolume().intValue());
        assertEquals(true, bandFour.getMain_act());
        assertEquals("Pop", bandFour.getGenera());
        // Venue Two
        Venue venueTwo = gigTwo.getVenue();
        assertEquals("venue two", venueTwo.getName());
        assertEquals("Florence", venueTwo.getCity());
        assertEquals("Italy", venueTwo.getCountry());
        assertEquals(2, venueTwo.getDive_Rating().intValue());
    }

    private String createGigJsonArray() {

        return "[\n" +
                "  {\n" +
                "    \"flavour\": \"spicy\",\n" +
                "    \"rating\": 5,\n" +
                "    \"date\": \"2011-01-31\",\n" +
                "    \"volume\": 11,\n" +
                "    \"bands\": [\n" +
                "      {\n" +
                "        \"name\": \"First Band\",\n" +
                "        \"songs_played\": [\n" +
                "          \"Song One\",\n" +
                "          \"Song Two\"\n" +
                "        ],\n" +
                "        \"rating\": 3,\n" +
                "        \"volume\": 7,\n" +
                "        \"main_act\": true,\n" +
                "        \"genera\": \"Rock\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Second Band\",\n" +
                "        \"songs_played\": [\n" +
                "          \"Song Three\",\n" +
                "          \"Song Four\"\n" +
                "        ],\n" +
                "        \"rating\": 3,\n" +
                "        \"volume\": 7,\n" +
                "        \"main_act\": false,\n" +
                "        \"genera\": \"metal\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"venue\": {\n" +
                "      \"name\": \"venue one\",\n" +
                "      \"city\": \"Sheffield\",\n" +
                "      \"country\": \"England\",\n" +
                "      \"dive_rating\": 4\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"flavour\": \"salty\",\n" +
                "    \"rating\": 3,\n" +
                "    \"date\": \"2017-12-31\",\n" +
                "    \"volume\": 4,\n" +
                "    \"bands\": [\n" +
                "      {\n" +
                "        \"name\": \"Third Band\",\n" +
                "        \"songs_played\": [\n" +
                "          \"Song Five\",\n" +
                "          \"Song Six\"\n" +
                "        ],\n" +
                "        \"rating\": 5,\n" +
                "        \"volume\": 9,\n" +
                "        \"main_act\": false,\n" +
                "        \"genera\": \"Country\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Fourth Band\",\n" +
                "        \"songs_played\": [\n" +
                "          \"Song Seven\",\n" +
                "          \"Song Eight\"\n" +
                "        ],\n" +
                "        \"rating\": 2,\n" +
                "        \"volume\": 4,\n" +
                "        \"main_act\": true,\n" +
                "        \"genera\": \"Pop\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"venue\": {\n" +
                "      \"name\": \"venue two\",\n" +
                "      \"city\": \"Florence\",\n" +
                "      \"country\": \"Italy\",\n" +
                "      \"dive_rating\": 2\n" +
                "    }\n" +
                "  }\n" +
                "]";
    }
}
