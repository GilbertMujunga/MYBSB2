package com.example.gilbertmujunga.mybsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class blutzuckerEingabe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blutzucker_eingabe);

        Button auswerten = (Button) findViewById(R.id.auswerten);

  // yes
        auswerten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(blutzuckerEingabe.this, blutZuckerAuswertung.class));

            }
        });
    }




}
