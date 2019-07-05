package com.dscddu.clickme;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button click;
    private ConstraintLayout constraintLayout;
    private ArrayList<Integer> colors;
    private int max,min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new ArrayList<>();
        colors.add(Color.BLUE);
        colors.add(Color.RED);
        colors.add(Color.DKGRAY);
        colors.add(Color.YELLOW);
        colors.add(Color.BLACK);

        max = colors.size();
        min = 0;

        click = findViewById(R.id.clickMeButton);
        constraintLayout = findViewById(R.id.cons);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = new Random().nextInt(max-min);
                constraintLayout.setBackgroundColor(colors.get(index));
            }
        });
    }
}
