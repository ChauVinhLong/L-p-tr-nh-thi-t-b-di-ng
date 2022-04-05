package cvlong.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resulttext;
    String calculate,BMIresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resulttext = findViewById(R.id.result);
    }

    public void calculateBMI(View view){
        String S1 = weight.getText().toString();
        String S2= height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2)/100;
        float bmi = weightValue / (heightValue*heightValue);

        if (bmi < 18.5){
            BMIresult = "Cân nặng thấp (gầy)";
        }else if (bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Bình thường";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMIresult = "Tiền béo phì";
        }else if (bmi >= 30 && bmi <=34.9){
            BMIresult = "Béo phì loại I";
        }else if (bmi >= 35 && bmi <=39.9){
            BMIresult = "Béo phì loại II";
        }else {
            BMIresult = "Béo phì loại III";
        }

        calculate =  bmi + "\n" +BMIresult;

        resulttext.setText(calculate);

    }
}