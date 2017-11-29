package com.example.joy.listview7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView brand,des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        brand=findViewById(R.id.brand_name);
        des=findViewById(R.id.brand_des);


        brand.setText(getIntent().getStringExtra("name"));
        des.setText(getIntent().getStringExtra("des"));


    }
}
