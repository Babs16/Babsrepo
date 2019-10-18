package com.training.dao;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class APICall3 {

    @Test

    public void postAndGrabPayload(){

        String b = "{\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"location\\\":{\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"        \\\"lat\\\" : -38.383494,\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"        \\\"lng\\\" : 33.427362\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    },\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"accuracy\\\":50,\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"name\\\":\\\"Frontline house\\\",\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"phone_number\\\":\\\"(+91) 983 893 3937\\\",\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"address\\\" : \\\"29, side layout, cohen 09\\\",\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"types\\\": [\\\"shoe park\\\",\\\"shop\\\"],\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"website\\\" : \\\"http://google.com\\\",\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"    \\\"language\\\" : \\\"French-IN\\\"\\n\" +\n" +
                "                        \"\\n\" +\n" +
                "                        \"}\\n\"";
// GRAB THE RESPONSE
        RestAssured.baseURI="http://216.10.245.166";
        Response res=given().
                queryParam("key","qaclick123").
                body(b).
                when().
                post("/maps/api/place/add/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK")).
                extract().response();
        System.out.println("Ok up till this point");



    }
}
