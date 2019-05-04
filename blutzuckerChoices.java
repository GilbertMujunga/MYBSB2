package com.example.gilbertmujunga.mybsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class blutzuckerChoices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blutzucker_choices);

        Button neueEingabe =(Button)  findViewById(R.id.neueEingabe);
       neueEingabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(blutzuckerChoices.this, blutzuckerEingabe.class));

            }
        });

    }
}
