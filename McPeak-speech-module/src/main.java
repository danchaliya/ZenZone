import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
public class main
{

    private static String PARAM_THEME;
    private static String PARAM_TIME;
    private static String PARAM_LEVEL;
    private static String[] PARAMS = new String[3];

    public static void main(String args[])
    {
        try
        {
            String[] input = new String[3];
            input[0] = "5 minute";
            input[1] = "rain";
            input[2] = "easy";
            controller.play_meditation(input);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}