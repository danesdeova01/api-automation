package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.ApiRequests;

public class BoundaryTests {

    @Test
    public void testGetUserZero() {
        Response response = ApiRequests.getUser(0);
        Assert.assertTrue(response.getStatusCode() == 404 || response.getStatusCode() == 400);
    }
}
