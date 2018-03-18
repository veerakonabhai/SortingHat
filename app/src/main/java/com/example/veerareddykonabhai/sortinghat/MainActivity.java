package com.example.veerareddykonabhai.sortinghat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button yes,no;
    EditText fname,ticno;
    String name,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes =(Button)findViewById(R.id.yes1);
        no =(Button)findViewById(R.id.no1);
        fname = (EditText) findViewById(R.id.fname);
        ticno =(EditText)findViewById(R.id.ticketno);
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Welcome To Amusant 2k17", Snackbar.LENGTH_LONG);
        snackbar.show();
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name =fname.getText().toString();
                number =ticno.getText().toString();
                if (!name.equals("") && !number.equals("")) {
                    Intent intent = new Intent(view.getContext(), Main2Activity.class);
                    intent.putExtra("fname", fname.getText().toString());
                    startActivity(intent);
                    finish();
                }
                else{
                   // Toast.makeText(getApplicationContext(),"please fill the details",Toast.LENGTH_SHORT).show();
                    Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "please fill the details", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(),MainActivity.class);
                //startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"Allow others to give their details",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
