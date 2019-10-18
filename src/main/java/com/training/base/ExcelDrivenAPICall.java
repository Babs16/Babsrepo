package com.training.base;

import com.training.files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class ExcelDrivenAPICall {

    @Test
    public void addBook() throws IOException {
        RestAssured.baseURI ="http://216.10.245.166";
        Response resp = given().
                header("Content-Type","application/json").

                        body("{ \n" +
                                "   \"name\":\"Learn Appium Automation with Java\",\n" +
                                "   \"isbn\":\"bccd\",\n" +
                                "   \"aisle\":\"2028\",\n" +
                                "   \"author\":\"John foe\"\n" +
                                "}").
                        when().
                post("/Library/Addbook.php").
                        then().assertThat().statusCode(200).
                        extract().response();
        JsonPath js= ReusableMethods.rawToJson(resp);
        String id =js.get("ID");
        System.out.println(id);


    }



}
