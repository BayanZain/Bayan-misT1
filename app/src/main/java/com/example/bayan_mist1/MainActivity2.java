package com.example.bayan_mist1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    EditText name, birth;
    TextView text;
    String gender;
    Date birthD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text = (TextView) findViewById(R.id.result);
        name = (EditText)findViewById(R.id.name);
        birth = (EditText)findViewById(R.id.birth);
        RadioButton male = (RadioButton) findViewById(R.id.male);
        RadioButton female = (RadioButton) findViewById(R.id.female);

        RadioButton stu = (RadioButton) findViewById(R.id.stu);
        RadioButton ins = (RadioButton) findViewById(R.id.ins);

        Button act1 =(Button)findViewById(R.id.act1F2);
        Button act3 =(Button)findViewById(R.id.act3F2);
        Button submit =(Button)findViewById(R.id.button);

        act1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameT = name.getText().toString();
                int birthT = Integer.parseInt(birth.getText().toString());
                birthD = c.getTime();
                if(male.isChecked()){
                    gender = "Mr";
                }
                if(female.isChecked()){
                    gender = "Miss";
                }
                if(ins.isChecked()){
                    Toast.makeText(MainActivity2.this,"Hi prof "+nameT, Toast.LENGTH_LONG).show();
                }

                text.setText("Hi "+gender+" "+ nameT+ ",You are "+birthD+ " years old");
            }
        });
        birth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity2.this, d,
                        c.get(Calendar.YEAR),
                        c.get(Calendar.MONTH),
                        c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }
    Calendar c = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year,
                                      int monthOfYear, int dayOfMonth) {
                    c.set(Calendar.YEAR, year);
                    c.set(Calendar.MONTH, monthOfYear);
                    c.set(Calendar.DAY_OF_MONTH, dayOfMonth);


                }
            };
}