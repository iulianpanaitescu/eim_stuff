package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick(View view) {
        EditText txt1 = findViewById(R.id.editTxtName1);
        EditText txt2 = findViewById(R.id.editTxtName2);
        EditText txt3 = findViewById(R.id.editTxtName3);
        TextView edtTxt1 = findViewById(R.id.textView);
        TextView edtTxt2 = findViewById(R.id.textView2);
        TextView edtTxt3 = findViewById(R.id.textView4);

        edtTxt1.setText("First Name: " + txt1.getText().toString());
        edtTxt2.setText("Last Name: " + txt2.getText().toString());
        edtTxt3.setText("Email: " + txt3.getText().toString());
    }
}