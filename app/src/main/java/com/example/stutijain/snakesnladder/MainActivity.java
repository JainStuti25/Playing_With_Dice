package com.example.stutijain.snakesnladder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] myDice = {R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six};

    public void rollTapped(View view){
        Log.i("Button","Button Tapped");
        Random ran = new Random();
        int randNum = ran.nextInt(6);

        ImageView dice = findViewById(R.id.dice);
        dice.setImageResource(myDice[randNum]);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
