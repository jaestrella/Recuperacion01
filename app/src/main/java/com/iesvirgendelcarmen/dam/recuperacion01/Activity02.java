package com.iesvirgendelcarmen.dam.recuperacion01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by matinal on 16/03/2018.
 */

public class Activity02 extends AppCompatActivity {
    Button boton1,boton2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02);

        Log.v("Momento","Estoy en create actividad 2");
        Toast.makeText(this,"Estoy en create 2",Toast.LENGTH_SHORT).show();

        boton1=(Button)findViewById(R.id.boton1);
        boton2=(Button)findViewById(R.id.boton2);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Activity04.class);
                startActivity(intent);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Momento:","Estoy en stop 2");
        Toast.makeText(this,"Estoy en STOP 2",Toast.LENGTH_SHORT).show();
    }
}
