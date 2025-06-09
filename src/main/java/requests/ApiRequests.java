package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiRequests {
    static {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    public static Response getUser(int userId) {
        return RestAssured.given()
                .when()
                .get("/users/" + userId);
    }
}
