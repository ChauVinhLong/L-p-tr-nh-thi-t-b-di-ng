package chauvinhlong.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGR;
    Button btnTip;
    RadioButton radioButton;
    EditText edtNhap;
    TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGR = findViewById(R.id.rGR);
        btnTip = findViewById(R.id.btnTip);
        edtNhap = findViewById(R.id.edtNhap);
        tvKQ = findViewById(R.id.tvKQ);

        btnTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioID =  rGR.getCheckedRadioButtonId();
                radioButton = findViewById(radioID);
                tvKQ.setText("Your tip will be $"+radioButton.getText());
            }
        });
    }
    public void checkRBT(View view) {
        int radioID =  rGR.getCheckedRadioButtonId();
        radioButton = findViewById(radioID);
        Toast.makeText(this,"Selected Radio Button: "+radioButton.getText(),Toast.LENGTH_SHORT).show();
        }

    public void Tip(View view) {
    }
}