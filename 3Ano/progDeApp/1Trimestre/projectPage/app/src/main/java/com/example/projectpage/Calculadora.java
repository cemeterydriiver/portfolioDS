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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Calculadora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Calculadora extends Fragment {
    EditText hi, mi, hf, mf;
    TextView rh, rm;
    int hrInicial;
    int minInicial;
    int hrFinal;
    int minFinal;
    Button soma, sub;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Calculadora() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment calculadora.
     */
    // TODO: Rename and change types and number of parameters
    public static Calculadora newInstance(String param1, String param2) {
        Calculadora fragment = new Calculadora();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        //rh.setText(hrInicial+minInicial);
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
        View v = inflater.inflate(R.layout.fragment_calculadora, container, false);
        hi = v.findViewById(R.id.hi);
        mi = v.findViewById(R.id.mi);
        hf = v.findViewById(R.id.hf);
        mf = v.findViewById(R.id.mf);
        rh = v.findViewById(R.id.rh);
        rm = v.findViewById(R.id.rm);
        soma = v.findViewById(R.id.soma);
        sub = v.findViewById(R.id.sub);
        soma.setOnClickListener(c ->{
            soma();
        });
        sub.setOnClickListener(c ->{
            sub();
        });


        return  v;
    }
    public void soma() {

        checarCampo();


        int resultadoHr = hrInicial + hrFinal;
        int resultadoMin = minInicial + minFinal;


        while (resultadoMin > 59) {
            resultadoMin -= 60;
            resultadoHr++;
        }


        rh.setText(resultadoHr + "");
        rm.setText(resultadoMin + "");

    }

    public void sub() {
        checarCampo();

        //hora inicial em minutos
        while (hrInicial > 0) {
            hrInicial--;
            minInicial += 60;
        }
        //hora final em minutos
        while (hrFinal > 0) {
            hrFinal--;
            minFinal += 60;
        }
        int resultadoHr = 0;
        int resultadoMin = minInicial - minFinal;
        if (minFinal > minInicial) {
            resultadoMin = minInicial - minFinal;

        }
        while (resultadoMin > 59) {
            resultadoMin -= 60;
            resultadoHr++;
        }

        rh.setText(resultadoHr + "");
        rm.setText(resultadoMin + "");
    }

    public void checarCampo(){

        try {
            hrInicial = Integer.parseInt(hi.getText().toString());
            minInicial = Integer.parseInt(mi.getText().toString());
            hrFinal = Integer.parseInt(hf.getText().toString());
            minFinal = Integer.parseInt(mf.getText().toString());
        }catch (Exception e){
            Toast.makeText(getContext(), "Os campos não podem estar vazios! preencha-os com as horas", Toast.LENGTH_SHORT).show();
        }
    }
}