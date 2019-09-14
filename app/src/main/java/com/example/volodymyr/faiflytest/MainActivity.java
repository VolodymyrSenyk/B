package com.example.volodymyr.faiflytest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sentences = findViewById(R.id.result_field);
        final EditText input = findViewById(R.id.input_field);
        final Button split = findViewById(R.id.split_button);

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
    }
}
