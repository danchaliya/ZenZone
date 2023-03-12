package com.example.meditationapp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class extractMessageContentFromJSON {
    public static String parseMessage(String message) throws ParseException {

        Object obj = new JSONParser().parse(message);

        JSONObject jo = (JSONObject) obj;

        //String outmessage = (String) jo.get("choices");

        JSONArray ja = (JSONArray) jo.get("choices");

        jo = (JSONObject) ja.get(0);

        jo = (JSONObject) jo.get("message");

        String out_message = (String) jo.get("content");

        return out_message;

    }
}