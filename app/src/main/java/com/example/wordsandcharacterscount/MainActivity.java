package com.example.wordsandcharacterscount;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enterText;
    TextView characterText;
    int numberText;
    String[] words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterText = findViewById(R.id.textEnter);
        characterText = findViewById(R.id.characterCounter);


        enterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @SuppressLint("SetTextI18n")
            @Override
            public void afterTextChanged(Editable s) {
                if(s == null){
                    characterText.setText("Character Count :  0\\n\\n\\nWord Count :  0");
                }
                else{
                    numberText = s.length();

                    words = s.toString().split("\\s");

                    characterText.setText("Character Count :  "+numberText+"\n\n\nWord Count :  "+words.length);
                }

            }
        });

    }
}