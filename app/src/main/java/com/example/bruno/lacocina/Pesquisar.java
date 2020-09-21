package com.example.bruno.lacocina;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pesquisar extends AppCompatActivity implements SearchView.OnQueryTextListener, View.OnClickListener {

    private Button receita, conf, sobre, login, entrar;
    private ImageButton favoritos, privaciidade, conta;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.mnConfig:
                Intent con = new Intent(Pesquisar.this, Configuracoes.class);
                startActivity(con);
                break;
            case R.id.mnSobre:
                Intent sobre = new Intent(Pesquisar.this, Sobre.class);
                startActivity(sobre);
                break;
            case R.id.mnDesktop:
                AlertDialog.Builder msg = new AlertDialog.Builder(Pesquisar.this);
                msg.setTitle("Atenção");
                msg.setMessage("Em Breve");
                msg.setNeutralButton("ok", null);
                msg.show();
                break;
            case R.id.mnReceitas:
                Intent receitas = new Intent(Pesquisar.this, Receitas.class);
                startActivity(receitas);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesquisar);

        entrar = (Button)(findViewById(R.id.btConta));
        privaciidade = (ImageButton)(findViewById(R.id.ibPrivacidade));
        conta = (ImageButton)(findViewById(R.id.ibConta));
        favoritos = (ImageButton)(findViewById(R.id.ibFavoritos));

        entrar.setOnClickListener(this);
        privaciidade.setOnClickListener(this);
        favoritos.setOnClickListener(this);
        conta.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == favoritos){
            AlertDialog.Builder msg = new AlertDialog.Builder(Pesquisar.this);
            msg.setTitle("Bem Vindo");
            msg.setMessage("Favoritos");
            msg.setNeutralButton("ok", null);
            msg.show();
        }else if (view == entrar){
            Intent entrar = new Intent(Pesquisar.this, Entrada.class);
            startActivity(entrar);
        }else if (view == conta){
            AlertDialog.Builder msg = new AlertDialog.Builder(Pesquisar.this);
            msg.setTitle("Bem Vindo");
            msg.setMessage("Conta");
            msg.setNeutralButton("ok", null);
            msg.show();
        }else if (view == privaciidade){
            AlertDialog.Builder msg = new AlertDialog.Builder(Pesquisar.this);
            msg.setTitle("Bem Vindo");
            msg.setMessage("Privacidades");
            msg.setNeutralButton("ok", null);
            msg.show();
        }
    }
}
