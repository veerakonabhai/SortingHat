package com.example.veerareddykonabhai.sortinghat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main3Activity extends AppCompatActivity {
    TextView name;
   /* String hname;
    Button done;*/
  ImageView house;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        house =(ImageView)findViewById(R.id.house);
       /* done =(Button)findViewById(done);
        name =(TextView)findViewById(R.id.housename);
        final String[] house = {"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};
        Random random = new Random();
        int index = random.nextInt(house.length);
        hname =house[index];
        name.setText(hname);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(view.getContext(),MainActivity.class);
                //startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(),"Let your smile reach the needy",Toast.LENGTH_SHORT).show();
            }
        });*/
       name =(TextView)findViewById(R.id.name);
        Intent in = getIntent();
        final String text3= in.getExtras().getString("name");
        name.setText(text3);
        int[] cards={R.drawable.gryffindor,R.drawable.ravenclaw,R.drawable.slytherin,R.drawable.hufflepuff};
        Random r = new Random();
        int n=r.nextInt(4);
        house.setImageResource(cards[n]);
        Toast.makeText(getApplicationContext(),"CONGRATULATIONS",Toast.LENGTH_SHORT).show();
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Let your smile reach the needy",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
