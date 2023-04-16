package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = findViewById(R.id.textView);
        Intent gi = getIntent();
        result = gi.getDoubleExtra("result",0);
        text.setText(String.valueOf(result));
    }


    public void button1(View view) {
        Intent ri=new Intent(this,MainActivity.class);
        ri.putExtra("result",result);
        ri.putExtra("zero","");
        setResult(RESULT_OK,ri);
        finish();
    }
}