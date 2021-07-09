package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    static int quantity=1;
    static int price=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        EditText Name=(EditText) findViewById(R.id.name);
        String name=Name.getText().toString();
        CheckBox whipedCream=(CheckBox) findViewById(R.id.isCreamChecked);
        CheckBox chocolate=(CheckBox) findViewById(R.id.isChocoloateChecked);
        String message="";
        boolean creamStatus=false;
        boolean chocolateStatus=false;
        if(whipedCream.isChecked()) {
            creamStatus=true;
            price+=1;
        }
        if(chocolate.isChecked()) {
            chocolateStatus=true;
            price+=2;
        }
        message="Name: "+name+"\n"+"Quantity: "+quantity+"\n"+"With whiped cream? "+creamStatus+"\n"+"With Chocolate? "+chocolateStatus+"\n"+"Total: "+"$"+quantity*price+"\n"+"Thankyou!";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java Code OutPut for "+name);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void increment(View view) {
        if(quantity<10)
        ++quantity;

    }

    public void decrement(View view) {
        if(quantity>1)
        --quantity;

    }


}