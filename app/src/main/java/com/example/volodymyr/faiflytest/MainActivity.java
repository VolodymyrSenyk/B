package com.example.volodymyr.faiflytest;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView sentences;
    private EditText input;
    private Button split;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentences = (TextView) findViewById(R.id.textView);
        result = (TextView) findViewById(R.id.textView2);
        input = (EditText) findViewById(R.id.editText);
        split = (Button) findViewById(R.id.button);

        String sentence = input.getText().toString();
        Dividing Test = new Dividing();
        Test.setSentence(sentence);

        OnClickListener click  = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String sentence = input.getText().toString();
                Dividing Test = new Dividing();
                Test.setSentence(sentence);
                String output = "";
                for (int i=0; i<Test.divideSentence().size(); i++) {
                    System.out.println(Test.divideSentence().get(i));
                    output = output + Test.divideSentence().get(i) + "\n";
                }
                sentences.setText(output);
            }
        };

        split.setOnClickListener(click);
/*
        input.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    input.setText("");
                }
            }
        });*/
    }
}