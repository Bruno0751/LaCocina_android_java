package com.example.bruno.lacocina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Button entrar;
    private ImageButton laCocina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        entrar = (Button)(findViewById(R.id.btEntrar));
        laCocina = (ImageButton)(findViewById(R.id.ibLaCocinaLogin));

        entrar.setOnClickListener(this);
        laCocina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == entrar){
            Intent pesquisa = new Intent(Login.this, Pesquisar.class);
            Toast msg = Toast.makeText(Login.this, "Bem Vindo", Toast.LENGTH_LONG);
            startActivity(pesquisa);
            msg.show();
        }else if (view == laCocina) {
            Intent inicio = new Intent(Login.this, Pesquisar.class);
            startActivity(inicio);
        }
    }
}
