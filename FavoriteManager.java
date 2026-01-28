package com.example.recipebook;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class FavoriteManager {

    private static final String PREF_NAME = "fav_pref";
    private static final String KEY_FAVS = "favorites";

    // Add favorite
    public static void addFav(Context context, String food) {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favs = new HashSet<>(pref.getStringSet(KEY_FAVS, new HashSet<>()));
        favs.add(food);
        pref.edit().putStringSet(KEY_FAVS, favs).apply();
    }

    // Remove favorite
    public static void removeFav(Context context, String food) {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favs = new HashSet<>(pref.getStringSet(KEY_FAVS, new HashSet<>()));
        favs.remove(food);
        pref.edit().putStringSet(KEY_FAVS, favs).apply();
    }

    // Check favorite
    public static boolean isFav(Context context, String food) {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        Set<String> favs = pref.getStringSet(KEY_FAVS, new HashSet<>());
        return favs.contains(food);
    }
}
