package com.training.base;

import com.training.files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestWithXml {

    @Test
    public void postData() throws IOException {
        String postdata = GenerateStringFromResource("C:\\Users\\bfatade\\Documents\\Babs\\postdata.xml");
        RestAssured.baseURI ="http://216.10.245.166";
        Response resp = given()
                .queryParam("key","qaclick123").
                body(postdata).
                when().post("/maps/api/place/add/xml").
                then().assertThat().statusCode(200).and().contentType(ContentType.XML).
                extract().response();
//        XmlPath x=ReusableMethods .rawToXML(resp);
//        System.out.println(x.get("response.place_id"));

        //CHECK WHY THIS IS NOT RUNNING. I THINK IT'S BECAUSE WE HAVE USED THE SAME VARIABLE "response" IN THE XML


    }

    public static String GenerateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));
    }

}
