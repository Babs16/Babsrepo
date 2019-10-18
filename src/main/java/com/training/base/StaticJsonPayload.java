package com.training.base;

import com.training.files.ReusableMethods;
import com.training.files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class StaticJsonPayload {

    @Test
    public void addBook() throws IOException {
        RestAssured.baseURI ="http://216.10.245.166";
        Response resp = given().
                header("Content-Type","application/json").

                body(GenerateStringFromResource("C:\\Users\\bfatade\\Documents\\Babs\\payloadxs.json")).
                when().
                post("/Library/Addbook.php").
                then().assertThat().statusCode(200).
                extract().response();
        JsonPath js= ReusableMethods.rawToJson(resp);
        String id =js.get("ID");
        System.out.println(id);

    }

    public static String GenerateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
