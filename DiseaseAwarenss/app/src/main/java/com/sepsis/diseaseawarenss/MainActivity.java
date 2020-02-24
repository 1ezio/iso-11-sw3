package com.sepsis.diseaseawarenss;

import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "Mainativity";
    private static int ERRO_DIALOG_REQEUST=  9001   ;
    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(isServiceOK()){
            init();
        }
    }
    public void init(){
      //  btn = findViewById(R.id.btn_map);
       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent (MainActivity.this, map_activity.class);
                startActivity( intent);
            }
        });*/

    }
    public  boolean   isServiceOK(){
        Log.d(TAG, "isServiceOK: Chexking google version ");
        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity.this);
        if (available == ConnectionResult.SUCCESS){
            return  true;
        }
        else  if (GoogleApiAvailability.getInstance().isUserResolvableError(available)){
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this,available , ERRO_DIALOG_REQEUST);
            dialog.show();

        }else {
            Toast.makeText(this, "u cannpt make map reuqest", Toast.LENGTH_SHORT).show();
        }
return  false;
    }

    public void prevention(View view) {
        Intent i = new Intent(MainActivity.this, prescription.class);
        startActivity(i);
    }

    public void cure(View view) {
    }

    public void map(View view) {
        Intent i = new Intent(MainActivity.this, map_activity.class);
        startActivity(i);
    }

    public void scheme(View view) {
        Intent i = new Intent(MainActivity.this, scheme.class);
        startActivity(i);
    }
}
