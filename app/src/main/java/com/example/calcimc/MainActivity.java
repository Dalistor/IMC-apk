package com.example.calcimc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
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
        try {
            float _weigth = Float.parseFloat(weigth.getText().toString());
            float _heigth = Float.parseFloat(heigth.getText().toString());

            float result = _weigth / (_heigth * _heigth);

            if (result < 19) {
                resultText.setText("Resultado: " + result + " | Abaixo do peso");
            } else if (result >= 19 && result < 25) {
                resultText.setText("Resultado: " + result + " | Peso normal");
            } else if (result >= 25 && result < 30) {
                resultText.setText("Resultado: " + result + " | Sobrepeso");
            } else if (result >= 30 && result < 35) {
                resultText.setText("Resultado: " + result + " | Obesidade classe I");
            } else if (result >= 35 && result < 40) {
                resultText.setText("Resultado: " + result + " | Obesidade classe II");
            } else if (result >= 40) {
                resultText.setText("Resultado: " + result + " | Obesidade classe III");
            }
        } catch (Exception e) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder
                    .setTitle("Campo vazio")
                    .setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setMessage("Preencha os campos vazios");

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    }


}