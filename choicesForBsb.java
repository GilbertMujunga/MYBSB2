package com.example.gilbertmujunga.mybsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class choicesForBsb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices_for_bsb);

        ImageButton blutzucker = (ImageButton) findViewById(R.id.blutZucker);

        blutzucker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(choicesForBsb.this, blutzuckerChoices.class));

            }
        });
    }
}
