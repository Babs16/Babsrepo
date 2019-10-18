package com.training.base;

import com.training.files.ReusableMethods;
import com.training.files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DynamicJson {



    @Test(dataProvider = "BookData")
    public void addBook(String isbn, String Aisle)

    {
        RestAssured.baseURI ="http://216.10.245.166";
        Response resp = given().
                header("Content-Type","application/json").

                body(payload.Addbook(isbn, Aisle)).
                when().
                post("/Library/Addbook.php").
                then().assertThat().statusCode(200).
                extract().response();
        JsonPath js= ReusableMethods.rawToJson(resp);
        String id =js.get("ID");
        System.out.println(id);

    }

    @DataProvider(name="BookData")
    public Object[][] getData()
    {
        // Array = colloection of elements
        // Mulitdimensional Array= Collection of Arrays

        return new Object[][] {{"once", "1111"},{"twice","2222"},{"thrice","3333"}};
    }
}
