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

public class Receitas2 extends AppCompatActivity implements View.OnClickListener {

    private ImageButton guacamole, peixe, cuscuz, feijoada, ir, volta, laCocina;

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
                Intent con = new Intent(Receitas2.this, Configuracoes.class);
                startActivity(con);
                break;
            case R.id.mnSobre:
                Intent sobre = new Intent(Receitas2.this, Sobre.class);
                startActivity(sobre);
                break;
            case R.id.mnDesktop:
                AlertDialog.Builder msg = new AlertDialog.Builder(Receitas2.this);
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
        setContentView(R.layout.receitas2);

        volta = (ImageButton)(findViewById(R.id.ibVoltarReceitas));
        ir = (ImageButton)(findViewById(R.id.ibIrReceitas));
        guacamole = (ImageButton)(findViewById(R.id.ibGuacamole));
        feijoada = (ImageButton)(findViewById(R.id.ibFeijoada));
        peixe = (ImageButton)(findViewById(R.id.ibPeixe));
        cuscuz = (ImageButton)(findViewById(R.id.ibcuscuz));
        laCocina = (ImageButton) (findViewById(R.id.ibLaCocinaReceitas2));

        volta.setOnClickListener(this);
        ir.setOnClickListener(this);
        guacamole.setOnClickListener(this);
        peixe.setOnClickListener(this);
        feijoada.setOnClickListener(this);
        cuscuz.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == ir){
            Intent receita = new Intent(Receitas2.this, Receitas.class);
            startActivity(receita);
        }else if (view == volta){
            Intent receita = new Intent(Receitas2.this, Receitas.class);
            startActivity(receita);
        }else if (view == guacamole){
            mGuagamole("guiadacozinha.com.br/guacamole-original/");
        }else if (view == cuscuz){
            mCuscus("guiadacozinha.com.br/cuscuz-nordestino-com-queijo/");
        }else if (view == peixe){
            mPeixe("www.comidaereceitas.com.br/peixes/peixe-frito-com-legumes.html");
        }else if (view == feijoada){
            mFeijoada("www.comidaereceitas.com.br/carnes/feijoada-completa.html");
        }else if (view == laCocina) {
            Intent inicio = new Intent(Receitas2.this, Pesquisar.class);
            startActivity(inicio);
        }
    }

    private void mFeijoada(String uFeijoada) {
        if (!uFeijoada.startsWith("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html")){
            uFeijoada = "http://" + uFeijoada;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uFeijoada));
        startActivity(intent);
    }

    private void mPeixe(String uPeixe) {
        if (!uPeixe.startsWith("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html")){
            uPeixe = "http://" + uPeixe;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uPeixe));
        startActivity(intent);
    }

    private void mCuscus(String uCuscuz) {
        if (!uCuscuz.startsWith("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html")){
            uCuscuz = "http://" + uCuscuz;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uCuscuz));
        startActivity(intent);
    }

    private void mGuagamole(String uGuacamole) {
        if (!uGuacamole.startsWith("receitas.ig.com.br/arroz-a-grega/4e7b323d7bb4e2ad5c00003c.html")){
            uGuacamole = "http://" + uGuacamole;            }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uGuacamole));
        startActivity(intent);
    }
}
