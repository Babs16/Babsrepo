package com.training.base;

import com.training.files.ReusableMethods;
import com.training.files.resources;
import com.training.files.payload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class BasicAPICall2 {
    Properties prop = new Properties();
    @BeforeTest

    public void getData() throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\bfatade\\capp20cucumberTestFramework\\src\\main\\java\\com\\training\\files\\env.properties");
        prop.load(fis);
        prop.getProperty("HOST");
    }

    @Test
    public void postData(){


// GRAB THE RESPONSE
        RestAssured.baseURI=prop.getProperty("HOST");
       Response res=given().
                queryParam("key",prop.getProperty("KEY")).
                body(payload.getPostData()).
                when().
               post(resources.placePostData()).
               then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK")).
               extract().response();
        System.out.println("Ok up till this point");

       // TASK 2- GRAB THE PLACE ID FROM RESPONSE
        JsonPath x= ReusableMethods.rawToJson(res);

        //BELOW (NEXT LINE) IS THE CODE I ADDED MYSELF IN ORDER TO MAKE
        String placeid=x.get("place_id");

        System.out.println(placeid);

        // TASK 3, PLACE THIS PLACE ID in THE DELETE REQUEST

        given().
                queryParam("key","qaclick123").
               body("{"+"\"place_id\": \""+placeid+"\""+"}").
                when().
                post("/maps/api/place/delete/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK"));
        System.out.println("We did it!!");

    }
}



