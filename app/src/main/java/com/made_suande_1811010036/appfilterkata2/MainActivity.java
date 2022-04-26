package com.made_suande_1811010036.appfilterkata2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText input_word;
    Button btn_cek_word;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_word = findViewById(R.id.input_word);
        btn_cek_word = findViewById(R.id.btn_cek_word);
        result = findViewById(R.id.result);

        String[] kata = {"jancok", "asu", "bangsat", "keleng", "pletan", "sampah", "suwe"};

        btn_cek_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input_word.getText() == null) {
                    Toast.makeText(getApplicationContext(), "input not null", Toast.LENGTH_LONG).show();
                }else {
                    if (Arrays.asList(kata).contains(input_word.getText().toString())) {
                        result.setText("result word = kata tidak baik");
                        Toast.makeText(getApplicationContext(), "kata terlarang", Toast.LENGTH_SHORT).show();
                        input_word.setText("");
                    }  else {
                        result.setText("result word = " + input_word.getText().toString());
                        Toast.makeText(getApplicationContext(), "kata bijak", Toast.LENGTH_SHORT).show();
                        input_word.setText("");
                    }
                }
                Log.d("mydata", "onCreate: " +Arrays.asList(kata).contains(input_word.getText().toString()));
            }
        });


    }
}