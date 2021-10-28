package au.edu.unsw.infs3634.musicrecommender;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etKeyword = findViewById(R.id.etKeyword);
        Button btnSearch = findViewById(R.id.btnSearch);
        Button btnAll = findViewById(R.id.btnShowAll);
        RecyclerView recycler = findViewById(R.id.recycler);
        Button btnSortByName = findViewById(R.id.btnSortByName);
        Button btnSortByRating = findViewById(R.id.btnSortByRating);

        MusicListAdapter adapter = new MusicListAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(layoutManager);
        recycler.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recycler.setAdapter(adapter);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.search(etKeyword.getText().toString().trim());
            }
        });

        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.showAll();
            }
        });

        btnSortByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.sortByName();
            }
        });

        btnSortByRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.sortByRating();
            }
        });

    }
}