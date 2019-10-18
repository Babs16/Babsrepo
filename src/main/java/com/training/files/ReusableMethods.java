package com.training.files;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {

    public static JsonPath rawToJson(Response r)
    {
        String respon= r.asString();
        JsonPath x= new JsonPath(respon);
        return x;
    }


    public static XmlPath rawToXML(Response response)
    {
        String resp= response.asString();
        XmlPath x= new XmlPath(resp);
        return x;
    }
}
