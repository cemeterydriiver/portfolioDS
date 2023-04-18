package com.example.aula0902;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText campo, login, senha;
    ArrayList<Usuario> listaUsuarios = new ArrayList<>(); //array list dos usuários

    //Primeiro método a ser executado:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Responsáveis por tornar a tela visivel
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); //obteve a barra e .hide() remove ela
        campo = findViewById(R.id.name); //Vincular arquivo de java com xml
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        criarUsuarios(); //chamou o metodo
    }
    public void clicar(View v){//para o método ficar visivel ao .xml tem que ter o parametro view
        String mensagem = "Olá, "+campo.getText()+" Seja bem-vindo(a)!"; //mensagem que vai aparecer ao clicar
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show(); //cria o toast, mensagem que irá aparecer
    }
    public void logar (View v){
        String user = login.getText().toString(); //string para armazenar em login
        String pass = senha.getText().toString(); //string para armazenar em senha
        String mensagem = "Bem-vindo!";
        /*if(user.equals("admin")  && pass.equals("admin")){
            //abrir a tela adm
            Intent i = new Intent(this, Admin.class);
            startActivity(i);
        }
        else if (user.equals("comum") && pass.equals("comum")){
            Intent i = new Intent(this, Comum.class);
            //abrir a tela comum
            startActivity(i);
        }
        else{
            Toast.makeText(this, "usuario ou senha inválida", Toast.LENGTH_SHORT).show(); //cria o toast, mensagem que irá aparecer
        }*/

        //for para abrir as telas de acordo com o usuário (se for admin ou comum)
        for(Usuario u:listaUsuarios){

            if(user.equals(u.getLogin()) && pass.equals(u.getSenha())){
                if(u.isAdmin()){
                    Intent i = new Intent(this, Admin.class);
                    startActivity(i);
                }
                else{
                    Intent c = new Intent(this, Comum.class);
                    startActivity(c);
                }
                mensagem = "Bem-vindo";
                break;
            }
            else{
                mensagem = "Login ou senha incorreta";

            }


        }
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
    private void criarUsuarios() {
        //chamando a classe usuário (user test)
        Usuario u1 = new Usuario("admin", "admin", true);
        Usuario u2 = new Usuario("ash", "123", true);
        Usuario u3 = new Usuario("anna", "123", false);
        Usuario u4 = new Usuario("ojogo", "perdi", false);

        //adiciona users no arraylist
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        listaUsuarios.add(u3);
        listaUsuarios.add(u4);
    }
    public void cadastro(View v){
        Intent i = new Intent(this, Cadastro.class);
        startActivity(i);
        Cadastro.listaUsuarios = listaUsuarios; //cadastro recebe a lista da main
    }

}
