package com.example.calcimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //campos
    private EditText heigth;
    private EditText weigth;

    //tela de resultado
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instânciar valores
        heigth = findViewById(R.id.height);
        weigth = findViewById(R.id.weight);
        resultText = findViewById(R.id.resultText);
    }

    public void mathIMC (View view) {
        float _weigth = Float.parseFloat(weigth.getText().toString());
        float _heigth = Float.parseFloat(heigth.getText().toString());

        float result = _weigth / (_heigth * _heigth);

        if (result < 19) {
            resultText.setText("Resultado: " + result + " | Abaixo do peso");
        } else if (result >= 19 && result < 25) {
            resultText.setText("Resultado: " + result + " | Peso normal");
        } else if (result >= 25 && result < 30) {
            resultText.setText("Resultado: " + result + " | Sobrepeso");
        } else if (result >= 30 && result < 40) {
            resultText.setText("Resultado: " + result + " | Obesidade tipo I");
        } else if (result >= 30 && result < 40) {
            resultText.setText("Resultado: " + result + " | Obesidade tipo II");
        } else if (result >= 30 && result < 40) {
            resultText.setText("Resultado: " + result + " | Obesidade mórbida");
        }
    }


}