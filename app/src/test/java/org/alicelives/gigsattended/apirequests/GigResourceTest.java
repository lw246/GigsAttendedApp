package org.alicelives.gigsattended.apirequests;

import org.alicelives.gigsattended.apirequests.GigsResource;
import org.alicelives.gigsattended.models.Gig;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by Lee on 28/01/2018.
 */

public class GigResourceTest {
    @Test
    public void getGigListFromApi_ReturnsGigList() throws IOException {
        GigsResource gigsResource = new GigsResource();
        List<Gig> gigList = gigsResource.getAllGigs("http://192.168.1.34/gigs");

        assertNotNull(gigList);
    }



}
