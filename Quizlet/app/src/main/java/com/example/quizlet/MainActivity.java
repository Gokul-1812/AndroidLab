package com.example.quizlet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] question;

    {
        question = new String[]{"What is the colour of a polar bear’s skin?",
                "Which of the following is the only bird species that can fly backwards?",
                "Which animal is featured on the logo of the World Wild Fund?"
        };
    }
    String[] question_no;
    {
        question_no = new String[]{"Question 1", "Question 2", "Question 3"};
    }
    String[][] options;
    {
        options = new String[][]{
                {"White","Black","Brown"},
                {"Hummingbird", "Scarlet robin", "Spotted pardalote"},
                {"A dodo", "A koala", "A panda"}
        };
    }
    int[] answers;
    {
        answers = new int[]{1, 1, 3};
    }
    int counter = 0;
    int scor = 0;
    int[] select = new int[3];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.start);
        Button home = findViewById(R.id.home);

        start.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         setContentView(R.layout.quiz_activity);
                Button next = findViewById(R.id.ne);
                Button prev = findViewById(R.id.pre);
                TextView quest_no = (TextView) findViewById(R.id.question_no);
                TextView quest = (TextView) findViewById(R.id.question);
                TextView opt1  = (TextView) findViewById(R.id.op1);
                TextView opt2  = (TextView) findViewById(R.id.op2);
                TextView opt3  = (TextView) findViewById(R.id.op3);



                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counter +=1;
                        if(counter == 3){
                            for(int i=0; i<3; i++){
                                if(select[i]==answers[i]){
                                    scor +=1;
                                }
                            }

                            setContentView(R.layout.score);
                            TextView score = (TextView) findViewById(R.id.sc);
                            score.setText("Score: "+scor);
//                            home.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    setContentView(R.layout.activity_main);
//                                }
//                            }
//                            );
                            return;
                        }
                        quest.setText(question[counter]);
                        quest_no.setText(question_no[counter]);
                        opt1.setText(options[counter][0]);
                        opt2.setText(options[counter][1]);
                        opt3.setText(options[counter][2]);

                        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg);
                        radioGroup.clearCheck();
                        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId)
                            {
                                int[] ids = {R.id.op1, R.id.op2, R.id.op3};
                                    for(int i=0; i<3; i++){
                                        if(checkedId==ids[i]){
                                            select[counter]=i+1;
                                        }
                                    }

                            }

                        });
                        if(counter == 2){
                            next.setText("Submit");
                            next.setBackgroundColor(getResources().getColor(R.color.teal_700));
                        }






                    }
                }
                );
                prev.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counter -=1;
                        quest.setText(question[counter]);
                        quest_no.setText(question_no[counter]);
                        opt1.setText(options[counter][0]);
                        opt2.setText(options[counter][1]);
                        opt3.setText(options[counter][2]);
                        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg);
                        radioGroup.clearCheck();
                        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId)
                            {
                                int[] ids = {R.id.op1, R.id.op2, R.id.op3};
                                for(int i=0; i<3; i++){
                                    if(checkedId==ids[i]){
                                        select[counter]=i+1;
                                    }
                                }

                            }
                        });
                        next.setText("Next");
                        next.setBackgroundColor(getResources().getColor(R.color.purple_700));




                    }
                }
                );






            }
        }
        );

    }

}