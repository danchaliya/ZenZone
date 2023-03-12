import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class apiCaller {

    private static String send_message;

    public static String request(String[] REQUEST_PARAMS) throws IOException {
        URL url = new URL("https://api.openai.com/v1/chat/completions");
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setRequestMethod("POST");

        httpConn.setRequestProperty("Content-Type", "application/json");
        httpConn.setRequestProperty("Authorization", "Bearer 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");

        httpConn.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(httpConn.getOutputStream());

        StringBuilder sb = new StringBuilder();
        sb.append("{\"model\": \"gpt-3.5-turbo\",\"messages\": [{\"role\": \"user\", \"content\": \"write a numbered list of instructions for a ");
        sb.append(REQUEST_PARAMS[0]);
        sb.append(" ");
        sb.append(REQUEST_PARAMS[1]);
        sb.append(" themed meditation\"}],\"temperature\": 0.7}");
        send_message = sb.toString();
        writer.write(send_message);
        writer.flush();
        writer.close();
        httpConn.getOutputStream().close();

        InputStream responseStream = httpConn.getResponseCode() / 100 == 2
                ? httpConn.getInputStream()
                : httpConn.getErrorStream();
        Scanner s = new Scanner(responseStream).useDelimiter("\\A");
        String response = s.hasNext() ? s.next() : "";
        return response;
    }
}