package com.example.recipebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    LinearLayout layBreakfast, layGujarati, layPunjabi, laySouth, layPizza,
            layChinese, layItalian, layMexican, layHealthy, layDesserts,
            laySweets, layCakes, layCookies, layIceCream, layHotDrinks,
            layColdDrinks, layJuice, layMilkshake, laySmoothies, layMocktails;

    ImageView btnFav; //  Favorites button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //  Favorites button
        btnFav = findViewById(R.id.btnFav);
        btnFav.setOnClickListener(v ->
                startActivity(new Intent(SecondActivity.this, FavoritesActivity.class))
        );

        // Initialize category layouts
        layBreakfast  = findViewById(R.id.layBreakfast);
        layGujarati   = findViewById(R.id.layGujarati);
        layPunjabi    = findViewById(R.id.layPunjabi);
        laySouth      = findViewById(R.id.laySouth);
        layPizza      = findViewById(R.id.layPizza);
        layChinese    = findViewById(R.id.layChinese);
        layItalian    = findViewById(R.id.layItalian);
        layMexican    = findViewById(R.id.layMexican);
        layHealthy    = findViewById(R.id.layHealthy);
        layDesserts   = findViewById(R.id.layDesserts);
        laySweets     = findViewById(R.id.laySweets);
        layCakes      = findViewById(R.id.layCakes);
        layCookies    = findViewById(R.id.layCookies);
        layIceCream   = findViewById(R.id.layIceCream);
        layHotDrinks  = findViewById(R.id.layHotDrinks);
        layColdDrinks = findViewById(R.id.layColdDrinks);
        layJuice      = findViewById(R.id.layJuice);
        layMilkshake  = findViewById(R.id.layMilkshake);
        laySmoothies  = findViewById(R.id.laySmoothies);
        layMocktails  = findViewById(R.id.layMocktails);

        // Category click listeners
        layBreakfast.setOnClickListener(v -> openCategory("Breakfast"));
        layGujarati.setOnClickListener(v -> openCategory("Gujarati"));
        layPunjabi.setOnClickListener(v -> openCategory("Punjabi"));
        laySouth.setOnClickListener(v -> openCategory("South Indian"));
        layPizza.setOnClickListener(v -> openCategory("Pizza"));
        layChinese.setOnClickListener(v -> openCategory("Chinese"));
        layItalian.setOnClickListener(v -> openCategory("Italian"));
        layMexican.setOnClickListener(v -> openCategory("Mexican"));
        layHealthy.setOnClickListener(v -> openCategory("Healthy"));
        layDesserts.setOnClickListener(v -> openCategory("Desserts"));
        laySweets.setOnClickListener(v -> openCategory("Indian Sweets"));
        layCakes.setOnClickListener(v -> openCategory("Cakes"));
        layCookies.setOnClickListener(v -> openCategory("Cookies & Biscuits"));
        layIceCream.setOnClickListener(v -> openCategory("Ice Cream"));
        layHotDrinks.setOnClickListener(v -> openCategory("Hot Drinks"));
        layColdDrinks.setOnClickListener(v -> openCategory("Cold Drinks"));
        layJuice.setOnClickListener(v -> openCategory("Juice"));
        layMilkshake.setOnClickListener(v -> openCategory("Milkshakes"));
        laySmoothies.setOnClickListener(v -> openCategory("Smoothies"));
        layMocktails.setOnClickListener(v -> openCategory("Mocktails"));
    }

    // Common method to open category list
    private void openCategory(String categoryName) {
        Intent intent = new Intent(SecondActivity.this, CategoryRecipeActivity.class);
        intent.putExtra("category", categoryName);
        startActivity(intent);
    }
}
