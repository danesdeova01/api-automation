package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.ApiRequests;

public class PositiveTests {

    @Test
    public void testGetUserSuccess() {
        Response response = ApiRequests.getUser(1);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertTrue(response.jsonPath().getString("username").length() > 0);
    }
}
