package com.example.recipebook;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryRecipeActivity extends AppCompatActivity {

    TextView txtTitle;
    RecyclerView recyclerFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_recipe);

        txtTitle = findViewById(R.id.txtTitle);
        recyclerFood = findViewById(R.id.recyclerFood);

        String category = getIntent().getStringExtra("category");
        txtTitle.setText(category);

        ArrayList<String> foodList = new ArrayList<>();

        //  BREAKFAST
        if (category.equals("Breakfast")) {
            foodList.add("Poha");
            foodList.add("Upma");
            foodList.add("Cheese Toast");
            foodList.add("Aloo Paratha");
            foodList.add("Paneer Paratha");
            foodList.add("French Toast");
            foodList.add("Oats Porridge");

        }
        //  GUJARATI
        else if (category.equals("Gujarati")) {
            foodList.add("Dhokla");
            foodList.add("Khaman");
            foodList.add("Khandvi");
            foodList.add("Patra");
            foodList.add("Thepla");
            foodList.add("Bajra Rotla");
            foodList.add("Undhiyu");
            foodList.add("Handvo");
            foodList.add("Dal Dhokli");
            foodList.add("Sev Tameta");
            foodList.add("Ringna Bharta");
            foodList.add("Fafda");
            foodList.add("Khichdi");
            foodList.add("Gujarati Kadhi");

        }
        //  PUNJABI
        else if (category.equals("Punjabi")) {
            foodList.add("Paneer Butter Masala");
            foodList.add("Shahi Paneer");
            foodList.add("Palak Paneer");
            foodList.add("Chole Bhature");
            foodList.add("Dal Makhani");
            foodList.add("Rajma Chawal");
            foodList.add("Kadai Paneer");
            foodList.add("Paneer Tikka");
            foodList.add("Butter Naan");
            foodList.add("Amritsari Kulcha");

        }
        //  SOUTH INDIAN
        else if (category.equals("South Indian")) {
            foodList.add("Idli");
            foodList.add("Rava Idli");
            foodList.add("Masala Dosa");
            foodList.add("Plain Dosa");
            foodList.add("Uttapam");
            foodList.add("Vada");
            foodList.add("Puttu");
            foodList.add("Sambhar");
            foodList.add("Rasam");
            foodList.add("Coconut Chutney");
            foodList.add("Tomato Chutney");

        }
        //  PIZZA
        else if (category.equals("Pizza")) {
            foodList.add("Margherita Pizza");
            foodList.add("Cheese Pizza");
            foodList.add("Veg Pizza");
            foodList.add("Paneer Pizza");
            foodList.add("Corn Pizza");
            foodList.add("Mushroom Pizza");
            foodList.add("Farmhouse Pizza");

        }
        //  CHINESE
        else if (category.equals("Chinese")) {
            foodList.add("Veg Manchurian");
            foodList.add("Chilli Paneer");
            foodList.add("Chilli Potato");
            foodList.add("Hakka Noodles");
            foodList.add("Schezwan Noodles");
            foodList.add("Fried Rice");
            foodList.add("Schezwan Fried Rice");
            foodList.add("Spring Rolls");
            foodList.add("Veg Momos");

        }
        //  ITALIAN
        else if (category.equals("Italian")) {
            foodList.add("Pasta");
            foodList.add("White Sauce Pasta");
            foodList.add("Red Sauce Pasta");
            foodList.add("Pink Sauce Pasta");
            foodList.add("Spaghetti");
            foodList.add("Lasagna");
            foodList.add("Risotto");
            foodList.add("Garlic Bread");

        }
        //  MEXICAN
        else if (category.equals("Mexican")) {
            foodList.add("Tacos");
            foodList.add("Burritos");
            foodList.add("Nachos");
            foodList.add("Cheese Nachos");
            foodList.add("Quesadilla");
            foodList.add("Enchiladas");
            foodList.add("Mexican Rice");

        }
        //  HEALTHY
        else if (category.equals("Healthy")) {
            foodList.add("Green Salad");
            foodList.add("Fruit Salad");
            foodList.add("Sprouts Salad");
            foodList.add("Sprouts Chaat");
            foodList.add("Oats Upma");
            foodList.add("Oats Idli");
            foodList.add("Quinoa Salad");
            foodList.add("Vegetable Soup");

        }
        //  DESSERTS
        else if (category.equals("Desserts")) {
            foodList.add("Brownie");
            foodList.add("Chocolate Brownie");
            foodList.add("Fruit Custard");
            foodList.add("Pudding");
            foodList.add("Cup Cake");
            foodList.add("Donut");

        }
        //  INDIAN SWEETS
        else if (category.equals("Indian Sweets")) {
            foodList.add("Laddu");
            foodList.add("Motichoor Laddu");
            foodList.add("Besan Laddu");
            foodList.add("Barfi");
            foodList.add("Milk Barfi");
            foodList.add("Kaju Katli");
            foodList.add("Jalebi");
            foodList.add("Rasmalai");

        }
        //  CAKES
        else if (category.equals("Cakes")) {
            foodList.add("Chocolate Cake");
            foodList.add("Black Forest Cake");
            foodList.add("White Forest Cake");
            foodList.add("Vanilla Cake");
            foodList.add("Red Velvet Cake");
            foodList.add("Pineapple Cake");

        }
        //  COOKIES
        else if (category.equals("Cookies & Biscuits")) {
            foodList.add("Chocolate Cookies");
            foodList.add("Butter Cookies");
            foodList.add("Oat Cookies");
            foodList.add("Digestive Biscuits");
            foodList.add("Cream Biscuits");

        }
        //  ICE CREAM
        else if (category.equals("Ice Cream")) {
            foodList.add("Vanilla");
            foodList.add("Chocolate");
            foodList.add("Strawberry");
            foodList.add("Mango");
            foodList.add("Butterscotch");
            foodList.add("Malai Kulfi");

        }
        //  HOT DRINKS
        else if (category.equals("Hot Drinks")) {
            foodList.add("Masala Tea");
            foodList.add("Green Tea");
            foodList.add("Lemon Tea");
            foodList.add("Coffee");
            foodList.add("Cappuccino");
            foodList.add("Hot Chocolate");

        }
        //  COLD DRINKS
        else if (category.equals("Cold Drinks")) {
            foodList.add("Cold Coffee");
            foodList.add("Iced Tea");
            foodList.add("Lemon Soda");
            foodList.add("Coke");
            foodList.add("Sprite");

        }
        //  JUICE
        else if (category.equals("Juice")) {
            foodList.add("Orange Juice");
            foodList.add("Apple Juice");
            foodList.add("Mango Juice");
            foodList.add("Pineapple Juice");
            foodList.add("Pomegranate Juice");
            foodList.add("Watermelon Juice");

        }
        //  MILKSHAKES
        else if (category.equals("Milkshakes")) {
            foodList.add("Chocolate Milkshake");
            foodList.add("Strawberry Milkshake");
            foodList.add("Vanilla Milkshake");
            foodList.add("Mango Milkshake");
            foodList.add("Oreo Milkshake");

        }
        //  SMOOTHIES
        else if (category.equals("Smoothies")) {
            foodList.add("Banana Smoothie");
            foodList.add("Berry Smoothie");
            foodList.add("Mango Smoothie");
            foodList.add("Strawberry Smoothie");
            foodList.add("Green Smoothie");

        }
        //  MOCKTAILS
        else if (category.equals("Mocktails")) {
            foodList.add("Mojito");
            foodList.add("Virgin Mojito");
            foodList.add("Blue Lagoon");
            foodList.add("Fruit Punch");
            foodList.add("Lemon Mint Cooler");

        }

            // RecyclerView setup (SCROLL WORKING)
        recyclerFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerFood.setHasFixedSize(true);
        recyclerFood.setAdapter(new FoodAdapter(this, foodList));


    }
}
