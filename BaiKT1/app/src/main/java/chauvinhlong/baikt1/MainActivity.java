package chauvinhlong.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUser , edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUser.getText().length() !=0 && edtPass.getText().length() !=0){
                    if (edtUser.getText().toString().equals("maicuongtho") && edtPass.getText().toString().equals("Cntt60ntu!")){
                        Toast.makeText(MainActivity.this,"User and Password is correct", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this,"User and Password is wrong", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }



    public void Login(View view) {
    }
}