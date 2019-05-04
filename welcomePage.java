package com.example.gilbertmujunga.mybsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        Button zuMeinemProfil = (Button) findViewById(R.id.zumeinemprofil);
        Button zuMeinemBSB = (Button) findViewById(R.id.bsbbutton);

        zuMeinemProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(welcomePage.this, Register.class));

            }
        });

        zuMeinemBSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(welcomePage.this, PatientData.class));

            }
        });
    }
}
