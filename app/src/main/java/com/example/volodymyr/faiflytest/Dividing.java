package com.example.volodymyr.faiflytest;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Dividing {
    private static final int NUMBER_OF_WORDS = 4;
    private String sentence;

    public String getSentence() {
        return this.sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public ArrayList<String> divideSentence() {
        ArrayList<String> sentences = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(getSentence(), " ");
        while (st.hasMoreTokens()) {
            String temp ="";
            for (int i=0;i<NUMBER_OF_WORDS;i++) {
                if(st.hasMoreTokens()) {
                    temp = temp + st.nextToken() + " ";
                }
            }
            sentences.add(temp);
        }
        return sentences;
    }
}
