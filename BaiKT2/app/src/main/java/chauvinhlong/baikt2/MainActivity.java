package chauvinhlong.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button btnTip;
    RadioButton r13,r15,r18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTip = findViewById(R.id.btnTip);
        r13 = findViewById(R.id.r13);
        r15 = findViewById(R.id.r15);
        r18 = findViewById(R.id.r18);

        
    }

    public void Tip(View view) {
    }
}