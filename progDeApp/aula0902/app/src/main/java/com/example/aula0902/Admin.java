package com.example.aula0902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Admin extends AppCompatActivity {
    static ArrayList<Usuario> listaUsuarios;
    EditText buscaLogin;
    TextView resultado;
    Usuario encontrado = new Usuario();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().hide();//esconde o roxinho;
        buscaLogin = findViewById(R.id.campo);
        resultado = findViewById(R.id.resultado);
    }
    public void buscar(View view){
        String login = buscaLogin.getText().toString();
        String mensagem = "login "+login+" não encontrado";
        for (Usuario u: listaUsuarios){
            if(u.login.equals(login)){
                mensagem = "Login "+" encontrado com sucesso!";//cade o login lek
                encontrado = u;
                break;
            }
        }
        resultado.setText(mensagem);
    }

}