package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

        @Test
        public void testMoodAnalysis(){
            MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer();

            String mood=moodAnalyzerObj.analyzeMood("This is a happy name Message");

            Assertions.assertEquals(mood,"SAD");
        }
        @Test
        public void testOtherMoodAnalysis(){
            MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer();

            String mood = moodAnalyzerObj.analyzeMood("this contains happy message");

            Assertions.assertEquals(mood,"HAPPY");
        }

    @Test
   public void when_null_return_happy() {
            MoodAnalyzer moodAnalyzerobj = new MoodAnalyzer(null);
        String mood = moodAnalyzerobj.analyzeMood("when null return happy");

        Assertions.assertEquals(mood,"HAPPY");
    }

    }


