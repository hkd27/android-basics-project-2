package com.hemantdave.androidbaiscsnanodegreeproject2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int countTeam1=0,countTeam2=0;
    TextView team1TV;
    TextView team2TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointChange(View v){
        team1TV=(TextView)findViewById(R.id.team1TV);
        team2TV= (TextView)findViewById(R.id.team2TV);
        switch (v.getTag().toString()){


            case "first-three":
                countTeam1=countTeam1+3;
                Toast.makeText(MainActivity.this,"Team 1 Scored 3 points",Toast.LENGTH_SHORT).show();
                team1TV.setText(""+countTeam1);
                break;
            case "second-three":
                countTeam2=countTeam2+3;
                Toast.makeText(MainActivity.this,"Team 2 Scored 3 points",Toast.LENGTH_SHORT).show();
                team2TV.setText(""+countTeam2);
                break;
            case "first-two":
                countTeam1=countTeam1+2;
                Toast.makeText(MainActivity.this,"Team 1 Scored 2 points",Toast.LENGTH_LONG).show();
                team1TV.setText(""+countTeam1);
                break;
            case "second-two":
                countTeam2=countTeam2+2;
                team2TV.setText(""+countTeam2);
                Toast.makeText(MainActivity.this,"Team 2 Scored 2 points",Toast.LENGTH_LONG).show();
                break;
            case "first-one":
                countTeam1++;
                team1TV.setText(""+countTeam1);
                Toast.makeText(MainActivity.this,"Team 1 Scored 1 points",Toast.LENGTH_LONG).show();
                break;
            case "second-one":
                countTeam2++;
                team2TV.setText(""+countTeam2);
                Toast.makeText(MainActivity.this,"Team 2 Scored 1 points",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void reset(View v){
       recreate();

    }
}
