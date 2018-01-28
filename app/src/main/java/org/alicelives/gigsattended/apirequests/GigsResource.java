package org.alicelives.gigsattended.apirequests;

import android.content.res.Resources;

import com.google.gson.Gson;

import org.alicelives.gigsattended.R;
import org.alicelives.gigsattended.models.Gig;
import org.alicelives.gigsattended.models.builders.GigBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.util.List;


/**
 * Created by Lee on 28/01/2018.
 */

public class GigsResource extends BaseRequest {

    public List<Gig> getAllGigs(String gigsUrl) throws IOException {
        HttpResponse httpResponse = Request.Get(gigsUrl)
                .execute()
                .returnResponse();
        String httpBody = getBodyStringFromResponse(httpResponse);
        return GigBuilder.buildGigListFromJson(httpBody);
    }
}
