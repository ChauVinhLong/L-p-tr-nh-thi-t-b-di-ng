package com.example.intent_61133899;

import static java.lang.String.copyValueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity{
    Button btnOk;
    EditText edtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnOk = findViewById(R.id.btnOk);
        edtUserName = findViewById(R.id.edtUserName);


    }

    public void btnOK(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        Float name = Float.parseFloat(edtUserName.getText().toString());
        intent.putExtra("name",name);

        startActivity(intent);
    }

}