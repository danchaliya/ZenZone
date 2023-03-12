package com.example.meditationapp;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class controller
{

    private static String PARAM_THEME;
    private static String PARAM_TIME;
    private static String PARAM_LEVEL;
    private static int PARAM_RAW_TIME;
    private static String[] PARAMS = new String[3];

    public static void play_meditation(String args[])
    {
        try
        {
            PARAM_TIME = args[0];
            PARAM_THEME = args[1];
            PARAM_LEVEL = args[2];
            PARAMS[0] = PARAM_TIME;
            PARAM_RAW_TIME = Integer.valueOf(PARAM_TIME.split(" ")[0]);
            PARAMS[1] = PARAM_THEME;
            PARAMS[2] = PARAM_LEVEL;
            String apiResult = apiCaller.request(PARAMS);
            String parsedResult = extractMessageContentFromJSON.parseMessage(apiResult);
            System.out.println(parsedResult);
            String finalResult = parsedResult;
            speakMessage.speakWithDelay(finalResult,PARAM_RAW_TIME);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String get_response(String theme) throws IOException, ParseException {
        PARAMS[0] = "10 minute";
        PARAMS[1] = theme;
        PARAMS[2] = "easy";
        String apiResult = apiCaller.request(PARAMS);
        String parsedResult = extractMessageContentFromJSON.parseMessage(apiResult);
        String finalResult = parsedResult;

        return finalResult;

    }
}