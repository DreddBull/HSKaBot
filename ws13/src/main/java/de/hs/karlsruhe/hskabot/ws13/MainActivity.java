package de.hs.karlsruhe.hskabot.ws13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //einfacher Aufruf der Layout "manueller Betrieb" über Intent
    public void manwinkel_click (View view){
        Intent manwinkel = new Intent(this, InputWinkel.class);
        startActivity(manwinkel);
    }


}
