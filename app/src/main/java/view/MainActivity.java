package view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;

import repository.Repository;
import snapchatadapter.Snapadapter;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeople;
    private Snapadapter staffAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeople = findViewById(R.id.rv_snap_stories);

        // Finish setting up recycleview
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        rvPeople.setHasFixedSize(true);

        // Init SnapAdapter
        staffAdapter = new Snapadapter()
    }
}
