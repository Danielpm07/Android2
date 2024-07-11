package com.example.edadcanina;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ageEdit = findViewById(R.id.age_edit);
        Button button = findViewById(R.id.button);
        TextView resultText = findViewById(R.id.result_text);
        //button1.bid
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = ageEdit.getText().toString();
                if (!age.isEmpty()) {
                    int ageInt = Integer.parseInt(age);
                    int result = ageInt * 7;
                    String resultString = "Si fuera perro, tu edad sería  " + result + " años";
                    resultText.setText(resultString);
                } else {
                    String resultString = "Ingresar valor en la caja de texto";
                    resultText.setText(resultString);
                }
            }

        });
    }
}


