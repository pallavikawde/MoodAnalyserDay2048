package com.bridgelabz;

public class MoodAnalyzer {

    public MoodAnalyzer(Object o) {
    }

    public MoodAnalyzer() {

    }

    /**
     * **** Analyze Mood method*****
     */
    //calling  analyzemood fuction
    public String analyzeMood(String message) {
        try {
            if (message.contains("sad"))
                return "SAD";

            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}

