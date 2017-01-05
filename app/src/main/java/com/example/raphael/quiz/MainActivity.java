package com.example.raphael.quiz;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

import static com.example.raphael.quiz.R.id.BUT1;
import static com.example.raphael.quiz.R.id.buttonPanel;

public class MainActivity extends AppCompatActivity {

    private Button but;
    private TextView pergunta;
    FirebaseDatabase database= FirebaseDatabase.getInstance();
    DatabaseReference myref= database.getReference("https://triviafortrial.firebaseio.com/");
    public void Pergunta(String Case)
    {
        pergunta= (TextView)findViewById(R.id.Question);
        pergunta.setText(Case);
    }
    public void Botao(String OPT)
    {
        but= (Button)findViewById(R.id.BUT1);
        but.setText(OPT);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Toy = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(Toy);
            }
        });
    }
    public void Botao2(String OPT)
    {
        but= (Button)findViewById(R.id.BUT2);
        but.setText(OPT);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Toy = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(Toy);
            }
        });
    }
    public void Botao3(String OPT)
    {
        but= (Button)findViewById(R.id.BUT3);
        but.setText(OPT);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Toy = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(Toy);
            }
        });
    }
    public void Botao4(String OPT)
    {
        but= (Button)findViewById(R.id.BUT4);
        but.setText(OPT);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Toy = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(Toy);
            }
        });
    }
    public void Fill_1(Quiz case1)
    {
        Resources res = getResources();
        String[] info = res.getStringArray(R.array.Case1_Array);
        case1.setQuestion(info[0]);
        case1.setAnswer(info[1]);
        case1.setOpt1(info[2]);
        case1.setOpt2(info[3]);
        case1.setOpt3(info[4]);
        case1.setOpt4(info[5]);
    }
    public void Fill_2(Quiz case1)
    {
        Resources res = getResources();
        String[] info = res.getStringArray(R.array.Case2_Array);
        case1.setQuestion(info[0]);
        case1.setAnswer(info[1]);
        case1.setOpt1(info[2]);
        case1.setOpt2(info[3]);
        case1.setOpt3(info[4]);
        case1.setOpt4(info[5]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random= new Random();
        int Caso= random.nextInt(2);
        Quiz case1= new Quiz();
        if (Caso==0)
        {
            Fill_1(case1);
        }
        else
        {
            Fill_2(case1);
        }
        Pergunta(case1.Question);
        Botao(case1.Opt1);
        Botao2(case1.Opt2);
        Botao3(case1.Opt3);
        Botao4(case1.Opt4);
    }


}
