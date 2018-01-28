package org.alicelives.gigsattended.apirequests;

import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Lee on 28/01/2018.
 */

public class BaseRequest {

    public String getBodyStringFromResponse(HttpResponse httpResponse) throws IOException {
         InputStream inputStream = httpResponse.getEntity().getContent();
         String httpBody = convertStreamToString(inputStream);
         return httpBody;
    }

    public String convertStreamToString(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder("");

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line)
                        .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
