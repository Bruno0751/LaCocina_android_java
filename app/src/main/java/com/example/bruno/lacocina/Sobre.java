package com.example.bruno.lacocina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Sobre extends AppCompatActivity implements View.OnClickListener {

    private Button voltar;
    private ImageButton laCocina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        voltar = (Button)(findViewById(R.id.btVoltar2));
        laCocina = (ImageButton) (findViewById(R.id.ibLaCocinaSobre));

        voltar.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == voltar){
            finish();
        }else if (view == laCocina) {
            Intent inicio = new Intent(Sobre.this, Pesquisar.class);
            startActivity(inicio);
        }
    }
}
