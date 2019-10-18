package com.training.base;

import com.training.files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class ExtractMultipleValues {

   @Test
   public void Test1(){

        // BaseURL or Host

        RestAssured.baseURI="https://maps.googleapis.com";

        Response res=given().
                param("location", "-33.8670522,151.1957362").
                param("radius", "500").
                param("key", "AIzaSyBcPmcPehDGGcjOf4QsdNDFovtZWtUUU0c").log().all().
                when().
                get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("results[0].name",equalTo("Sydney")).and().
                body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).
                extract().response();
        JsonPath js = ReusableMethods.rawToJson(res);
        int count = js.get("results.size()");
                for (int i=0; i<count; i++)
        {
            String listOfCities=js.get("results["+i+"].name");
            System.out.println(listOfCities);

        }



    }
}
