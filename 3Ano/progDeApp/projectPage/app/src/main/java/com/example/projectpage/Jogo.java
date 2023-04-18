package com.example.projectpage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Jogo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Jogo extends Fragment {
    EditText entrada;
    TextView saida;
    Button btnConfirma;
    Button btnGerar;
    int numeroGerado = 0;
    int tentativas;
    Random gerador = new Random();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Jogo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment kuromi.
     */
    // TODO: Rename and change types and number of parameters
    public static Jogo newInstance(String param1, String param2) {

        Jogo fragment = new Jogo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_jogo, container, false);
        entrada = v.findViewById(R.id.entrada);
        saida = v.findViewById(R.id.saida);
        btnConfirma = v.findViewById(R.id.btnConfirma);
        btnGerar = v.findViewById(R.id.btnGerar);
        btnConfirma = v.findViewById(R.id.btnConfirma);
        Toast.makeText(getContext(), "Adivinhe um número entre 1 e 100 em "+tentativas+ " tentativas", Toast.LENGTH_LONG).show();
        btnGerar.setOnClickListener(c ->{
            gerar();
        });
        btnConfirma.setOnClickListener(c ->{
            confirmar();
        });


        return  v;
    }


    public void gerar(){
        tentativas = 5;
        numeroGerado = gerador.nextInt(100) + 1;
        saida.setText("Novo número gerado!");

    }
    public void confirmar(){

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