package au.edu.unsw.infs3634.musicrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.image);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvSinger = findViewById(R.id.tvSinger);
        TextView tvRating = findViewById(R.id.tvRating);
        TextView tvGenre = findViewById(R.id.tvGenre);
        TextView tvDescription = findViewById(R.id.tvDescription);
        TextView tvLink = findViewById(R.id.tvLink);

        Music music = (Music) getIntent().getSerializableExtra("music");
        imageView.setImageResource(music.getImage());
        tvName.setText(music.getName());
        tvSinger.setText("Singer/Band: " + music.getSinger());
        tvRating.setText("Rating: " + music.getRating());
        tvGenre.setText("Genre: " + music.getGenre());
        tvDescription.setText("Description: \n" + music.getDescription());
        tvLink.setText("Open browser for more information");

        tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(music.getUrl()));
                startActivity(intent);
            }
        });
    }
}