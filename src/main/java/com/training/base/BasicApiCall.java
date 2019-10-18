package com.training.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class BasicApiCall {

    public static void main(String[] args) {

        // BaseURL or Host

        RestAssured.baseURI="https://maps.googleapis.com";

        given().
                param("location", "-33.8670522,151.1957362").
                param("radius", "500").
                param("key", "AIzaSyBcPmcPehDGGcjOf4QsdNDFovtZWtUUU0c").
                when().
                get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("results[0].name",equalTo("Sydney")).and().
                body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM"));
                //body("results[0].geometry.location.lat",equalTo("-33.8688197"));
        System.out.println("My test has passed");

    }
}
