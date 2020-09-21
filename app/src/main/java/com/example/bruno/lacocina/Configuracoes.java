package com.example.bruno.lacocina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Configuracoes extends AppCompatActivity implements View.OnClickListener {

    private Button voltar;
    private ImageButton laCocina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        voltar = (Button)(findViewById(R.id.btVoltarConfiguracoes));
        laCocina = (ImageButton) (findViewById(R.id.ibLaCocinaConfiguracoes));

        voltar.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == voltar){
            finish();
        }else if (view == laCocina) {
            Intent inicio = new Intent(Configuracoes.this, Main.class);
            startActivity(inicio);
        }
    }
}
