package com.example.volodymyr.faiflytest;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Dividing {

    private String sentence;

    public ArrayList<String> divideSentence() {
        ArrayList<String> sentences = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(getSentence(), " ");
        while (st.hasMoreTokens()) {
            String temp ="";
            for (int i=0;i<4;i++) {
                if(st.hasMoreTokens()) {
                    temp = temp + st.nextToken() + " ";
                }
            }
            sentences.add(temp);
        }
        return sentences;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
