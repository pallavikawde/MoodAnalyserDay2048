package com.bridgelabz;

public class MoodAnalyzer {

    /**
***** Analyze Mood method*****
     */
    //calling  analyzemood fuction
    public String analyzeMood(String message){

// if else return happy sad
       if(message.contains("sad")){
          return "SAD";
       }
        else {
            return "HAPPY";
        }
   }
}

