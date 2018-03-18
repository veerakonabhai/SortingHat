package com.example.veerareddykonabhai.sortinghat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
        TextView fname;
        Button ready,notready;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fname =(TextView)findViewById(R.id.text3);
        //lname =(TextView)findViewById(R.id.text5);
        Intent in = getIntent();
        final String text3= in.getExtras().getString("fname");
       // String text5= in.getExtras().getString("lname");
        fname.setText(text3);
       // lname.setText(text5);
        ready =(Button)findViewById(R.id.ready);
        notready =(Button)findViewById(R.id.notready);
        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Main3Activity.class);
                intent.putExtra("name",text3);
                startActivity(intent);
                finish();
                }
        });
        notready.setOnClickListener(new View.OnClickListener() {
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
