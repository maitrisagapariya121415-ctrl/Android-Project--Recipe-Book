package com.example.recipebook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Set;

public class FavoritesActivity extends AppCompatActivity {

    RecyclerView recyclerFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        recyclerFav = findViewById(R.id.recyclerFav);
        recyclerFav.setLayoutManager(new LinearLayoutManager(this));

        loadFavorites();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadFavorites(); // refresh when back
    }

    private void loadFavorites() {
        Set<String> favSet = getSharedPreferences("fav_pref", MODE_PRIVATE)
                .getStringSet("favorites", null);

        ArrayList<String> favList = new ArrayList<>();
        if (favSet != null) {
            favList.addAll(favSet);
        }

        recyclerFav.setAdapter(new FoodAdapter(this, favList));
    }
}
