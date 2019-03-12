package com.example.fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Frag1.OnFragmentInteractionListener {

    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frag1 fragmento = Frag1.newInstance("id","frag1");


        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.boton1:
                Frag1 frag1 = Frag1.newInstance("id","frag1");
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,frag1).commit(); break;

            case R.id.boton2:
                Frag1 frag2 = Frag1.newInstance("id","frag1");
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,frag2).commit(); break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
