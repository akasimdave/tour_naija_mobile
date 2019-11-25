package com.example.simdave.tournaija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {
    private Button tourNaijaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        tourNaijaButton = (Button) findViewById(R.id.tourNaijaButton);
        tourNaijaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });
    }public void openHome(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}