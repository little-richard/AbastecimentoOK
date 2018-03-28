package com.ricardomendes.abastecimento;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MediaActivity extends AppCompatActivity {
    ImageButton btMedia;
    EditText kms;
    EditText qtde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        btMedia = (ImageButton) findViewById(R.id.btCalcularMedia);
        kms = (EditText) findViewById(R.id.edtKms);
        qtde = (EditText) findViewById(R.id.edtQtde);

        btMedia.setOnClickListener(OnClickMedia());

    }

    private View.OnClickListener OnClickMedia() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kms.getText().toString().equals("") || qtde.getText().toString().equals("")){
                    Toast.makeText(MediaActivity.this, "Por favor preencha todos os campos para continuar.", Toast.LENGTH_LONG).show();
                }else {
                    Bundle params = new Bundle();
                    params.putString("kms", kms.getText().toString());
                    params.putString("qtde", qtde.getText().toString());
                    params.putInt("controle", 66);
                    Intent intent = new Intent(MediaActivity.this, ResultActivity.class);
                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        };
    }
}
