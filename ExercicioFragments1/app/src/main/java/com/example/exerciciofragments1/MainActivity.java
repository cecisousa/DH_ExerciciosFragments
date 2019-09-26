package com.example.exerciciofragments1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnVerde;
    private Button btnRosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerde = findViewById(R.id.button1);
        btnRosa = findViewById(R.id.button2);

        btnRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new PrimeiroFragment());

            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new SegundoFragment());

            }
        });


    }

    public void recarregaFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

}
