package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText celsiusEditText;
    private Button convertButton;
    private TextView fahrenheitTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusEditText = findViewById(R.id.celsiusEditText);
        convertButton = findViewById(R.id.convertButton);
        fahrenheitTextView = findViewById(R.id.fahrenheitTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!celsiusEditText.getText().toString().isEmpty()) {
                    double celsius = Double.parseDouble(celsiusEditText.getText().toString());
                    double fahrenheit = (celsius * 9/5) + 32;
                    fahrenheitTextView.setText(String.format("%.2f Fahrenheit", fahrenheit));
                }
            }
        });
    }
}





