package com.example.gilbertmujunga.mybsb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.FileOutputStream;

public class Register extends AppCompatActivity {


    public static final String PATIENTFILE = "patient.txt";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Button Speichern = (Button) findViewById(R.id.speichern);

        Speichern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText name = (EditText) findViewById(R.id.nameVormane);
                EditText geburtsDatum = (EditText) findViewById(R.id.geburtsDatum);
                RadioGroup sex = (RadioGroup) findViewById(R.id.radioGroup);
                int selectedId = sex.getCheckedRadioButtonId();
                RadioButton pickedSex = (RadioButton)  findViewById(selectedId);
                Spinner vorerkrankung = (Spinner) findViewById(R.id.spinner);
                EditText Doctorsnumber = (EditText) findViewById(R.id.telefonnummerVonHausarzt);

             String patientName =   name.getText().toString() + "\r\n";
             String patientGeburtsDatum = geburtsDatum.getText().toString() + "\r\n";
             String patientSex = pickedSex.getText().toString() + "\r\n";
             String patientVorerkrungung = vorerkrankung.getSelectedItem().toString() + "\r\n";
             String patientDoctorTelefonNumer = Doctorsnumber.getText().toString() + "\r\n";



             FileOutputStream outputStream;

                try {
                    outputStream = openFileOutput(PATIENTFILE, Context.MODE_PRIVATE);
                    outputStream.write(patientName.getBytes());
                    outputStream.write(patientGeburtsDatum.getBytes());
                    outputStream.write(patientSex.getBytes());
                    outputStream.write(patientVorerkrungung.getBytes());
                    outputStream.write(patientDoctorTelefonNumer.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                startActivity(new Intent(Register.this, PatientData.class));
                Toast.makeText(getBaseContext(), "You Data has been saved",
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}
