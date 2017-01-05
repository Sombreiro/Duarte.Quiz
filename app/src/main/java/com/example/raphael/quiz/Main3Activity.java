package com.example.raphael.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main3Activity extends AppCompatActivity {
    private TextView Resultado;
    String Erro;
    String Acerto;
    String Right;
    String Wrong;
    FirebaseDatabase database= FirebaseDatabase.getInstance();
    DatabaseReference myref= database.getReference("https://triviafortrial.firebaseio.com/").child("Right");
    DatabaseReference my2ref= database.getReference("https://triviafortrial.firebaseio.com/").child("Wrong");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
