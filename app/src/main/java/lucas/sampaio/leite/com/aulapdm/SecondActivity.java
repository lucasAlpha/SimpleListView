package lucas.sampaio.leite.com.aulapdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String team = i.getStringExtra(MainActivity.TAG);

        textView = (TextView)findViewById(R.id.textViewAc2);
        textView.setText(team);



    }
}