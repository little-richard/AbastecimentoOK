package com.ricardomendes.abastecimento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class compareActivity extends AppCompatActivity {
    EditText gasolina;
    EditText alcool;
    ImageButton comparar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        gasolina = (EditText) findViewById(R.id.edtGasolina);
        alcool = (EditText) findViewById(R.id.edtAlcool);
        comparar = (ImageButton) findViewById(R.id.btComparar);

        comparar.setOnClickListener(OnClickComparar());
    }

    private View.OnClickListener OnClickComparar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gasolina.getText().toString().equals("") || alcool.getText().toString().equals("")){
                    Toast.makeText(compareActivity.this, "Por favor preencha todos os campos para continuar.", Toast.LENGTH_LONG).show();
                }else {
                    Bundle params = new Bundle();
                    params.putString("gasolina", gasolina.getText().toString());
                    params.putString("alcool", alcool.getText().toString());
                    params.putInt("controle", 55);
                    Intent intent = new Intent(compareActivity.this, ResultActivity.class);
                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        };
    }
}
