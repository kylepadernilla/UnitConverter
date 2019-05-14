package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private Button bH;
    private Button hB;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=(EditText)findViewById(R.id.firstNumber);
        bH=(Button)findViewById(R.id.bhButton);
        hB=(Button)findViewById(R.id.hbButton);
        answer=(TextView)findViewById(R.id.result);

        bH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(number.getText().toString());
                String bin= Integer.toBinaryString(number1);
                answer.setText(""+ bin);
            }
        });

        hB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt(number.getText().toString());
                String bin= Integer.toHexString(number1);
                answer.setText(""+ bin);
            }
        });
    }
}
