package com.training.base;

import com.training.files.ReusableMethods;
import com.training.files.payload;
import com.training.files.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class MockEventDataProvider {

    Properties prop = new Properties();
    @BeforeTest

    public void getData() throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\bfatade\\capp20cucumberTestFramework\\src\\main\\java\\com\\training\\files\\env.properties");
        prop.load(fis);
        prop.getProperty("CAPPHOST");
    }

    @Test
    public void postData(){

        RestAssured.baseURI=prop.getProperty("CAPPHOST");

        Response event=given()
                .port(80).
                body(payload.mockEvent()).
                when()
                .contentType(ContentType.JSON)
                .post(resources.createMeeting()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                extract().response();
        System.out.println("Ok up till this point");

        // TASK 2- GRAB THE PLACE ID FROM RESPONSE
        JsonPath x= ReusableMethods.rawToJson(event);

        //BELOW (NEXT LINE) IS THE CODE I ADDED  IN ORDER TO MAKE
        String trackname=x.get("name");

        System.out.println(trackname);
        //        given().
//                queryParam("key","qaclick123").
//                body("{"+"\"place_id\": \""+placeid+"\""+"}").
//                when().
//                post("/maps/api/place/delete/json").
//                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
//                body("status",equalTo("OK"));
//        System.out.println("We did it!!");
//
    }
}
