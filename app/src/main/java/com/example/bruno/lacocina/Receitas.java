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
    private ImageButton arrozI, boloI, frangoI, lasanhaI, ir, voltar, laCocina;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu_receitas, menu);
        return super.onCreateOptionsMenu(menu);

        //https://receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html
        //https://www.receitasdemae.com.br/receitas/frango-a-kiev/
        //https://www.receitadevovo.com.br/receitas/bolo-de-trigo-fofinho
        //http://www.receitadetapioca.com.br/tapioca-com-banana-e-chocolate/
        //https://cybercook.uol.com.br/receita-de-lasanha-a-bolonhesa-r-5-3876.html
        //http://pensarcomida.blogspot.com/2013/05/receita-do-dia-panquecas.html
        //http://gshow.globo.com/receitas-gshow/receita/peixe-ensopado-535048aa4d38854185000046.html
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

        lasanha = (TextView)(findViewById(R.id.tvLasanha));
        arroz = (TextView)(findViewById(R.id.tvArroz));
        frango = (TextView)(findViewById(R.id.tvFrango));
        bolo = (TextView)(findViewById(R.id.tvBolo));
        arrozI = (ImageButton)(findViewById(R.id.ibArrozReceitas1));
        boloI = (ImageButton)(findViewById(R.id.ibBoloReceitas1));
        lasanhaI = (ImageButton)(findViewById(R.id.ibLasanhaReceitas1));
        frangoI = (ImageButton)(findViewById(R.id.ibFrangoReceitas1));
        ir = (ImageButton)(findViewById(R.id.ibIrReceitas));
        voltar = (ImageButton)(findViewById(R.id.ibVoltarReceitas));
        laCocina = (ImageButton) (findViewById(R.id.ibLaCocinaReceitas1));

        lasanha.setOnClickListener(this);
        arroz.setOnClickListener(this);
        frango.setOnClickListener(this);
        bolo.setOnClickListener(this);
        boloI.setOnClickListener(this);
        frangoI.setOnClickListener(this);
        arrozI.setOnClickListener(this);
        lasanhaI.setOnClickListener(this);
        voltar.setOnClickListener(this);
        ir.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == arrozI){
            mArroz("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html");
        }else if (view == boloI){
            mBolo("www.receitadevovo.com.br/receitas/bolo-de-trigo-fofinho");
        }else if (view == frangoI){
            mFrango("hudson-sapore.blogspot.com/2012/06/frango-kiev.html");
        }else if (view == lasanhaI) {
            mLasanha("cybercook.uol.com.br/receita-de-lasanha-a-bolonhesa-r-5-3876.html");
        }else if (view == ir){
            Intent receita = new Intent(Receitas.this, Receitas2.class);
            startActivity(receita);
        }else if (view == voltar){
            Intent receita = new Intent(Receitas.this, Receitas2.class);
            startActivity(receita);
        }else if (view == laCocina){
            Intent inicio = new Intent(Receitas.this, Pesquisar.class);
            startActivity(inicio);
        }
    }

    private void mFrango(String uFrango) {
        if (!uFrango.startsWith("guiadacozinha.com.br/guacamole-original/")){
            uFrango = "http://" + uFrango;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uFrango));
        startActivity(intent);
    }

    private void mBolo(String boloU) {
        if (!boloU.startsWith("guiadacozinha.com.br/guacamole-original/")){
            boloU = "http://" + boloU;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(boloU));
        startActivity(intent);
    }

    private void mArroz(String url) {
        if (!url.startsWith("guiadacozinha.com.br/guacamole-original/")){
            url = "http://" + url;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void mLasanha(String url) {
        if (!url.startsWith("guiadacozinha.com.br/guacamole-original/")){
            url = "http://" + url;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
