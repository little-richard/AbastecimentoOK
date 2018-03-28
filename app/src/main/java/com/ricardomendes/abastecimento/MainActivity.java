package com.ricardomendes.abastecimento;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btComparar;
    ImageButton btMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btComparar = (ImageButton) findViewById(R.id.btCompensa);
        btMedia = (ImageButton) findViewById(R.id.btMedia);

        btComparar.setOnClickListener(OnClickComparar());
        btMedia.setOnClickListener(OnClickMedia());
    }

    private View.OnClickListener OnClickMedia() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener OnClickComparar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, compareActivity.class);
                startActivity(intent);
            }
        };
    }
}
