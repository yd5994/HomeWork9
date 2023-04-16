package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    double result=0.0;
    String newr="";
    int math=0;
    double oldNumber=0.0;
    String op="";
    double number =0.0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextPhone);
        Intent gi=getIntent();
        double resultS=gi.getDoubleExtra("result",1);
    }

    public void math(View view) {
        if(count==0){
            oldNumber=Double.parseDouble(editText.getText().toString());
        }
        count++;
        switch (view.getId()){
            case R.id.button:
                if(op=="/"){
                    oldNumber/=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="-"){
                    oldNumber-=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="*"){
                    oldNumber*=Double.parseDouble(editText.getText().toString());
                }
                if(count!=1){
                    if(op=="+"){
                        oldNumber+=Double.parseDouble(editText.getText().toString());
                    }
                }
                op="+";
                math++;
                editText.setText("");
                break;
            case R.id.button2:
                if(op=="+"){
                    oldNumber+=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="/"){
                    oldNumber/=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="*"){
                    oldNumber*=Double.parseDouble(editText.getText().toString());
                }
                if(count!=1){
                    if(op=="-"){
                        oldNumber-=Double.parseDouble(editText.getText().toString());
                    }
                }
                op="-";
                math++;
                editText.setText("");
                break;
            case R.id.button3:
                if(op=="+"){
                    oldNumber+=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="-"){
                    oldNumber-=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="/"){
                    oldNumber/=Double.parseDouble(editText.getText().toString());
                }
                if(count!=1){
                    if(op=="*"){
                        oldNumber*=Double.parseDouble(editText.getText().toString());
                    }
                }
                op="*";
                math++;
                editText.setText("");
                break;
            case R.id.button4:
                if(op=="+"){
                    oldNumber+=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="-"){
                    oldNumber-=Double.parseDouble(editText.getText().toString());
                }
                else if(op=="*"){
                    oldNumber*=Double.parseDouble(editText.getText().toString());
                }
                if(count!=1){
                    if(op=="/"){
                        oldNumber/=Double.parseDouble(editText.getText().toString());
                    }
                }
                op="/";
                math++;
                editText.setText("");
                break;
        }
    }

    public void btn5(View view) {
        editText.setText("");
        number=0.0;
        oldNumber=0;
        newr="";
        op="";
        count=0;
    }

    public void btn6(View view) {
        String newNumber=editText.getText().toString();
        switch (op){
            case "+":
                result=oldNumber+Double.parseDouble(newNumber);
                break;
            case "-":
                result=oldNumber-Double.parseDouble(newNumber);
                break;
            case "*":
                result=oldNumber*Double.parseDouble(newNumber);
                break;
            case "/":
                result=oldNumber/Double.parseDouble(newNumber);
                break;
        }
        editText.setText(result+"");
    }

    public void btn7(View view) {
        if(math!=0){
            Intent gi=new Intent(getApplicationContext(),MainActivity2.class);
            gi.putExtra("result",result);
            startActivity(gi);
            editText.setText("");
            number=0.0;
            oldNumber=0;
            newr="";
            op="";
            count=0;
        }

    }
}