package com.ricardomendes.abastecimento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView result;
    Abastecimento abast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = (TextView) findViewById(R.id.txtResult);
        Bundle params = this.getIntent().getExtras();

        int controle = params.getInt("controle");


        if (controle == 55) {
            abast = new Abastecimento();
            double melhorEscolha = abast.melhorEscolha(params.getString("gasolina"), params.getString("alcool"));
            if (melhorEscolha <= abast.getAlcool()) {
                result.setText("A melhor escolha para abastecer é Gasolina.");
            } else {
                result.setText("A melhor escolha para abastecer é Alcool.");
            }
        }

        if(controle == 66){
            abast = new Abastecimento();
            double media = abast.Media(params.getString("kms"), params.getString("qtde"));
            result.setText("Média do tanque (Km/l): " + media);
        }

    }
}
