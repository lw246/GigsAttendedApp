package org.alicelives.gigsattended.models.builders;

import org.alicelives.gigsattended.models.Gig;
import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Lee on 28/01/2018.
 */

public class GigBuilderTest {
    @Test
    public void buildGigListFromJson_CreatesGigListFromSinglePartialJsonArrayNoSubObjects() throws IOException {
        String validJson = "[{\"flavour\": \"spicy\"," +
                "\"rating\": 4," +
                "\"date\": \"2011-04-05\"," +
                "\"volume\": 11}]";
        List<Gig> gigList = GigBuilder.buildGigListFromJson(validJson);

        assertEquals("spicy", gigList.get(0).getFlavour());
        assertEquals(4, gigList.get(0).getRating().intValue());
        assertEquals(11, gigList.get(0).getVolume().intValue());

        assertEquals(2011, gigList.get(0).getDate().get(Calendar.YEAR));
        assertEquals(Calendar.APRIL, gigList.get(0).getDate().get(Calendar.MONTH));
        assertEquals(5, gigList.get(0).getDate().get(Calendar.DAY_OF_MONTH));
    }
}
