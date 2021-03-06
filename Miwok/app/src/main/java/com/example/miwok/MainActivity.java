package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openNumbersList(View view)
    {
        Toast.makeText(view.getContext(),"open the list", Toast.LENGTH_SHORT).show();

        Intent i=new Intent(this,NumbersActivity.class);
        startActivity(i);
    }
    public void openColorsList(View view)
    {
        Intent i=new Intent(this,ColorsActivity.class);
        startActivity(i);
    }
    public void openPhrasesList(View view)
    {
        Intent i=new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
    public void openFamilyList(View view)
    {
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
}