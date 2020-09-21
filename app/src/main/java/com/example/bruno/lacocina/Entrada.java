package com.example.bruno.lacocina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Entrada extends AppCompatActivity implements View.OnClickListener {

    private Button email, gmail, face;
    private ImageButton laCocina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrada);

        email = (Button)(findViewById(R.id.btEmail));
        gmail = (Button)(findViewById(R.id.btGoogle));
        face = (Button)(findViewById(R.id.btFacebook));
        laCocina = (ImageButton)(findViewById(R.id.ibLaCocinaEntrar));

        gmail.setOnClickListener(this);
        face.setOnClickListener(this);
        email.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == gmail || view == email || view == face){
            Intent log = new Intent(Entrada.this, Login.class);
            startActivity(log);
        }else if (view == laCocina){
            Intent inicio = new Intent(Entrada.this, Pesquisar.class);
            startActivity(inicio);
        }
    }
}
