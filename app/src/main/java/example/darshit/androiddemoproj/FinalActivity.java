package example.darshit.androiddemoproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    TextView userName;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        init();
    }

    public void init(){
        user= getIntent().getStringExtra("USERNAME");
        userName = findViewById(R.id.tv_userName);
        userName.setText(user);
    }
}
