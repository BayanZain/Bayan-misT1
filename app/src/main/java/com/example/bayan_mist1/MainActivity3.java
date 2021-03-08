package com.example.bayan_mist1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity3 extends AppCompatActivity {

    String[] list = {"alfaisal",
            "picture",
            "kodu",
            "herfy",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


            Button act1 = (Button) findViewById(R.id.act2F3);
            Button act2 = (Button) findViewById(R.id.act2F3);


            act1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity3.this, MainActivity.class));
                }
            });
            act2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity3.this, MainActivity2.class));
                }
            });


            GridView grid = (GridView) findViewById(R.id.grid);
            ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
            grid.setAdapter(adapter);

            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                            break;
                        case 1:
                            startActivity(new Intent(MainActivity3.this, mac.class));
                            break;
                        case 2:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kudu.com.sa/home")));
                            break;
                        case 3:
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.herfy.com/")));
                            break;
                    }
                }
            });
        }
    }
