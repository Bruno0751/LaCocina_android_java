package com.example.bruno.lacocina;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Receitas extends AppCompatActivity implements View.OnClickListener {

    private TextView arroz, bolo, frango , lasanha;
    private ImageButton imgArroz, imgBolo, imgFrango, imgLasanha, imgIr, imgVoltar, imgLaCocina;


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu_receitas, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.mnConfig:
                Intent con = new Intent(Receitas.this, Configuracoes.class);
                startActivity(con);
                break;
            case R.id.mnSobre:
                Intent sobre = new Intent(Receitas.this, Sobre.class);
                startActivity(sobre);
                break;
            case R.id.mnDesktop:
                AlertDialog.Builder msg = new AlertDialog.Builder(Receitas.this);
                msg.setTitle("Atenção");
                msg.setMessage("Em Breve");
                msg.setNeutralButton("ok", null);
                msg.show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receitas);

        arroz = (TextView)(findViewById(R.id.tvArroz));
        imgArroz = (ImageButton)(findViewById(R.id.ibArrozReceitas1));

        bolo = (TextView)(findViewById(R.id.tvBolo));
        imgBolo = (ImageButton)(findViewById(R.id.ibBoloReceitas1));

        frango = (TextView)(findViewById(R.id.tvFrango));
        imgFrango = (ImageButton)(findViewById(R.id.ibFrangoReceitas1));

        imgLasanha = (ImageButton)(findViewById(R.id.ibLasanhaReceitas1));
        lasanha = (TextView)(findViewById(R.id.tvLasanha));

        imgIr = (ImageButton)(findViewById(R.id.ibIrReceitas));
        imgVoltar = (ImageButton)(findViewById(R.id.ibVoltarReceitas));
        imgLaCocina = (ImageButton) (findViewById(R.id.ibLaCocinaReceitas1));

        arroz.setOnClickListener(this);
        imgArroz.setOnClickListener(this);

        frango.setOnClickListener(this);
        imgFrango.setOnClickListener(this);

        bolo.setOnClickListener(this);
        imgBolo.setOnClickListener(this);

        lasanha.setOnClickListener(this);
        imgLasanha.setOnClickListener(this);

        imgVoltar.setOnClickListener(this);
        imgIr.setOnClickListener(this);
        imgLaCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == imgArroz){
            abrirArroz("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html");
        }else if (view == imgBolo){
            abrirBolo("www.receitadevovo.com.br/receitas/bolo-de-trigo-fofinho");
        }else if (view == imgFrango){
            abrirFrango("hudson-sapore.blogspot.com/2012/06/frango-kiev.html");
        }else if (view == imgLasanha) {
            abrirLasanha("cybercook.uol.com.br/receita-de-lasanha-a-bolonhesa-r-5-3876.html");
        }else if (view == imgIr){
            Intent receita = new Intent(Receitas.this, Receitas2.class);
            startActivity(receita);
        }else if (view == imgVoltar){
            Intent receita = new Intent(Receitas.this, Receitas2.class);
            startActivity(receita);
        }else if (view == imgLaCocina){
            Intent inicio = new Intent(Receitas.this, Main.class);
            startActivity(inicio);
        }
    }

    private void abrirArroz(String url) {
        if (!url.startsWith("http://")){
            url = "http://" + url;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void abrirBolo(String boloU) {
        if (!boloU.startsWith("http://")){
            boloU = "http://" + boloU;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(boloU));
        startActivity(intent);
    }

    private void abrirFrango(String uFrango) {
        if (!uFrango.startsWith("guiadacozinha.com.br/guacamole-original/")){
            uFrango = "http://" + uFrango;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uFrango));
        startActivity(intent);
    }

    private void abrirLasanha(String url) {
        if (!url.startsWith("http://")){
            url = "http://" + url;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
