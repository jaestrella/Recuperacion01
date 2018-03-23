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

public class Activity03 extends AppCompatActivity {
    Button boton1,boton2,boton3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity03);

        boton1=(Button)findViewById(R.id.boton1);
        boton2=(Button)findViewById(R.id.boton2);
        boton3=(Button)findViewById(R.id.boton3);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),Activity05.class);
                startActivity(intent);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Momento:","Estoy en resume 3");
        Toast.makeText(this,"estoy en resume 3",Toast.LENGTH_SHORT).show();
    }
}
