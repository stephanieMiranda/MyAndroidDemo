package org.codedevils.myandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class DemoCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_course);

        //The button objects themselves.
        //Because we're using the id names here, this means we're
        // referring to the actual button we already created, and will show
        // and listen upon opening the applicaiton.
        Button course_one = (Button)findViewById(R.id.course_one);
        Button course_three = (Button)findViewById(R.id.course_three);

        //The action listener for course_one button.
        course_one.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent startStudyActivity = new Intent(getApplicationContext(), StudyDeck.class);
                        startActivity(startStudyActivity);

                        //Also the info for db info collection could/would go here?
                    }
                }
        );


    }
}
