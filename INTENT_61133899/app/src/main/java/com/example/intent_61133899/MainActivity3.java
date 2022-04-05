package com.example.intent_61133899;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView edtChaoMung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtChaoMung= (TextView) findViewById(R.id.edtChaoMung);
        String name =  edtChaoMung.getText().toString();

    }

    public void btnQuiz1(View view) {
        Intent ManHinh1 = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(ManHinh1);
    }

    public void btnQuiz2(View view) {
        Intent ManHinh2 = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(ManHinh2);
    }
}