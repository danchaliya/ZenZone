package com.example.meditationapp;

import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class speakMessage {

    /** DEPRECATED
     public static void speak(String message) throws EngineException, AudioException, InterruptedException {

     //setting properties as Kevin Dictionary
     System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us" + ".cmu_us_kal.KevinVoiceDirectory");
     //registering speech engine
     Central.registerEngineCentral("com.sun.speech.freetts" + ".jsapi.FreeTTSEngineCentral");
     //create a Synthesizer that generates voice
     Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
     //allocates a synthesizer
     synthesizer.allocate();
     //resume a Synthesizer
     synthesizer.resume();
     //speak the specified text until the QUEUE become empty
     synthesizer.speakPlainText(message, null);
     synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
     //deallocating the Synthesizer
     synthesizer.deallocate();

     }**/

    public static void speakWithDelay(String longMessage, int time) throws AudioException, EngineException, InterruptedException {

        String[] lines = longMessage.split("\n");

        ArrayList<String> listLines = new ArrayList<String>();
        Collections.addAll(listLines,lines);

        for (int i = 0; i < listLines.size(); i += 1) {

            String line = listLines.get(i);

            if (line.length() == 0){

                System.out.println("Found a dud line");
                listLines.remove(i);

            } else {

                System.out.println(line.length());

            }

        }

        for (int i = 0; i < listLines.size(); i += 1) {

            String line = listLines.get(i);

            if (line.length() == 0){

                System.out.println("Found a dud line");
                listLines.remove(i);

            } else {

                System.out.println(line.length());

            }

        }

        for (String line : listLines) {

            System.out.println("Line found: " + line);

        }

        float numberOfLines = (((float) lines.length) - 1) / 2;
        float floatTime = time;

        int intLines = (int) numberOfLines;

        System.out.println(time);

        System.out.println(numberOfLines);

        float precise_time = floatTime / numberOfLines;

        System.out.println(precise_time);
        int timeBetweenMessages = (int) (precise_time * 60);
        System.out.println(timeBetweenMessages);

        String [] filteredLines = listLines.toArray(new String[0]);

        String firstLine = filteredLines[0];

        String[] restLines = new String[intLines - 1];
        System.arraycopy(filteredLines, 1, restLines, 0, restLines.length);

        //setting properties as Kevin Dictionary
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us" + ".cmu_us_kal.KevinVoiceDirectory");
        //registering speech engine
        Central.registerEngineCentral("com.sun.speech.freetts" + ".jsapi.FreeTTSEngineCentral");
        //create a Synthesizer that generates voice
        Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
        //allocates a synthesizer
        synthesizer.allocate();
        //resume a Synthesizer
        synthesizer.resume();

        synthesizer.speakPlainText(firstLine, null);
        for (String line: restLines) {
            TimeUnit.SECONDS.sleep(timeBetweenMessages);
            synthesizer.speakPlainText(line, null);
        }

        synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
        //deallocating the Synthesizer
        synthesizer.deallocate();

    }

}