package org.alicelives.gigsattended.models;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lee on 29/01/2018.
 * Test for Gig Model
 */

public class GigTest {
    @Test
    public void getDate_ConvertsToCalendarObjectOnReturn() {
        // Create date object from a Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2001, Calendar.DECEMBER, 31);
        Date date = cal.getTime();

        // Assign Date object to Gig
        Gig gig = new Gig();
        gig.setDate(date);

        // Check calendar is returned
        assertEquals(GregorianCalendar.class, gig.getDate().getClass());
        assertEquals(cal, gig.getDate());
    }
}
