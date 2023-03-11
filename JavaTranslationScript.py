           
           
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Main {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public static final String OPENAI_API_KEY = "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";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        String[] categories = { "Ocean Category", "Rainforest Category", "Star Category", "Sky Category",
                "Garden Category" };
        System.out.println("Choose between these categories for the type of meditation you want:");
        for (String category : categories) {
            System.out.println(category);
        }
        System.out.print("Category: ");
        String category = scanner.nextLine();

        String[] levels = { "Beginner", "Intermediate", "Advanced" };
        System.out.println("Choose between the following options:");
        for (String level : levels) {
            System.out.println(level);
        }
        System.out.print("Level: ");
        String level = scanner.nextLine();

        switch (level) {
            case "Beginner":
                ai_meditationBeginner(category, userName);
                break;
            case "Intermediate":
                ai_meditationIntermediate(category, userName);
                break;
            case "Advanced":
                ai_meditationAdvanced(category, userName);
                break;
            default:
                System.out.println("Invalid level selected");
                break;
        }

        scanner.close();
    }

    public static void ai_meditationBeginner(String category, String userName) {
        String prompt = "create a guided meditation of " + category + " for user level " + "Beginner";

        String responseText = generateResponse(prompt, 1200);
        System.out.println("Welcome " + userName + ", this is your meditation: " + responseText);
    }

    public static void ai_meditationIntermediate(String category, String userName) {
        String prompt = "create a guided meditation of " + category + " for user level " + "Intermediate";

        String responseText = generateResponse(prompt, 1000);
        System.out.println("Welcome " + userName + ", this is your meditation: " + responseText);
    }

    public static void ai_meditationAdvanced(String category, String userName) {
        String prompt = "create a guided meditation of " + category + " for user level " + "Advanced";

        String responseText = generateResponse(prompt, 600);
        System.out.println("Welcome " + userName + ", this is your meditation: " + responseText);
    }

    public static String generateResponse(String prompt, int maxTokens) {
        OkHttpClient client = new OkHttpClient();

        JSONObject payload = new JSONObject();
        payload.put("prompt", prompt);
        payload.put("temperature", 0.5);
        payload.put("max_tokens", maxTokens);

        RequestBody requestBody = RequestBody.create(payload.toString(), JSON);

        Request request = new Request.Builder()
                .url("https://api.openai.com/v1/engines/text-davinci-002/completions")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + OPENAI_API_KEY)
                .post(requestBody)
                .build();

        try {
            Response response = client.newCall(request).execute();
           
