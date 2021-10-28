package au.edu.unsw.infs3634.musicrecommender;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MusicHolder> {
    private List<Music> musicsToShow;
    private List<Music> musicsAll;

    public MusicListAdapter() {
        musicsToShow = new ArrayList<>();

        musicsAll = MusicLibrary.getAllMusics();
        musicsToShow.addAll(musicsAll);
    }

    @NonNull
    @Override
    public MusicListAdapter.MusicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new MusicHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicListAdapter.MusicHolder holder, int position) {
        Music item = musicsToShow.get(position);
        holder.tvName.setText(item.getName());
        holder.tvSinger.setText("Singer/Band: " + item.getSinger());
        holder.tvRating.setText("Rating: " + item.getRating());
        holder.tvGenre.setText("Genre: " + item.getGenre());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("music", item);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicsToShow.size();
    }

    public void search(String keyword) {
        musicsToShow.clear();
        for (Music music : musicsAll) {
            if (music.getName().contains(keyword)) {
                musicsToShow.add(music);
            }
        }
        notifyDataSetChanged();
    }

    public void showAll() {
        musicsToShow.clear();
        musicsToShow.addAll(musicsAll);
        notifyDataSetChanged();
    }

    public void sortByName() {
        musicsToShow.sort(new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                return m1.getName().compareTo(m2.getName());
            }
        });
        notifyDataSetChanged();
    }

    public void sortByRating() {
        musicsToShow.sort(new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                return -Integer.compare(m1.getRating(), m2.getRating());
            }
        });
        notifyDataSetChanged();
    }

    static class MusicHolder extends RecyclerView.ViewHolder {
        View itemView;
        TextView tvName, tvSinger, tvRating, tvGenre;

        public MusicHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            tvName = itemView.findViewById(R.id.tvName);
            tvSinger = itemView.findViewById(R.id.tvSinger);
            tvRating = itemView.findViewById(R.id.tvRating);
            tvGenre = itemView.findViewById(R.id.tvGenre);
        }
    }

}
