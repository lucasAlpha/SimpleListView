package lucas.sampaio.leite.com.aulapdm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String[] teams;
    public static final String TAG = "TEAM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        teams = getResources().getStringArray(R.array.teams);
        this.setListAdapter(new ArrayAdapter<>(this, R.layout.list_item, teams));

        ListView lv = getListView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String team = ((TextView)view).getText().toString();
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra(TAG, team);
                startActivity(i);
                //Toast.makeText(getApplicationContext(), team, Toast.LENGTH_LONG).show();
            }
        });

    }
}