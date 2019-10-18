package com.training.files;

public class payload {

    public static String getPostData(){

        String b ="{ \n" +
                "   \"location\":{ \n" +
                "      \"lat\":-38.383494,\n" +
                "      \"lng\":33.427362\n" +
                "   },\n" +
                "   \"accuracy\":50,\n" +
                "   \"name\":\"Frontline house\",\n" +
                "   \"phone_number\":\"(+91) 983 893 3937\",\n" +
                "   \"address\":\"29, side layout, cohen 09\",\n" +
                "   \"types\":[ \n" +
                "      \"shoe park\",\n" +
                "      \"shop\"\n" +
                "   ],\n" +
                "   \"website\":\"http://google.com\",\n" +
                "   \"language\":\"French-IN\"\n" +
                "}\n";

        return b;

    }

// Insert variable into String within the Json Payload
    public static String Addbook(String isbn, String Aisle)
    {
        String payload= "{\n" +
                "   \"name\":\"Learn Appium Automation with Java\",\n" +
                "   \"isbn\":\""+isbn+"\",\n" +
                "   \"aisle\":\""+Aisle+"\",\n" +
                "   \"author\":\"John foe\"\n" +
                "}";

        return payload;
    }

    public static String mockEvent(){
        String eventPayload="{" +
                "   \"meetingCode\":\"MCap\"," +
                "   \"name\":\"Monmore Cap\"," +
                "   \"category\":\"HR\"," +
                "   \"country\":\"UK\"," +
                "   \"startTime\":\"17:42\"," +
                "   \"endTime\":\"20:25\"," +
                "   \"numberOfEvents\":5," +
                "   \"sportcode\":\"MC\"" +
                "}";

        return eventPayload;
    }
}
