    package com.example.jogorandom;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;

    import java.util.Random;

    public class MainActivity extends AppCompatActivity {
        EditText entrada;
        TextView saida;
        Button btnConfirma;
        Button btnGerar;
        int numeroGerado = 0;
        int tentativas;
        Random gerador = new Random();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getSupportActionBar().hide();

            entrada = findViewById(R.id.entrada);
            saida = findViewById(R.id.saida);
            btnConfirma = findViewById(R.id.btnConfirma);
            btnGerar = findViewById(R.id.btnGerar);
            Toast.makeText(this, "Adivinhe um número entre 1 e 100 em "+tentativas+ " tentativas", Toast.LENGTH_LONG).show();


        }
        public void gerar(View v){
            tentativas = 5;
            numeroGerado = gerador.nextInt(100) + 1;
            saida.setText("Novo número gerado!");

        }
        public void confirmar(View v){

            int digito = Integer.parseInt(entrada.getText().toString());
            if (tentativas > 0) {
                tentativas--;
                if (digito == numeroGerado) {
                    saida.setText("Parabéns! Você acertou o número em " + (5 - tentativas) + " tentativas.");
                } else if (digito < numeroGerado) {
                    saida.setText("O número que você chutou é menor que o número aleatório. Tentativas restantes: " + tentativas);
                } else {
                    saida.setText("O número que você chutou é maior que o número aleatório. Tentativas restantes: " + tentativas);
                }
            } else {
                saida.setText("Suas tentativas acabaram! O número aleatório era: " + numeroGerado);
            }
        }

    }