package com.sepsis.diseaseawarenss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class prescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);
    }


    public void chickenpox(View view) {

        final   cp_dialog dialog1= new cp_dialog();

        dialog1.show(getSupportFragmentManager(),"");


    }

    public void measles(View view) {
        final   measles dialog2= new measles();

        dialog2.show(getSupportFragmentManager(),"");
    }
}
