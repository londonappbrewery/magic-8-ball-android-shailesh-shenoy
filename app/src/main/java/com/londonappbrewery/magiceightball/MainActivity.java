package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decideButton = findViewById(R.id.decideButton);

        final ImageView ball = findViewById(R.id.ball);

        final int[] ballImages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        decideButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Random randomNumberGenerator = new Random();
                int randomNumber = randomNumberGenerator.nextInt(5);
                ball.setImageResource(ballImages[randomNumber]);
                Log.d("magiceightball", "random number is " + randomNumber);
            }
        });
    }
}
