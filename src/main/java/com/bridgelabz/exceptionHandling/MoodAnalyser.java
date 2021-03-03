package com.bridgelabz.exceptionHandling;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message){

        this.message = message;

    }

    public String analyseMood(){

        if (message.contains("sad")){

            return "SAD";

        }
        else {

            return "HAPPY";

        }

    }

}
