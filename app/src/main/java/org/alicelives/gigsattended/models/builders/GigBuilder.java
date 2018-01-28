package org.alicelives.gigsattended.models.builders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.alicelives.gigsattended.models.Gig;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lee on 28/01/2018.
 */

public class GigBuilder {

    public static List<Gig> buildGigListFromJson(String json) {
        Gson gson = new Gson();
        Type gigListType = new TypeToken<ArrayList<Gig>>(){}.getType();
        return gson.fromJson(json, gigListType);
    }

}
