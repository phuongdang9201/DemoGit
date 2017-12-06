package com.example.dnp.demogit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DNP on 12/6/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnStartThirdActivity = (Button) findViewById(R.id.btnStartThirdActivity);
        btnStartThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Start Third activity", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
