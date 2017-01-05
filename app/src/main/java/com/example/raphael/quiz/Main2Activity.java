package com.example.raphael.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main2Activity extends AppCompatActivity {
    private TextView Resultado;
    String Erro;
    String Acerto;
    String Right;
    FirebaseDatabase database= FirebaseDatabase.getInstance();
    DatabaseReference myref= database.getReference("https://triviafortrial.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Right = dataSnapshot.child("Right").getValue(String.class);
                Log.d(Right, "Value is: "+Right);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(Erro, "Failed to read value.");

            }
        });
        Resultado= (TextView)findViewById(R.id.Resultado);
        Resultado.setText(Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);
        Log.i("verificando", "the value is:" + Right);

        }
    }


