package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.ApiRequests;

public class NegativeTests {

    @Test
    public void testGetUserNotFound() {
        Response response = ApiRequests.getUser(9999);
        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
