package org.alicelives.gigsattended.apirequests;

import org.alicelives.gigsattended.apirequests.BaseRequest;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
/**
 * Created by Lee on 28/01/2018.
 */

public class BaseRequestTest {
    private BaseRequest baseRequest;

    @Before
    public void setup() {
        baseRequest = new BaseRequest();
    }

    @Test
    public void convertStreamToString_ReturnsStringFinishingWithNewLine() {
        InputStream inputStream = new ByteArrayInputStream("A string".getBytes(StandardCharsets.UTF_8));
        assertEquals("A string\n", baseRequest.convertStreamToString(inputStream));
    }

    @Test
    public void convertToStreamToString_ThrowsNoStreamWhenStreamEmpty() {

    }

}
