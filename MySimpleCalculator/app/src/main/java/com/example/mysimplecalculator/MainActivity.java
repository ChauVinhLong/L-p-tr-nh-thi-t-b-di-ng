package com.example.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// khai báo sẵn các đối tượng sẽ làm việc
    EditText editSoA,editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget(){
        editSoA=(EditText)findViewById(R.id.edSoA);
        editSoB=(EditText)findViewById(R.id.edSoB);
        textViewKetQua=(TextView)findViewById(R.id.tvKetQua);
        nutCong=(Button)findViewById(R.id.btnAdd);
        nutTru=(Button)findViewById(R.id.btnSub);
        nutNhan=(Button)findViewById(R.id.btnMul);
        nutChia=(Button)findViewById(R.id.btnDiv);
    }
    //hàm xử lí
    public void XuLy_Cong(View view){
        EditText tvSoA=(EditText)findViewById(R.id.edSoA);
        int SoA= Integer.parseInt(tvSoA.getText().toString());
        EditText tvSoB=(EditText)findViewById(R.id.edSoB);
        int SoB= Integer.parseInt(tvSoB.getText().toString());
        int KetQua= SoA+SoB;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));

    }
    public void XuLy_Tru(View view){
        EditText tvSoA=(EditText)findViewById(R.id.edSoA);
        int SoA= Integer.parseInt(tvSoA.getText().toString());
        EditText tvSoB=(EditText)findViewById(R.id.edSoB);
        int SoB= Integer.parseInt(tvSoB.getText().toString());
        int KetQua= SoA-SoB;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));
    }
    public void XuLy_Nhan(View view){
        EditText tvSoA=(EditText)findViewById(R.id.edSoA);
        int SoA= Integer.parseInt(tvSoA.getText().toString());
        EditText tvSoB=(EditText)findViewById(R.id.edSoB);
        int SoB= Integer.parseInt(tvSoB.getText().toString());
        int KetQua= SoA*SoB;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));

    }
    public void XuLy_Chia(View view){
        EditText tvSoA=(EditText)findViewById(R.id.edSoA);
        float SoA= Integer.parseInt(tvSoA.getText().toString());
        EditText tvSoB=(EditText)findViewById(R.id.edSoB);
        float SoB= Integer.parseInt(tvSoB.getText().toString());
        float KetQua= SoA/SoB;
        TextView tvKetQua=(TextView)findViewById(R.id.tvKetQua);
        tvKetQua.setText(String.valueOf(KetQua));

    }

}