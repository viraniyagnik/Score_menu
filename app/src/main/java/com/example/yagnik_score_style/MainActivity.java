package com.example.yagnik_score_style;
//name: Yagnik Virani
//ID  : A00227162


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    //declare all variable for both teams India and Canada
    private TextView teamCanadaTextView;
    private TextView teamIndiaTextView;

    private int Rise;
    private int teamCanadaScore;
    private int teamIndiaScore;

    @Override
    //onCreate method for activity_main layout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamCanadaScore = 0;
        teamIndiaScore = 0;

        //radioGroup getviewByid
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this);

        //create variable for all buttons and get view by id
        Button CanadaupButton = findViewById(R.id.Canada_buttonUp);
        Button CanadadownButton = findViewById(R.id.Canada_buttonDown);
        Button IndiaupButton = findViewById(R.id.India_buttonUp);
        Button IndiadownButton = findViewById(R.id.India_buttonDown);
        // to set on click method for all butttons
        CanadaupButton.setOnClickListener(this);
        CanadadownButton.setOnClickListener(this);
        IndiaupButton.setOnClickListener(this);
        IndiadownButton.setOnClickListener(this);

        //Get both team textview by id
        teamCanadaTextView = findViewById(R.id.Canada_score);
        teamIndiaTextView = findViewById(R.id.India_score);

        //To set both team score
        teamIndiaTextView.setText(Integer.toString(teamIndiaScore));
        teamCanadaTextView.setText(Integer.toString(teamCanadaScore));


    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //cases for all option to increase and decrease score
        switch (i) {
            case 1:
                Rise = 1;
                break;
            case 2:
                Rise = 2;
                break;
            case 3:
                Rise = 3;
                break;
            case 4:
                Rise = 4;
                break;
            case 5:
                Rise = 6;
                break;
        }
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        //cases for all options such as increase and decrease for both teams
        switch (id) {
            case R.id.India_buttonUp:
                teamIndiaScore += Rise;
                teamIndiaTextView.setText(Integer.toString(teamIndiaScore));
                break;
            case R.id.India_buttonDown:
                teamIndiaScore -= Rise;
                teamIndiaTextView.setText(Integer.toString(teamIndiaScore));
                break;
            case R.id.Canada_buttonUp:
                teamCanadaScore += Rise;
                teamCanadaTextView.setText(Integer.toString(teamCanadaScore));
                break;
            case R.id.Canada_buttonDown:
                teamCanadaScore -= Rise;
                teamCanadaTextView.setText(Integer.toString(teamCanadaScore));
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        long id = item.getItemId();
        if(id == R.id.settings){
            Intent settings = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(settings);
                     return true;

        }
        else if(id == R.id.About_menu){
            Toast.makeText(
                    this, "Name: Yagnik Virani \nStudent Id : A00227162 \nCourse code: IOT1009", Toast.LENGTH_LONG).show();
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }

}
