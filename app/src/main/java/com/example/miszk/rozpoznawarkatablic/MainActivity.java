package com.example.miszk.rozpoznawarkatablic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message;
    private TextView txtView, query;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtView=(TextView)findViewById(R.id.tv_answer);
        txtView.setText(message);

        Button yourButton=(Button)findViewById(R.id.button);
//set onclicklistener for your button
        yourButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        query = (TextView) findViewById(R.id.input_search);
                        message = LicencePlates.getPlate(query.getText().toString());
                        txtView.setText(message);
                    }
                });

    }
}