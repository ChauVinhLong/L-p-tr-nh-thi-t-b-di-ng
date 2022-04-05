package cvlong.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Ham_Hi(android.view.View view){
        Toast.makeText(MainActivity.this, "Xin chào, tôi là long",Toast.LENGTH_SHORT ).show();
    }

}