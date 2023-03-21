package com.example.aula0902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Cadastro extends AppCompatActivity {
    EditText novoLogin, novaSenha, confirmacao;
    static ArrayList<Usuario> listaUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        novoLogin = findViewById(R.id.nLogin);
        novaSenha = findViewById(R.id.nSenha);
        confirmacao = findViewById(R.id.cSenha);
    }
    public void cadastrar(View v){
        String login = novoLogin.getText().toString();
        String senha = novaSenha.getText().toString();
        String conf = novaSenha.getText().toString();
        if(senha.equals(conf)){
            Usuario u = new Usuario(login,senha,false);
            listaUsuarios.add(u);
        } else{
            Toast.makeText(this, "As senhas tem que ser iguais;", Toast.LENGTH_SHORT).show();
        }
    }
    //by ash
}