package com.example.recipebook;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    ImageView imgFood, imgFav;
    TextView txtFoodName, txtIngredients, txtSteps;

    boolean isFav;          // current fav status
    String food;            // food name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        // Init views
        imgFood = findViewById(R.id.imgFood);
        imgFav = findViewById(R.id.imgFav);
        txtFoodName = findViewById(R.id.txtFoodName);
        txtIngredients = findViewById(R.id.txtIngredients);
        txtSteps = findViewById(R.id.txtSteps);

        // Get food name
        food = getIntent().getStringExtra("food");
        txtFoodName.setText(food);

        // -------------------------
        // Food wise data
        // -------------------------
        if (food.equals("Poha")) {
            imgFood.setImageResource(R.drawable.poha);
            txtIngredients.setText(
                    "- Poha (Flattened Rice)\n" +
                            "- Onion (finely chopped)\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Green Chilies\n" +
                            "- Turmeric Powder\n" +
                            "- Peanuts\n" +
                            "- Lemon Juice\n" +
                            "- Salt (to taste)\n" +
                            "- Oil\n" +
                            "- Fresh Coriander Leaves"
            );

            txtSteps.setText(
                    "1. Take poha in a bowl and rinse it gently with water. Drain well.\n\n" +
                            "2. Heat oil in a pan and fry peanuts until they become crisp.\n\n" +
                            "3. Add mustard seeds and let them crackle.\n\n" +
                            "4. Add curry leaves and green chilies, then sauté for a few seconds.\n\n" +
                            "5. Add chopped onions and cook until soft and translucent.\n\n" +
                            "6. Add turmeric powder and salt. Mix well.\n\n" +
                            "7. Add soaked poha and gently mix everything together.\n\n" +
                            "8. Cover and cook on low flame for 3–4 minutes.\n\n" +
                            "9. Turn off the flame and add lemon juice.\n\n" +
                            "10. Garnish with fresh coriander leaves and serve hot."
            );
        }
        else if (food.equals("Upma")) {
            imgFood.setImageResource(R.drawable.upma);
            txtIngredients.setText(
                    "- Rava (Semolina)\n" +
                            "- Onion (chopped)\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Green Chilies\n" +
                            "- Ginger\n" +
                            "- Salt\n" +
                            "- Oil\n" +
                            "- Water"
            );

            txtSteps.setText(
                    "1. Dry roast rava lightly and keep aside.\n\n" +
                            "2. Heat oil, add mustard seeds and curry leaves.\n\n" +
                            "3. Add onion, ginger and green chilies. Sauté well.\n\n" +
                            "4. Add water and salt, bring to boil.\n\n" +
                            "5. Add rava slowly and stir continuously.\n\n" +
                            "6. Cook until soft and serve hot."
            );

        }
        else if (food.equals("Sandwich")) {
            imgFood.setImageResource(R.drawable.sandwich);
            txtIngredients.setText(
                    "- Bread Slices\n" +
                            "- Butter\n" +
                            "- Boiled Potato\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Green Chutney\n" +
                            "- Salt\n" +
                            "- Chaat Masala"
            );

            txtSteps.setText(
                    "1. Apply butter and chutney on bread slices.\n\n" +
                            "2. Add potato, onion and tomato slices.\n\n" +
                            "3. Sprinkle salt and chaat masala.\n\n" +
                            "4. Cover with another bread slice.\n\n" +
                            "5. Toast or grill and serve."
            );

        }
        else if (food.equals("Veg Toast")) {
            imgFood.setImageResource(R.drawable.vegtoast);
            txtIngredients.setText(
                    "- Bread\n" +
                            "- Onion\n" +
                            "- Capsicum\n" +
                            "- Tomato\n" +
                            "- Butter\n" +
                            "- Salt\n" +
                            "- Pepper"
            );

            txtSteps.setText(
                    "1. Chop all vegetables finely.\n\n" +
                            "2. Mix vegetables with salt and pepper.\n\n" +
                            "3. Spread butter on bread.\n\n" +
                            "4. Add vegetable mix on bread.\n\n" +
                            "5. Toast until golden brown."
            );

        }
        else if (food.equals("Cheese Toast")) {
            imgFood.setImageResource(R.drawable.cheesetoast);
            txtIngredients.setText(
                    "- Bread\n" +
                            "- Butter\n" +
                            "- Grated Cheese\n" +
                            "- Pepper\n" +
                            "- Oregano"
            );

            txtSteps.setText(
                    "1. Apply butter on bread slices.\n\n" +
                            "2. Add grated cheese evenly.\n\n" +
                            "3. Sprinkle pepper and oregano.\n\n" +
                            "4. Toast until cheese melts.\n\n" +
                            "5. Serve hot."
            );}
        else if (food.equals("Aloo Paratha")) {
            imgFood.setImageResource(R.drawable.alooparotha);
            txtIngredients.setText(
                    "- Wheat Flour\n" +
                            "- Boiled Potatoes\n" +
                            "- Green Chilies\n" +
                            "- Coriander\n" +
                            "- Salt\n" +
                            "- Red Chilli Powder\n" +
                            "- Oil / Ghee"
            );
            txtSteps.setText(
                    "1. Mash potatoes and add spices.\n\n" +
                            "2. Prepare dough from wheat flour.\n\n" +
                            "3. Stuff potato mixture inside dough.\n\n" +
                            "4. Roll into paratha.\n\n" +
                            "5. Cook on tawa using oil or ghee."
            );
        }
        else if (food.equals("Paneer Paratha")) {
            imgFood.setImageResource(R.drawable.paneerparotha);
            txtIngredients.setText(
                    "- Wheat Flour\n" +
                            "- Grated Paneer\n" +
                            "- Green Chilies\n" +
                            "- Coriander\n" +
                            "- Salt\n" +
                            "- Spices\n" +
                            "- Oil / Ghee"
            );

            txtSteps.setText(
                    "1. Mix paneer with spices.\n\n" +
                            "2. Prepare wheat dough.\n\n" +
                            "3. Stuff paneer mixture.\n\n" +
                            "4. Roll paratha carefully.\n\n" +
                            "5. Cook on tawa until golden."
            );
        }
        else if (food.equals("Pancakes")) {
            imgFood.setImageResource(R.drawable.pancakes);
            txtIngredients.setText(
                    "- Flour\n" +
                            "- Milk\n" +
                            "- Sugar\n" +
                            "- Baking Powder\n" +
                            "- Butter"
            );

            txtSteps.setText(
                    "1. Mix flour, sugar and baking powder.\n\n" +
                            "2. Add milk and prepare batter.\n\n" +
                            "3. Heat pan and grease with butter.\n\n" +
                            "4. Pour batter and cook both sides.\n\n" +
                            "5. Serve with honey or syrup."
            );
        }
        else if (food.equals("French Toast")) {
            imgFood.setImageResource(R.drawable.frenchtoast);
                txtIngredients.setText(
                        "- Bread\n" +
                                "- Milk\n" +
                                "- Egg\n" +
                                "- Sugar\n" +
                                "- Butter"
                );

                txtSteps.setText(
                        "1. Beat egg, milk and sugar.\n\n" +
                                "2. Dip bread slices in mixture.\n\n" +
                                "3. Heat pan with butter.\n\n" +
                                "4. Cook bread on both sides.\n\n" +
                                "5. Serve hot."
                );

            }
        else if (food.equals("Oats Porridge")) {
            imgFood.setImageResource(R.drawable.oats);
                txtIngredients.setText(
                        "- Oats\n" +
                                "- Milk / Water\n" +
                                "- Salt / Sugar\n" +
                                "- Fruits (optional)"
                );

                txtSteps.setText(
                        "1. Heat milk or water.\n\n" +
                                "2. Add oats and cook.\n\n" +
                                "3. Stir continuously.\n\n" +
                                "4. Add salt or sugar.\n\n" +
                                "5. Serve warm."
                );

            }
        else if (food.equals("Dhokla")) {
            imgFood.setImageResource(R.drawable.dhokla);
                txtIngredients.setText(
                        "- Gram Flour (Besan)\n" +
                                "- Curd\n" +
                                "- Eno / Fruit Salt\n" +
                                "- Turmeric Powder\n" +
                                "- Green Chilies\n" +
                                "- Mustard Seeds\n" +
                                "- Curry Leaves\n" +
                                "- Salt\n" +
                                "- Oil"
                );

                txtSteps.setText(
                        "1. Mix besan, curd, turmeric, salt and water to make a smooth batter.\n\n" +
                                "2. Add Eno and mix gently.\n\n" +
                                "3. Pour batter into a greased plate.\n\n" +
                                "4. Steam for 15–20 minutes.\n\n" +
                                "5. Heat oil, add mustard seeds and curry leaves.\n\n" +
                                "6. Pour tempering over dhokla and serve."
                );}
        else if (food.equals("Khaman")) {
            imgFood.setImageResource(R.drawable.khaman);
            txtIngredients.setText(
                    "- Gram Flour (Besan)\n" +
                            "- Lemon Juice\n" +
                            "- Sugar\n" +
                            "- Eno\n" +
                            "- Turmeric Powder\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Salt\n" +
                            "- Oil"
            );

            txtSteps.setText(
                    "1. Prepare a smooth batter using besan, water, lemon juice and sugar.\n\n" +
                            "2. Add turmeric and salt.\n\n" +
                            "3. Add Eno and mix lightly.\n\n" +
                            "4. Steam for 15 minutes.\n\n" +
                            "5. Prepare tempering with mustard seeds and curry leaves.\n\n" +
                            "6. Pour over khaman and serve."
            );}
        else if (food.equals("Khandvi")) {
            imgFood.setImageResource(R.drawable.khandvi);
            txtIngredients.setText(
                    "- Gram Flour (Besan)\n" +
                            "- Buttermilk\n" +
                            "- Turmeric Powder\n" +
                            "- Green Chilies Paste\n" +
                            "- Mustard Seeds\n" +
                            "- Sesame Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Mix besan and buttermilk without lumps.\n\n" +
                            "2. Cook mixture on low flame until thick.\n\n" +
                            "3. Spread thin on a plate.\n\n" +
                            "4. Cut into strips and roll.\n\n" +
                            "5. Temper with mustard seeds, sesame seeds and curry leaves.\n\n" +
                            "6. Serve garnished with coriander."
            );}
        else if (food.equals("Patra")) {
            imgFood.setImageResource(R.drawable.patra);
            txtIngredients.setText(
                    "- Colocasia Leaves\n" +
                            "- Gram Flour (Besan)\n" +
                            "- Tamarind Pulp\n" +
                            "- Jaggery\n" +
                            "- Spices\n" +
                            "- Mustard Seeds\n" +
                            "- Sesame Seeds\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Prepare thick besan paste with spices.\n\n" +
                            "2. Apply paste on colocasia leaves and roll tightly.\n\n" +
                            "3. Steam for 20 minutes.\n\n" +
                            "4. Cut into slices.\n\n" +
                            "5. Temper with mustard and sesame seeds.\n\n" +
                            "6. Serve hot."
            );
        }
        else if (food.equals("Thepla")) {
            imgFood.setImageResource(R.drawable.thepla);
            txtIngredients.setText(
                    "- Wheat Flour\n" +
                            "- Fenugreek Leaves (Methi)\n" +
                            "- Yogurt\n" +
                            "- Spices\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Mix all ingredients and knead into soft dough.\n\n" +
                            "2. Roll into flat circles.\n\n" +
                            "3. Cook on hot tawa using oil.\n\n" +
                            "4. Flip and cook both sides.\n\n" +
                            "5. Serve with curd or pickle."
            );

        }
        else if (food.equals("Bajra Rotla")) {
            imgFood.setImageResource(R.drawable.bajrarotla);
            txtIngredients.setText(
                    "- Bajra Flour\n" +
                            "- Warm Water\n" +
                            "- Salt\n" +
                            "- Ghee"
            );

            txtSteps.setText(
                    "1. Knead bajra flour with warm water.\n\n" +
                            "2. Make flat rotla using hands.\n\n" +
                            "3. Cook on hot tawa.\n\n" +
                            "4. Roast until cooked well.\n\n" +
                            "5. Serve hot with ghee."
            );
        }
        else if (food.equals("Undhiyu")) {
            imgFood.setImageResource(R.drawable.undhiyu);
            txtIngredients.setText(
                    "- Mixed Vegetables\n" +
                            "- Fenugreek Dumplings\n" +
                            "- Coconut\n" +
                            "- Green Chilies\n" +
                            "- Spices\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Prepare masala with coconut and spices.\n\n" +
                            "2. Stuff vegetables with masala.\n\n" +
                            "3. Cook in pot on low flame.\n\n" +
                            "4. Stir occasionally.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Handvo")) {
            imgFood.setImageResource(R.drawable.handvo);
            txtIngredients.setText(
                    "- Rice and Lentil Batter\n" +
                            "- Vegetables\n" +
                            "- Eno\n" +
                            "- Mustard Seeds\n" +
                            "- Sesame Seeds\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Prepare fermented batter.\n\n" +
                            "2. Add vegetables and spices.\n\n" +
                            "3. Pour into greased pan.\n\n" +
                            "4. Cook on low flame.\n\n" +
                            "5. Cut and serve."
            );
        }
        else if (food.equals("Dal Dhokli")) {
            imgFood.setImageResource(R.drawable.daldhokli);
            txtIngredients.setText(
                    "- Wheat Flour\n" +
                            "- Toor Dal\n" +
                            "- Spices\n" +
                            "- Ghee\n" +
                            "- Tamarind\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Cook dal with spices.\n\n" +
                            "2. Prepare wheat dough and cut strips.\n\n" +
                            "3. Add strips to boiling dal.\n\n" +
                            "4. Cook until soft.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Sev Tameta")) {
            imgFood.setImageResource(R.drawable.sevtameta);
            txtIngredients.setText(
                    "- Tomatoes\n" +
                            "- Sev\n" +
                            "- Spices\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Cook tomatoes with spices.\n\n" +
                            "2. Prepare thick gravy.\n\n" +
                            "3. Add sev just before serving.\n\n" +
                            "4. Mix gently.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Ringna Bharta")) {
            imgFood.setImageResource(R.drawable.ringanabharta);
            txtIngredients.setText(
                    "- Brinjal (Eggplant)\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Garlic\n" +
                            "- Oil\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Roast brinjal until soft.\n\n" +
                            "2. Mash properly.\n\n" +
                            "3. Cook with onion, tomato and spices.\n\n" +
                            "4. Mix well.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Fafda")) {
            imgFood.setImageResource(R.drawable.fafda);
            txtIngredients.setText(
                    "- Gram Flour\n" +
                            "- Ajwain\n" +
                            "- Oil\n" +
                            "- Water\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Prepare stiff dough.\n\n" +
                            "2. Shape into strips.\n\n" +
                            "3. Fry in hot oil.\n\n" +
                            "4. Fry until crisp.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Khichdi")) {
            imgFood.setImageResource(R.drawable.khichdi);
            txtIngredients.setText(
                    "- Rice\n" +
                            "- Moong Dal\n" +
                            "- Turmeric\n" +
                            "- Ghee\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Wash rice and dal.\n\n" +
                            "2. Cook with water and turmeric.\n\n" +
                            "3. Add salt and ghee.\n\n" +
                            "4. Cook until soft.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Gujarati Kadhi")) {
            imgFood.setImageResource(R.drawable.kadhi);
            txtIngredients.setText(
                    "- Curd\n" +
                            "- Gram Flour\n" +
                            "- Ginger\n" +
                            "- Green Chilies\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Sugar\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Mix curd and besan smoothly.\n\n" +
                            "2. Cook mixture on low flame.\n\n" +
                            "3. Add ginger, chilies and sugar.\n\n" +
                            "4. Prepare tempering.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Paneer Butter Masala")) {
            imgFood.setImageResource(R.drawable.paneer_butter_masala);
            txtIngredients.setText(
                    "- Paneer\n- Butter\n- Tomato Puree\n- Cream\n- Ginger Garlic Paste\n- Garam Masala\n- Salt"
            );
            txtSteps.setText(
                    "1. Heat butter and sauté ginger-garlic.\n\n" +
                            "2. Add tomato puree and cook well.\n\n" +
                            "3. Add spices and cream.\n\n" +
                            "4. Add paneer cubes.\n\n" +
                            "5. Simmer and serve hot."
            );
        }
        else if (food.equals("Shahi Paneer")) {
            imgFood.setImageResource(R.drawable.sahi_paneer);
            txtIngredients.setText(
                    "- Paneer\n- Cashew Paste\n- Cream\n- Onion Paste\n- Garam Masala\n- Butter\n- Salt"
            );
            txtSteps.setText(
                    "1. Fry onion paste in butter.\n\n" +
                            "2. Add cashew paste and spices.\n\n" +
                            "3. Add cream and mix.\n\n" +
                            "4. Add paneer cubes.\n\n" +
                            "5. Cook and serve."
            );
        }
        else if (food.equals("Palak Paneer")) {
            imgFood.setImageResource(R.drawable.palak_paneer);
            txtIngredients.setText(
                    "- Spinach\n- Paneer\n- Garlic\n- Green Chilies\n- Onion\n- Spices\n- Salt"
            );
            txtSteps.setText(
                    "1. Blanch spinach and make puree.\n\n" +
                            "2. Sauté garlic and onion.\n\n" +
                            "3. Add spinach puree and spices.\n\n" +
                            "4. Add paneer.\n\n" +
                            "5. Cook and serve."
            );
        }
        else if (food.equals("Chole Bhature")) {
            imgFood.setImageResource(R.drawable.chole_bhature);
            txtIngredients.setText(
                    "- Chickpeas\n- Onion\n- Tomato\n- Chole Masala\n- Flour\n- Yeast\n- Oil\n- Salt"
            );
            txtSteps.setText(
                    "1. Cook chickpeas.\n\n" +
                            "2. Prepare chole masala gravy.\n\n" +
                            "3. Knead dough for bhature.\n\n" +
                            "4. Deep fry bhature.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Dal Makhani")) {
            imgFood.setImageResource(R.drawable.dal_makhni);
            txtIngredients.setText(
                    "- Black Lentils\n- Kidney Beans\n- Butter\n- Cream\n- Tomato\n- Spices\n- Salt"
            );
            txtSteps.setText(
                    "1. Soak and boil lentils.\n\n" +
                            "2. Prepare tomato gravy.\n\n" +
                            "3. Add lentils and butter.\n\n" +
                            "4. Simmer slowly.\n\n" +
                            "5. Add cream and serve."
            );
        }
        else if (food.equals("Rajma Chawal")) {
            imgFood.setImageResource(R.drawable.rajma_chaval);
            txtIngredients.setText(
                    "- Kidney Beans\n- Onion\n- Tomato\n- Ginger Garlic\n- Spices\n- Rice\n- Salt"
            );
            txtSteps.setText(
                    "1. Soak and boil rajma.\n\n" +
                            "2. Prepare masala.\n\n" +
                            "3. Add rajma and cook.\n\n" +
                            "4. Cook rice.\n\n" +
                            "5. Serve together."
            );
        }
        else if (food.equals("Kadai Paneer")) {
            imgFood.setImageResource(R.drawable.kadai_paneer);
            txtIngredients.setText(
                    "- Paneer\n- Capsicum\n- Onion\n- Tomato\n- Kadai Masala\n- Oil\n- Salt"
            );
            txtSteps.setText(
                    "1. Sauté vegetables.\n\n" +
                            "2. Add tomato masala.\n\n" +
                            "3. Add spices.\n\n" +
                            "4. Add paneer.\n\n" +
                            "5. Cook and serve."
            );
        }
        else if (food.equals("Paneer Tikka")) {
            imgFood.setImageResource(R.drawable.paneer_tikka);
            txtIngredients.setText(
                    "- Paneer\n- Curd\n- Ginger Garlic Paste\n- Spices\n- Capsicum\n- Onion\n- Salt"
            );
            txtSteps.setText(
                    "1. Marinate paneer.\n\n" +
                            "2. Skewer with veggies.\n\n" +
                            "3. Grill or roast.\n\n" +
                            "4. Turn sides.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Butter Naan")) {
            imgFood.setImageResource(R.drawable.butter_naan);
            txtIngredients.setText(
                    "- Flour\n- Curd\n- Yeast\n- Butter\n- Salt\n- Water"
            );
            txtSteps.setText(
                    "1. Knead soft dough.\n\n" +
                            "2. Rest dough.\n\n" +
                            "3. Roll naan.\n\n" +
                            "4. Cook on tawa.\n\n" +
                            "5. Apply butter."
            );
        }
        else if (food.equals("Amritsari Kulcha")) {
            imgFood.setImageResource(R.drawable.amritsari_kulcha);
            txtIngredients.setText(
                    "- Maida (Refined Flour)\n" +
                            "- Curd\n" +
                            "- Baking Powder\n" +
                            "- Baking Soda\n" +
                            "- Boiled Potatoes\n" +
                            "- Onion (finely chopped)\n" +
                            "- Green Chilies\n" +
                            "- Coriander Leaves\n" +
                            "- Garam Masala\n" +
                            "- Salt\n" +
                            "- Butter"
            );

            txtSteps.setText(
                    "1. Knead soft dough using maida, curd, baking powder and salt.\n\n" +
                            "2. Prepare stuffing with mashed potatoes, onion, chilies and spices.\n\n" +
                            "3. Stuff the dough balls with potato mixture.\n\n" +
                            "4. Roll gently into thick kulcha.\n\n" +
                            "5. Cook on hot tawa until golden spots appear.\n\n" +
                            "6. Apply butter generously and serve hot with chole."
            );
        }

        else if (food.equals("Idli")) {
            imgFood.setImageResource(R.drawable.idli);
            txtIngredients.setText(
                    "- Rice\n" +
                            "- Urad Dal\n" +
                            "- Fenugreek Seeds\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Soak rice and dal separately.\n\n" +
                            "2. Grind into smooth batter.\n\n" +
                            "3. Ferment overnight.\n\n" +
                            "4. Steam batter in idli moulds.\n\n" +
                            "5. Serve hot with chutney and sambar."
            );
        }

        else if (food.equals("Rava Idli")) {
            imgFood.setImageResource(R.drawable.rava_idli);
            txtIngredients.setText(
                    "- Rava (Semolina)\n" +
                            "- Curd\n" +
                            "- Eno/Fruit Salt\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Roast rava lightly.\n\n" +
                            "2. Mix with curd and spices.\n\n" +
                            "3. Add Eno just before steaming.\n\n" +
                            "4. Steam for 12–15 minutes.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Masala Dosa")) {
            imgFood.setImageResource(R.drawable.masala_dosa);
            txtIngredients.setText(
                    "- Rice\n" +
                            "- Urad Dal\n" +
                            "- Potatoes\n" +
                            "- Onion\n" +
                            "- Spices\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Prepare dosa batter and ferment.\n\n" +
                            "2. Prepare potato masala.\n\n" +
                            "3. Spread batter on tawa.\n\n" +
                            "4. Place masala inside dosa.\n\n" +
                            "5. Fold and serve hot."
            );
        }

        else if (food.equals("Plain Dosa")) {
            imgFood.setImageResource(R.drawable.plain_dosa);
            txtIngredients.setText(
                    "- Rice\n" +
                            "- Urad Dal\n" +
                            "- Salt\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Grind rice and dal batter.\n\n" +
                            "2. Ferment overnight.\n\n" +
                            "3. Spread batter on hot tawa.\n\n" +
                            "4. Cook till crispy.\n\n" +
                            "5. Serve with chutney."
            );
        }
        else if (food.equals("Uttapam")) {
            imgFood.setImageResource(R.drawable.uttapam);
            txtIngredients.setText(
                    "- Dosa Batter\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Green Chilies\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Pour thick batter on tawa.\n\n" +
                            "2. Add chopped vegetables.\n\n" +
                            "3. Cook on low flame.\n\n" +
                            "4. Flip gently.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Vada")) {
            imgFood.setImageResource(R.drawable.vada);
            txtIngredients.setText(
                    "- Urad Dal\n" +
                            "- Onion\n" +
                            "- Green Chilies\n" +
                            "- Curry Leaves\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Grind soaked dal.\n\n" +
                            "2. Add spices and onion.\n\n" +
                            "3. Shape into vadas.\n\n" +
                            "4. Deep fry till golden.\n\n" +
                            "5. Serve with chutney."
            );
        }
        else if (food.equals("Puttu")) {
            imgFood.setImageResource(R.drawable.puttu);

            txtIngredients.setText(
                    "- Rice Flour\n" +
                            "- Grated Coconut\n" +
                            "- Water\n" +
                            "- Salt"
            );

            txtSteps.setText(
                    "1. Take rice flour and add salt.\n\n" +
                            "2. Sprinkle water and mix to crumbly texture.\n\n" +
                            "3. Add coconut and rice flour in layers in puttu maker.\n\n" +
                            "4. Steam for 6–8 minutes.\n\n" +
                            "5. Serve hot with kadala curry or banana."
            );
        }

        else if (food.equals("Sambhar")) {
            imgFood.setImageResource(R.drawable.sambhar);
            txtIngredients.setText(
                    "- Toor Dal\n" +
                            "- Vegetables\n" +
                            "- Tamarind\n" +
                            "- Sambar Powder\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Cook dal till soft.\n\n" +
                            "2. Boil vegetables.\n\n" +
                            "3. Add tamarind and spices.\n\n" +
                            "4. Mix dal and vegetables.\n\n" +
                            "5. Simmer and serve."
            );
        }

        else if (food.equals("Rasam")) {
            imgFood.setImageResource(R.drawable.rasam);
            txtIngredients.setText(
                    "- Tamarind\n" +
                            "- Tomato\n" +
                            "- Rasam Powder\n" +
                            "- Garlic\n" +
                            "- Curry Leaves"
            );
            txtSteps.setText(
                    "1. Extract tamarind water.\n\n" +
                            "2. Add tomato and spices.\n\n" +
                            "3. Boil lightly.\n\n" +
                            "4. Add tempering.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Coconut Chutney")) {
            imgFood.setImageResource(R.drawable.coconut_chutney);
            txtIngredients.setText(
                    "- Coconut\n" +
                            "- Green Chilies\n" +
                            "- Ginger\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Grind all ingredients.\n\n" +
                            "2. Add water as needed.\n\n" +
                            "3. Prepare tempering.\n\n" +
                            "4. Mix with chutney.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Tomato Chutney")) {
            imgFood.setImageResource(R.drawable.tomato_chutney);
            txtIngredients.setText(
                    "- Tomato\n" +
                            "- Onion\n" +
                            "- Garlic\n" +
                            "- Red Chilies\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Fry tomatoes and onion.\n\n" +
                            "2. Grind into paste.\n\n" +
                            "3. Add tempering.\n\n" +
                            "4. Mix well.\n\n" +
                            "5. Serve with dosa or idli."
            );
        }
        else if (food.equals("Margherita Pizza")) {
            imgFood.setImageResource(R.drawable.margherita_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Tomato Sauce\n" +
                            "- Mozzarella Cheese\n" +
                            "- Olive Oil\n" +
                            "- Oregano\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Preheat oven.\n\n" +
                            "2. Spread tomato sauce on base.\n\n" +
                            "3. Add mozzarella cheese.\n\n" +
                            "4. Bake till cheese melts.\n\n" +
                            "5. Sprinkle oregano and serve hot."
            );
        }

        else if (food.equals("Cheese Pizza")) {
            imgFood.setImageResource(R.drawable.cheese_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Tomato Sauce\n" +
                            "- Mozzarella Cheese\n" +
                            "- Butter\n" +
                            "- Oregano"
            );
            txtSteps.setText(
                    "1. Apply sauce on pizza base.\n\n" +
                            "2. Add generous cheese layer.\n\n" +
                            "3. Bake in oven.\n\n" +
                            "4. Cook till golden.\n\n" +
                            "5. Slice and serve."
            );
        }

        else if (food.equals("Veg Pizza")) {
            imgFood.setImageResource(R.drawable.veg_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Tomato Sauce\n" +
                            "- Capsicum\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Cheese\n" +
                            "- Oregano"
            );
            txtSteps.setText(
                    "1. Spread sauce on base.\n\n" +
                            "2. Add vegetables evenly.\n\n" +
                            "3. Top with cheese.\n\n" +
                            "4. Bake till crisp.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Paneer Pizza")) {
            imgFood.setImageResource(R.drawable.paneer_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Paneer Cubes\n" +
                            "- Capsicum\n" +
                            "- Onion\n" +
                            "- Cheese\n" +
                            "- Pizza Sauce"
            );
            txtSteps.setText(
                    "1. Spread sauce on pizza base.\n\n" +
                            "2. Add paneer and veggies.\n\n" +
                            "3. Sprinkle cheese.\n\n" +
                            "4. Bake till cooked.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Corn Pizza")) {
            imgFood.setImageResource(R.drawable.corn_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Sweet Corn\n" +
                            "- Cheese\n" +
                            "- Tomato Sauce\n" +
                            "- Oregano"
            );
            txtSteps.setText(
                    "1. Spread sauce on base.\n\n" +
                            "2. Add boiled corn.\n\n" +
                            "3. Add cheese topping.\n\n" +
                            "4. Bake till cheese melts.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Mushroom Pizza")) {
            imgFood.setImageResource(R.drawable.mashroom_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Mushroom Slices\n" +
                            "- Onion\n" +
                            "- Cheese\n" +
                            "- Pizza Sauce"
            );
            txtSteps.setText(
                    "1. Spread sauce on base.\n\n" +
                            "2. Add mushrooms and onion.\n\n" +
                            "3. Sprinkle cheese.\n\n" +
                            "4. Bake till crispy.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Farmhouse Pizza")) {
            imgFood.setImageResource(R.drawable.farmhouse_pizza);
            txtIngredients.setText(
                    "- Pizza Base\n" +
                            "- Onion\n" +
                            "- Capsicum\n" +
                            "- Tomato\n" +
                            "- Mushroom\n" +
                            "- Cheese\n" +
                            "- Pizza Sauce"
            );
            txtSteps.setText(
                    "1. Spread sauce on pizza base.\n\n" +
                            "2. Add all vegetables.\n\n" +
                            "3. Cover with cheese.\n\n" +
                            "4. Bake till golden.\n\n" +
                            "5. Cut and serve hot."
            );
        }
        else if (food.equals("Veg Manchurian")) {
            imgFood.setImageResource(R.drawable.veg_manchurian);
            txtIngredients.setText(
                    "- Cabbage\n" +
                            "- Carrot\n" +
                            "- Cornflour\n" +
                            "- All Purpose Flour\n" +
                            "- Garlic\n" +
                            "- Soy Sauce\n" +
                            "- Salt\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Mix vegetables and flour.\n\n" +
                            "2. Make balls and deep fry.\n\n" +
                            "3. Prepare sauce with garlic and soy sauce.\n\n" +
                            "4. Add fried balls to sauce.\n\n" +
                            "5. Mix well and serve hot."
            );
        }

        else if (food.equals("Chilli Paneer")) {
            imgFood.setImageResource(R.drawable.chilli_paneer);
            txtIngredients.setText(
                    "- Paneer\n" +
                            "- Capsicum\n" +
                            "- Onion\n" +
                            "- Garlic\n" +
                            "- Soy Sauce\n" +
                            "- Chilli Sauce\n" +
                            "- Cornflour\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Fry paneer cubes.\n\n" +
                            "2. Saute onion and capsicum.\n\n" +
                            "3. Add sauces and spices.\n\n" +
                            "4. Add paneer and toss well.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Chilli Potato")) {
            imgFood.setImageResource(R.drawable.chilli_potato);
            txtIngredients.setText(
                    "- Potato\n" +
                            "- Cornflour\n" +
                            "- Garlic\n" +
                            "- Soy Sauce\n" +
                            "- Chilli Sauce\n" +
                            "- Salt\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Cut potatoes and fry.\n\n" +
                            "2. Prepare sauce in pan.\n\n" +
                            "3. Add fried potatoes.\n\n" +
                            "4. Toss with sauces.\n\n" +
                            "5. Serve crispy."
            );
        }

        else if (food.equals("Hakka Noodles")) {
            imgFood.setImageResource(R.drawable.hakka_noodles);
            txtIngredients.setText(
                    "- Noodles\n" +
                            "- Cabbage\n" +
                            "- Carrot\n" +
                            "- Capsicum\n" +
                            "- Garlic\n" +
                            "- Soy Sauce\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil noodles and drain.\n\n" +
                            "2. Saute garlic and vegetables.\n\n" +
                            "3. Add noodles and sauces.\n\n" +
                            "4. Toss on high flame.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Schezwan Noodles")) {
            imgFood.setImageResource(R.drawable.schezwan_noodles);
            txtIngredients.setText(
                    "- Noodles\n" +
                            "- Vegetables\n" +
                            "- Schezwan Sauce\n" +
                            "- Garlic\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil noodles.\n\n" +
                            "2. Saute vegetables and garlic.\n\n" +
                            "3. Add schezwan sauce.\n\n" +
                            "4. Mix noodles well.\n\n" +
                            "5. Serve spicy."
            );
        }

        else if (food.equals("Fried Rice")) {
            imgFood.setImageResource(R.drawable.fried_rice);
            txtIngredients.setText(
                    "- Cooked Rice\n" +
                            "- Vegetables\n" +
                            "- Garlic\n" +
                            "- Soy Sauce\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Heat oil in pan.\n\n" +
                            "2. Saute garlic and vegetables.\n\n" +
                            "3. Add cooked rice.\n\n" +
                            "4. Add soy sauce and toss.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Schezwan Fried Rice")) {
            imgFood.setImageResource(R.drawable.schezwan_fried_rice);
            txtIngredients.setText(
                    "- Cooked Rice\n" +
                            "- Vegetables\n" +
                            "- Schezwan Sauce\n" +
                            "- Garlic\n" +
                            "- Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Saute garlic and vegetables.\n\n" +
                            "2. Add schezwan sauce.\n\n" +
                            "3. Add cooked rice.\n\n" +
                            "4. Mix on high flame.\n\n" +
                            "5. Serve spicy."
            );
        }

        else if (food.equals("Spring Rolls")) {
            imgFood.setImageResource(R.drawable.spring_rolls);
            txtIngredients.setText(
                    "- Spring Roll Sheets\n" +
                            "- Cabbage\n" +
                            "- Carrot\n" +
                            "- Capsicum\n" +
                            "- Soy Sauce\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Prepare vegetable stuffing.\n\n" +
                            "2. Fill stuffing in sheets.\n\n" +
                            "3. Roll tightly.\n\n" +
                            "4. Deep fry till golden.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Veg Momos")) {
            imgFood.setImageResource(R.drawable.veg_momos);
            txtIngredients.setText(
                    "- Momo Sheets\n" +
                            "- Cabbage\n" +
                            "- Carrot\n" +
                            "- Onion\n" +
                            "- Garlic\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Prepare vegetable filling.\n\n" +
                            "2. Fill in momo sheets.\n\n" +
                            "3. Shape momos.\n\n" +
                            "4. Steam for 10–12 minutes.\n\n" +
                            "5. Serve with chutney."
            );
        }
        else if (food.equals("Pasta")) {
            imgFood.setImageResource(R.drawable.pasta);
            txtIngredients.setText(
                    "- Pasta\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Garlic\n" +
                            "- Olive Oil\n" +
                            "- Salt\n" +
                            "- Herbs"
            );
            txtSteps.setText(
                    "1. Boil pasta in salted water.\n\n" +
                            "2. Heat oil and sauté garlic & onion.\n\n" +
                            "3. Add tomato and spices.\n\n" +
                            "4. Mix boiled pasta.\n\n" +
                            "5. Cook for 2 minutes and serve."
            );
        }

        else if (food.equals("White Sauce Pasta")) {
            imgFood.setImageResource(R.drawable.white_sauce_pasta);
            txtIngredients.setText(
                    "- Pasta\n" +
                            "- Butter\n" +
                            "- Maida\n" +
                            "- Milk\n" +
                            "- Cheese\n" +
                            "- Salt\n" +
                            "- Pepper"
            );
            txtSteps.setText(
                    "1. Boil pasta and keep aside.\n\n" +
                            "2. Melt butter and add maida.\n\n" +
                            "3. Add milk slowly and cook.\n\n" +
                            "4. Add cheese and seasoning.\n\n" +
                            "5. Mix pasta and serve hot."
            );
        }

        else if (food.equals("Red Sauce Pasta")) {
            imgFood.setImageResource(R.drawable.red_sauce_pasta);
            txtIngredients.setText(
                    "- Pasta\n" +
                            "- Tomato Puree\n" +
                            "- Garlic\n" +
                            "- Onion\n" +
                            "- Olive Oil\n" +
                            "- Chili Flakes\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil pasta.\n\n" +
                            "2. Heat oil and sauté garlic.\n\n" +
                            "3. Add onion and tomato puree.\n\n" +
                            "4. Add spices and herbs.\n\n" +
                            "5. Mix pasta and cook briefly."
            );
        }

        else if (food.equals("Pink Sauce Pasta")) {
            imgFood.setImageResource(R.drawable.pink_sauce_pasta);
            txtIngredients.setText(
                    "- Pasta\n" +
                            "- Tomato Puree\n" +
                            "- Milk\n" +
                            "- Butter\n" +
                            "- Cheese\n" +
                            "- Salt\n" +
                            "- Herbs"
            );
            txtSteps.setText(
                    "1. Prepare red sauce base.\n\n" +
                            "2. Add milk and butter.\n\n" +
                            "3. Mix well till creamy.\n\n" +
                            "4. Add pasta and cheese.\n\n" +
                            "5. Cook and serve hot."
            );
        }

        else if (food.equals("Spaghetti")) {
            imgFood.setImageResource(R.drawable.spaghetti);
            txtIngredients.setText(
                    "- Spaghetti Pasta\n" +
                            "- Tomato Sauce\n" +
                            "- Garlic\n" +
                            "- Olive Oil\n" +
                            "- Herbs\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil spaghetti till al dente.\n\n" +
                            "2. Heat oil and sauté garlic.\n\n" +
                            "3. Add tomato sauce and herbs.\n\n" +
                            "4. Mix spaghetti well.\n\n" +
                            "5. Serve with cheese."
            );
        }

        else if (food.equals("Lasagna")) {
            imgFood.setImageResource(R.drawable.lasagna);
            txtIngredients.setText(
                    "- Lasagna Sheets\n" +
                            "- Tomato Sauce\n" +
                            "- White Sauce\n" +
                            "- Cheese\n" +
                            "- Vegetables\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil lasagna sheets.\n\n" +
                            "2. Prepare red and white sauce.\n\n" +
                            "3. Layer sheets with sauces.\n\n" +
                            "4. Add cheese layers.\n\n" +
                            "5. Bake till golden."
            );
        }

        else if (food.equals("Risotto")) {
            imgFood.setImageResource(R.drawable.risotto);
            txtIngredients.setText(
                    "- Arborio Rice\n" +
                            "- Vegetable Stock\n" +
                            "- Butter\n" +
                            "- Onion\n" +
                            "- Cheese\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Sauté onion in butter.\n\n" +
                            "2. Add rice and stir.\n\n" +
                            "3. Add stock slowly.\n\n" +
                            "4. Stir till creamy.\n\n" +
                            "5. Add cheese and serve."
            );
        }

        else if (food.equals("Garlic Bread")) {
            imgFood.setImageResource(R.drawable.garlic_bread);
            txtIngredients.setText(
                    "- Bread\n" +
                            "- Butter\n" +
                            "- Garlic\n" +
                            "- Herbs\n" +
                            "- Cheese"
            );
            txtSteps.setText(
                    "1. Mix butter and garlic.\n\n" +
                            "2. Spread on bread slices.\n\n" +
                            "3. Add herbs and cheese.\n\n" +
                            "4. Bake till crispy.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Tacos")) {
            imgFood.setImageResource(R.drawable.tacos);
            txtIngredients.setText(
                    "- Taco Shells\n" +
                            "- Boiled Beans / Veggies\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Cheese\n" +
                            "- Spices\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Prepare vegetable filling with spices.\n\n" +
                            "2. Heat taco shells lightly.\n\n" +
                            "3. Fill shells with veggies.\n\n" +
                            "4. Add cheese and toppings.\n\n" +
                            "5. Serve immediately."
            );
        }

        else if (food.equals("Burritos")) {
            imgFood.setImageResource(R.drawable.burritos);
            txtIngredients.setText(
                    "- Tortilla Wraps\n" +
                            "- Rice\n" +
                            "- Beans\n" +
                            "- Veggies\n" +
                            "- Cheese\n" +
                            "- Salsa"
            );
            txtSteps.setText(
                    "1. Prepare rice and bean mixture.\n\n" +
                            "2. Warm tortilla wraps.\n\n" +
                            "3. Add filling in center.\n\n" +
                            "4. Roll tightly into burrito.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Nachos")) {
            imgFood.setImageResource(R.drawable.nachos);
            txtIngredients.setText(
                    "- Nacho Chips\n" +
                            "- Cheese Sauce\n" +
                            "- Jalapenos\n" +
                            "- Onion\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Arrange nacho chips on plate.\n\n" +
                            "2. Pour cheese sauce evenly.\n\n" +
                            "3. Add jalapenos and onion.\n\n" +
                            "4. Bake or microwave briefly.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Cheese Nachos")) {
            imgFood.setImageResource(R.drawable.cheese_nachos);
            txtIngredients.setText(
                    "- Nacho Chips\n" +
                            "- Cheese\n" +
                            "- Butter\n" +
                            "- Jalapenos\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Melt cheese with butter.\n\n" +
                            "2. Spread chips on tray.\n\n" +
                            "3. Pour melted cheese on chips.\n\n" +
                            "4. Add jalapenos.\n\n" +
                            "5. Serve immediately."
            );
        }

        else if (food.equals("Quesadilla")) {
            imgFood.setImageResource(R.drawable.quesadilla);
            txtIngredients.setText(
                    "- Tortilla\n" +
                            "- Cheese\n" +
                            "- Onion\n" +
                            "- Capsicum\n" +
                            "- Butter"
            );
            txtSteps.setText(
                    "1. Heat tortilla on pan.\n\n" +
                            "2. Add cheese and vegetables.\n\n" +
                            "3. Fold tortilla in half.\n\n" +
                            "4. Cook till golden.\n\n" +
                            "5. Cut and serve."
            );
        }

        else if (food.equals("Enchiladas")) {
            imgFood.setImageResource(R.drawable.enchiladas);
            txtIngredients.setText(
                    "- Tortilla\n" +
                            "- Veg Filling\n" +
                            "- Enchilada Sauce\n" +
                            "- Cheese\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Prepare vegetable filling.\n\n" +
                            "2. Roll filling in tortillas.\n\n" +
                            "3. Place in baking dish.\n\n" +
                            "4. Pour sauce and cheese.\n\n" +
                            "5. Bake and serve hot."
            );
        }

        else if (food.equals("Mexican Rice")) {
            imgFood.setImageResource(R.drawable.mexican_rice);
            txtIngredients.setText(
                    "- Rice\n" +
                            "- Tomato Puree\n" +
                            "- Onion\n" +
                            "- Garlic\n" +
                            "- Spices\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Fry onion and garlic.\n\n" +
                            "2. Add tomato puree and spices.\n\n" +
                            "3. Add rice and water.\n\n" +
                            "4. Cook till rice is done.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Green Salad")) {
            imgFood.setImageResource(R.drawable.green_salad);
            txtIngredients.setText(
                    "- Lettuce\n" +
                            "- Cucumber\n" +
                            "- Spinach\n" +
                            "- Lemon Juice\n" +
                            "- Olive Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Wash all vegetables thoroughly.\n\n" +
                            "2. Chop vegetables finely.\n\n" +
                            "3. Add lemon juice and olive oil.\n\n" +
                            "4. Sprinkle salt lightly.\n\n" +
                            "5. Toss well and serve fresh."
            );
        }

        else if (food.equals("Fruit Salad")) {
            imgFood.setImageResource(R.drawable.fruit_salad);
            txtIngredients.setText(
                    "- Apple\n" +
                            "- Banana\n" +
                            "- Papaya\n" +
                            "- Pomegranate\n" +
                            "- Honey\n" +
                            "- Lemon Juice"
            );
            txtSteps.setText(
                    "1. Wash and cut all fruits.\n\n" +
                            "2. Mix fruits in a bowl.\n\n" +
                            "3. Add honey and lemon juice.\n\n" +
                            "4. Mix gently.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Sprouts Salad")) {
            imgFood.setImageResource(R.drawable.sprouts_salad);
            txtIngredients.setText(
                    "- Mixed Sprouts\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Lemon Juice\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil sprouts lightly.\n\n" +
                            "2. Chop onion and tomato.\n\n" +
                            "3. Mix sprouts and vegetables.\n\n" +
                            "4. Add lemon juice and salt.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Sprouts Chaat")) {
            imgFood.setImageResource(R.drawable.sprouts_chaat);
            txtIngredients.setText(
                    "- Sprouts\n" +
                            "- Onion\n" +
                            "- Tomato\n" +
                            "- Chaat Masala\n" +
                            "- Lemon Juice\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Boil sprouts properly.\n\n" +
                            "2. Add chopped onion and tomato.\n\n" +
                            "3. Sprinkle chaat masala.\n\n" +
                            "4. Add lemon juice.\n\n" +
                            "5. Mix and serve."
            );
        }

        else if (food.equals("Oats Upma")) {
            imgFood.setImageResource(R.drawable.otas_upma);
            txtIngredients.setText(
                    "- Oats\n" +
                            "- Onion\n" +
                            "- Vegetables\n" +
                            "- Mustard Seeds\n" +
                            "- Curry Leaves\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Dry roast oats and keep aside.\n\n" +
                            "2. Heat oil and add mustard seeds.\n\n" +
                            "3. Add onion and vegetables.\n\n" +
                            "4. Add oats and mix well.\n\n" +
                            "5. Cook for 5 minutes and serve."
            );
        }

        else if (food.equals("Oats Idli")) {
            imgFood.setImageResource(R.drawable.oats_idli);
            txtIngredients.setText(
                    "- Oats Powder\n" +
                            "- Rava\n" +
                            "- Curd\n" +
                            "- Eno\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Mix oats powder and rava.\n\n" +
                            "2. Add curd and make batter.\n\n" +
                            "3. Add Eno before steaming.\n\n" +
                            "4. Steam for 12–15 minutes.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Quinoa Salad")) {
            imgFood.setImageResource(R.drawable.quino_salad);
            txtIngredients.setText(
                    "- Quinoa\n" +
                            "- Cucumber\n" +
                            "- Tomato\n" +
                            "- Lemon Juice\n" +
                            "- Olive Oil\n" +
                            "- Salt"
            );
            txtSteps.setText(
                    "1. Cook quinoa and let it cool.\n\n" +
                            "2. Chop vegetables.\n\n" +
                            "3. Mix quinoa and vegetables.\n\n" +
                            "4. Add lemon juice and olive oil.\n\n" +
                            "5. Toss and serve."
            );
        }

        else if (food.equals("Vegetable Soup")) {
            imgFood.setImageResource(R.drawable.vegetable_soup);
            txtIngredients.setText(
                    "- Mixed Vegetables\n" +
                            "- Garlic\n" +
                            "- Black Pepper\n" +
                            "- Salt\n" +
                            "- Water"
            );
            txtSteps.setText(
                    "1. Chop all vegetables.\n\n" +
                            "2. Boil vegetables in water.\n\n" +
                            "3. Add garlic and pepper.\n\n" +
                            "4. Simmer for 10 minutes.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Brownie")) {
            imgFood.setImageResource(R.drawable.brownie);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Cocoa Powder\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Baking Powder\n" +
                            "- Milk"
            );
            txtSteps.setText(
                    "1. Preheat oven to 180°C.\n\n" +
                            "2. Mix dry ingredients.\n\n" +
                            "3. Add butter and milk.\n\n" +
                            "4. Pour batter into tray.\n\n" +
                            "5. Bake for 25–30 minutes."
            );
        }

        else if (food.equals("Chocolate Brownie")) {
            imgFood.setImageResource(R.drawable.chocolate_brownie);
            txtIngredients.setText(
                    "- Dark Chocolate\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Flour\n" +
                            "- Cocoa Powder\n" +
                            "- Eggs"
            );
            txtSteps.setText(
                    "1. Melt chocolate and butter.\n\n" +
                            "2. Add sugar and eggs.\n\n" +
                            "3. Mix flour and cocoa.\n\n" +
                            "4. Pour into baking tray.\n\n" +
                            "5. Bake till fudgy."
            );
        }

        else if (food.equals("Fruit Custard")) {
            imgFood.setImageResource(R.drawable.fruit_custard);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Custard Powder\n" +
                            "- Sugar\n" +
                            "- Mixed Fruits"
            );
            txtSteps.setText(
                    "1. Boil milk with sugar.\n\n" +
                            "2. Mix custard powder separately.\n\n" +
                            "3. Add custard to milk.\n\n" +
                            "4. Cool completely.\n\n" +
                            "5. Add chopped fruits and serve."
            );
        }

        else if (food.equals("Pudding")) {
            imgFood.setImageResource(R.drawable.pudding);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Sugar\n" +
                            "- Cornflour\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Heat milk with sugar.\n\n" +
                            "2. Add cornflour slurry.\n\n" +
                            "3. Cook till thick.\n\n" +
                            "4. Add vanilla essence.\n\n" +
                            "5. Cool and serve chilled."
            );
        }

        else if (food.equals("Cup Cake")) {
            imgFood.setImageResource(R.drawable.cup_cake);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Baking Powder\n" +
                            "- Milk\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Preheat oven.\n\n" +
                            "2. Mix flour and baking powder.\n\n" +
                            "3. Add butter, sugar and milk.\n\n" +
                            "4. Pour into cupcake moulds.\n\n" +
                            "5. Bake for 20 minutes."
            );
        }

        else if (food.equals("Donut")) {
            imgFood.setImageResource(R.drawable.donut);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Sugar\n" +
                            "- Yeast\n" +
                            "- Milk\n" +
                            "- Butter\n" +
                            "- Oil"
            );
            txtSteps.setText(
                    "1. Prepare dough with yeast.\n\n" +
                            "2. Let dough rise.\n\n" +
                            "3. Shape donuts.\n\n" +
                            "4. Deep fry till golden.\n\n" +
                            "5. Coat with sugar or chocolate."
            );
        }
        else if (food.equals("Laddu")) {
            imgFood.setImageResource(R.drawable.laddu);
            txtIngredients.setText(
                    "- Gram Flour (Besan)\n" +
                            "- Ghee\n" +
                            "- Sugar\n" +
                            "- Cardamom Powder"
            );
            txtSteps.setText(
                    "1. Roast besan in ghee till aromatic.\n\n" +
                            "2. Allow mixture to cool slightly.\n\n" +
                            "3. Add sugar and cardamom.\n\n" +
                            "4. Mix well and shape into laddus.\n\n" +
                            "5. Serve or store."
            );
        }

        else if (food.equals("Motichoor Laddu")) {
            imgFood.setImageResource(R.drawable.motichoor_laddu);
            txtIngredients.setText(
                    "- Fine Besan\n" +
                            "- Sugar\n" +
                            "- Ghee\n" +
                            "- Food Color\n" +
                            "- Cardamom"
            );
            txtSteps.setText(
                    "1. Prepare sugar syrup.\n\n" +
                            "2. Fry tiny boondi from besan batter.\n\n" +
                            "3. Mix boondi with syrup.\n\n" +
                            "4. Add ghee and cardamom.\n\n" +
                            "5. Shape into laddus."
            );
        }

        else if (food.equals("Besan Laddu")) {
            imgFood.setImageResource(R.drawable.besan_laddu);
            txtIngredients.setText(
                    "- Besan\n" +
                            "- Ghee\n" +
                            "- Powdered Sugar\n" +
                            "- Cardamom\n" +
                            "- Dry Fruits"
            );
            txtSteps.setText(
                    "1. Roast besan in ghee slowly.\n\n" +
                            "2. Cool the mixture.\n\n" +
                            "3. Add sugar and cardamom.\n\n" +
                            "4. Mix thoroughly.\n\n" +
                            "5. Shape into laddus."
            );
        }

        else if (food.equals("Barfi")) {
            imgFood.setImageResource(R.drawable.barfi);
            txtIngredients.setText(
                    "- Milk Powder\n" +
                            "- Milk\n" +
                            "- Sugar\n" +
                            "- Ghee"
            );
            txtSteps.setText(
                    "1. Heat ghee and add milk.\n\n" +
                            "2. Add milk powder and sugar.\n\n" +
                            "3. Cook till thick.\n\n" +
                            "4. Spread mixture on tray.\n\n" +
                            "5. Cut into pieces."
            );
        }

        else if (food.equals("Milk Barfi")) {
            imgFood.setImageResource(R.drawable.milk_barfi);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Sugar\n" +
                            "- Cardamom Powder\n" +
                            "- Ghee"
            );
            txtSteps.setText(
                    "1. Boil milk till thick.\n\n" +
                            "2. Add sugar and cardamom.\n\n" +
                            "3. Stir continuously.\n\n" +
                            "4. Spread in greased tray.\n\n" +
                            "5. Cut and serve."
            );
        }

        else if (food.equals("Kaju Katli")) {
            imgFood.setImageResource(R.drawable.kaju_katli);
            txtIngredients.setText(
                    "- Cashew Nuts\n" +
                            "- Sugar\n" +
                            "- Water\n" +
                            "- Ghee"
            );
            txtSteps.setText(
                    "1. Grind cashews into fine powder.\n\n" +
                            "2. Prepare sugar syrup.\n\n" +
                            "3. Add cashew powder to syrup.\n\n" +
                            "4. Cook till dough forms.\n\n" +
                            "5. Roll and cut into diamonds."
            );
        }

        else if (food.equals("Jalebi")) {
            imgFood.setImageResource(R.drawable.jalebi);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Corn Flour\n" +
                            "- Curd\n" +
                            "- Sugar\n" +
                            "- Saffron\n" +
                            "- Oil/Ghee"
            );
            txtSteps.setText(
                    "1. Prepare fermented batter.\n\n" +
                            "2. Fry spiral shapes in hot oil.\n\n" +
                            "3. Dip fried jalebi in sugar syrup.\n\n" +
                            "4. Soak briefly.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Rasmalai")) {
            imgFood.setImageResource(R.drawable.rasmalai);
            txtIngredients.setText(
                    "- Paneer\n" +
                            "- Milk\n" +
                            "- Sugar\n" +
                            "- Cardamom\n" +
                            "- Saffron"
            );
            txtSteps.setText(
                    "1. Prepare soft paneer balls.\n\n" +
                            "2. Cook balls in sugar syrup.\n\n" +
                            "3. Boil milk till thick.\n\n" +
                            "4. Add saffron and cardamom.\n\n" +
                            "5. Soak balls in flavored milk."
            );
        }
        else if (food.equals("Chocolate Cake")) {
            imgFood.setImageResource(R.drawable.chocolate);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Cocoa Powder\n" +
                            "- Sugar\n" +
                            "- Milk\n" +
                            "- Butter\n" +
                            "- Baking Powder\n" +
                            "- Baking Soda\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Preheat oven to 180°C.\n\n" +
                            "2. Mix dry ingredients.\n\n" +
                            "3. Add milk, butter and mix well.\n\n" +
                            "4. Pour batter into cake tin.\n\n" +
                            "5. Bake for 30–35 minutes.\n\n" +
                            "6. Cool and serve."
            );
        }

        else if (food.equals("Black Forest Cake")) {
            imgFood.setImageResource(R.drawable.black_forest);
            txtIngredients.setText(
                    "- Chocolate Cake Base\n" +
                            "- Whipping Cream\n" +
                            "- Cherries\n" +
                            "- Chocolate Shavings\n" +
                            "- Sugar Syrup"
            );
            txtSteps.setText(
                    "1. Slice chocolate cake layers.\n\n" +
                            "2. Apply sugar syrup.\n\n" +
                            "3. Spread whipped cream.\n\n" +
                            "4. Add cherries and layers.\n\n" +
                            "5. Cover with cream and chocolate shavings.\n\n" +
                            "6. Chill before serving."
            );
        }

        else if (food.equals("White Forest Cake")) {
            imgFood.setImageResource(R.drawable.white_forest);
            txtIngredients.setText(
                    "- Vanilla Cake Base\n" +
                            "- Whipping Cream\n" +
                            "- Cherries\n" +
                            "- White Chocolate\n" +
                            "- Sugar Syrup"
            );
            txtSteps.setText(
                    "1. Cut vanilla cake layers.\n\n" +
                            "2. Soak layers with syrup.\n\n" +
                            "3. Spread whipped cream.\n\n" +
                            "4. Add cherries.\n\n" +
                            "5. Decorate with white chocolate.\n\n" +
                            "6. Refrigerate and serve."
            );
        }

        else if (food.equals("Vanilla Cake")) {
            imgFood.setImageResource(R.drawable.vanilla);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Sugar\n" +
                            "- Butter\n" +
                            "- Milk\n" +
                            "- Baking Powder\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Preheat oven.\n\n" +
                            "2. Cream butter and sugar.\n\n" +
                            "3. Add milk and vanilla.\n\n" +
                            "4. Fold flour and baking powder.\n\n" +
                            "5. Bake for 30 minutes.\n\n" +
                            "6. Cool and serve."
            );
        }

        else if (food.equals("Red Velvet Cake")) {
            imgFood.setImageResource(R.drawable.red_velvet);
            txtIngredients.setText(
                    "- All Purpose Flour\n" +
                            "- Cocoa Powder\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Buttermilk\n" +
                            "- Red Food Color\n" +
                            "- Baking Soda\n" +
                            "- Vinegar"
            );
            txtSteps.setText(
                    "1. Mix dry ingredients.\n\n" +
                            "2. Add wet ingredients and color.\n\n" +
                            "3. Prepare smooth batter.\n\n" +
                            "4. Pour into cake tin.\n\n" +
                            "5. Bake for 30–35 minutes.\n\n" +
                            "6. Cool and frost."
            );
        }

        else if (food.equals("Pineapple Cake")) {
            imgFood.setImageResource(R.drawable.pineapple);
            txtIngredients.setText(
                    "- Vanilla Cake Base\n" +
                            "- Pineapple Slices\n" +
                            "- Pineapple Syrup\n" +
                            "- Whipping Cream\n" +
                            "- Sugar"
            );
            txtSteps.setText(
                    "1. Slice cake layers.\n\n" +
                            "2. Apply pineapple syrup.\n\n" +
                            "3. Spread whipped cream.\n\n" +
                            "4. Add pineapple slices.\n\n" +
                            "5. Cover with cream.\n\n" +
                            "6. Chill and serve."
            );
        }
        else if (food.equals("Chocolate Cookies")) {
            imgFood.setImageResource(R.drawable.chocolate_cookies);
            txtIngredients.setText(
                    "- All-purpose Flour\n" +
                            "- Cocoa Powder\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Baking Powder\n" +
                            "- Milk"
            );
            txtSteps.setText(
                    "1. Mix butter and sugar until creamy.\n\n" +
                            "2. Add cocoa powder and flour.\n\n" +
                            "3. Prepare soft dough.\n\n" +
                            "4. Shape cookies and place on tray.\n\n" +
                            "5. Bake until crisp."
            );
        }

        else if (food.equals("Butter Cookies")) {
            imgFood.setImageResource(R.drawable.butter_cookies);
            txtIngredients.setText(
                    "- Butter\n" +
                            "- Powdered Sugar\n" +
                            "- All-purpose Flour\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Cream butter and sugar.\n\n" +
                            "2. Add flour and vanilla.\n\n" +
                            "3. Prepare smooth dough.\n\n" +
                            "4. Shape cookies.\n\n" +
                            "5. Bake till golden."
            );
        }

        else if (food.equals("Oat Cookies")) {
            imgFood.setImageResource(R.drawable.oats_cookies);
            txtIngredients.setText(
                    "- Oats\n" +
                            "- Wheat Flour\n" +
                            "- Butter\n" +
                            "- Honey or Sugar\n" +
                            "- Baking Powder"
            );
            txtSteps.setText(
                    "1. Grind oats lightly.\n\n" +
                            "2. Mix with flour and baking powder.\n\n" +
                            "3. Add butter and honey.\n\n" +
                            "4. Prepare dough and shape cookies.\n\n" +
                            "5. Bake till crisp."
            );
        }

        else if (food.equals("Digestive Biscuits")) {
            imgFood.setImageResource(R.drawable.digestive_biscuits);
            txtIngredients.setText(
                    "- Whole Wheat Flour\n" +
                            "- Oats\n" +
                            "- Butter\n" +
                            "- Brown Sugar\n" +
                            "- Baking Soda"
            );
            txtSteps.setText(
                    "1. Mix dry ingredients.\n\n" +
                            "2. Add butter and sugar.\n\n" +
                            "3. Prepare firm dough.\n\n" +
                            "4. Roll and cut biscuits.\n\n" +
                            "5. Bake till crisp."
            );
        }
        else if (food.equals("Cream Biscuits")) {
            imgFood.setImageResource(R.drawable.cream_biscuits);
            txtIngredients.setText(
                    "- All-purpose Flour\n" +
                            "- Butter\n" +
                            "- Sugar\n" +
                            "- Cream\n" +
                            "- Vanilla Essence"
            );
            txtSteps.setText(
                    "1. Prepare biscuit dough.\n\n" +
                            "2. Bake plain biscuits.\n\n" +
                            "3. Prepare sweet cream filling.\n\n" +
                            "4. Sandwich cream between biscuits.\n\n" +
                            "5. Serve fresh."
            );
        }
        else if (food.equals("Vanilla")) {
            imgFood.setImageResource(R.drawable.vanilla);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Fresh Cream\n" +
                            "- Sugar\n" +
                            "- Vanilla Essence\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Boil milk and reduce slightly.\n\n" +
                            "2. Add sugar and cream.\n\n" +
                            "3. Mix cornflour slurry.\n\n" +
                            "4. Add vanilla essence.\n\n" +
                            "5. Freeze for 6–8 hours."
            );
        }

        else if (food.equals("Chocolate")) {
            imgFood.setImageResource(R.drawable.chocolate_ice);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Cocoa Powder\n" +
                            "- Sugar\n" +
                            "- Fresh Cream\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Heat milk and cocoa powder.\n\n" +
                            "2. Add sugar and cream.\n\n" +
                            "3. Mix cornflour slurry.\n\n" +
                            "4. Cook till thick.\n\n" +
                            "5. Freeze overnight."
            );
        }

        else if (food.equals("Strawberry")) {
            imgFood.setImageResource(R.drawable.strawberry);
            txtIngredients.setText(
                    "- Strawberries\n" +
                            "- Milk\n" +
                            "- Sugar\n" +
                            "- Fresh Cream\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Blend strawberries into puree.\n\n" +
                            "2. Heat milk and sugar.\n\n" +
                            "3. Add strawberry puree.\n\n" +
                            "4. Add cream and slurry.\n\n" +
                            "5. Freeze till set."
            );
        }

        else if (food.equals("Mango")) {
            imgFood.setImageResource(R.drawable.mango);
            txtIngredients.setText(
                    "- Mango Pulp\n" +
                            "- Milk\n" +
                            "- Sugar\n" +
                            "- Fresh Cream\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Heat milk and sugar.\n\n" +
                            "2. Add mango pulp.\n\n" +
                            "3. Mix fresh cream.\n\n" +
                            "4. Add cornflour slurry.\n\n" +
                            "5. Freeze for several hours."
            );
        }

        else if (food.equals("Butterscotch")) {
            imgFood.setImageResource(R.drawable.butterscotch);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Brown Sugar\n" +
                            "- Butter\n" +
                            "- Fresh Cream\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Melt butter and sugar.\n\n" +
                            "2. Add milk and cream.\n\n" +
                            "3. Mix cornflour slurry.\n\n" +
                            "4. Cook till thick.\n\n" +
                            "5. Freeze till firm."
            );
        }

        else if (food.equals("Malai Kulfi")) {
            imgFood.setImageResource(R.drawable.malai_kulfi);
            txtIngredients.setText(
                    "- Full Cream Milk\n" +
                            "- Sugar\n" +
                            "- Cardamom Powder\n" +
                            "- Dry Fruits\n" +
                            "- Cornflour"
            );
            txtSteps.setText(
                    "1. Boil milk till thick.\n\n" +
                            "2. Add sugar and cardamom.\n\n" +
                            "3. Add dry fruits.\n\n" +
                            "4. Pour into moulds.\n\n" +
                            "5. Freeze overnight."
            );
        }
        else if (food.equals("Masala Tea")) {
            imgFood.setImageResource(R.drawable.masala_tea);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Water\n" +
                            "- Tea Leaves\n" +
                            "- Ginger\n" +
                            "- Cardamom\n" +
                            "- Sugar"
            );
            txtSteps.setText(
                    "1. Boil water with ginger and cardamom.\n\n" +
                            "2. Add tea leaves and boil.\n\n" +
                            "3. Add milk and sugar.\n\n" +
                            "4. Boil for 2–3 minutes.\n\n" +
                            "5. Strain and serve hot."
            );
        }

        else if (food.equals("Green Tea")) {
            imgFood.setImageResource(R.drawable.green_tea);
            txtIngredients.setText(
                    "- Green Tea Leaves/Bag\n" +
                            "- Hot Water\n" +
                            "- Honey (optional)\n" +
                            "- Lemon (optional)"
            );
            txtSteps.setText(
                    "1. Heat water (do not boil).\n\n" +
                            "2. Add green tea bag/leaves.\n\n" +
                            "3. Steep for 2–3 minutes.\n\n" +
                            "4. Remove tea bag.\n\n" +
                            "5. Serve warm."
            );
        }

        else if (food.equals("Lemon Tea")) {
            imgFood.setImageResource(R.drawable.lemon_tea);
            txtIngredients.setText(
                    "- Tea Leaves\n" +
                            "- Water\n" +
                            "- Lemon Juice\n" +
                            "- Sugar/Honey"
            );
            txtSteps.setText(
                    "1. Boil water and add tea leaves.\n\n" +
                            "2. Strain the tea.\n\n" +
                            "3. Add lemon juice and sugar.\n\n" +
                            "4. Mix well.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Coffee")) {
            imgFood.setImageResource(R.drawable.coffee);
            txtIngredients.setText(
                    "- Coffee Powder\n" +
                            "- Hot Milk\n" +
                            "- Sugar"
            );
            txtSteps.setText(
                    "1. Add coffee powder to cup.\n\n" +
                            "2. Add hot water and mix.\n\n" +
                            "3. Add hot milk.\n\n" +
                            "4. Add sugar and stir.\n\n" +
                            "5. Serve hot."
            );
        }

        else if (food.equals("Cappuccino")) {
            imgFood.setImageResource(R.drawable.cappuccino);
            txtIngredients.setText(
                    "- Coffee Powder\n" +
                            "- Hot Milk\n" +
                            "- Milk Foam\n" +
                            "- Sugar"
            );
            txtSteps.setText(
                    "1. Prepare strong coffee.\n\n" +
                            "2. Heat and froth milk.\n\n" +
                            "3. Pour milk over coffee.\n\n" +
                            "4. Add milk foam on top.\n\n" +
                            "5. Serve immediately."
            );
        }

        else if (food.equals("Hot Chocolate")) {
            imgFood.setImageResource(R.drawable.hot_chocolate);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Cocoa Powder\n" +
                            "- Chocolate Syrup\n" +
                            "- Sugar"
            );
            txtSteps.setText(
                    "1. Heat milk on low flame.\n\n" +
                            "2. Add cocoa powder and sugar.\n\n" +
                            "3. Stir continuously.\n\n" +
                            "4. Add chocolate syrup.\n\n" +
                            "5. Serve hot."
            );
        }
        else if (food.equals("Cold Coffee")) {
            imgFood.setImageResource(R.drawable.cold_coffee);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Coffee Powder\n" +
                            "- Sugar\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Take chilled milk.\n\n" +
                            "2. Add coffee powder and sugar.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Blend till frothy.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Iced Tea")) {
            imgFood.setImageResource(R.drawable.iced_tea);
            txtIngredients.setText(
                    "- Tea Powder\n" +
                            "- Water\n" +
                            "- Sugar\n" +
                            "- Lemon\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Boil tea in water.\n\n" +
                            "2. Strain and cool the tea.\n\n" +
                            "3. Add sugar and lemon juice.\n\n" +
                            "4. Add ice cubes.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Lemon Soda")) {
            imgFood.setImageResource(R.drawable.lemon_soda);
            txtIngredients.setText(
                    "- Lemon Juice\n" +
                            "- Soda Water\n" +
                            "- Sugar\n" +
                            "- Salt\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Take a glass with ice.\n\n" +
                            "2. Add lemon juice and sugar.\n\n" +
                            "3. Add salt as required.\n\n" +
                            "4. Pour soda water.\n\n" +
                            "5. Mix and serve immediately."
            );
        }
        else if (food.equals("Coke")) {
            imgFood.setImageResource(R.drawable.coke);
            txtIngredients.setText(
                    "- Coke\n" +
                            "- Ice Cubes\n" +
                            "- Lemon Slice (optional)"
            );
            txtSteps.setText(
                    "1. Take a chilled glass.\n\n" +
                            "2. Add ice cubes.\n\n" +
                            "3. Pour coke slowly.\n\n" +
                            "4. Add lemon slice if needed.\n\n" +
                            "5. Serve cold."
            );
        }

        else if (food.equals("Sprite")) {
            imgFood.setImageResource(R.drawable.sprite);
            txtIngredients.setText(
                    "- Sprite\n" +
                            "- Ice Cubes\n" +
                            "- Lemon Slice (optional)"
            );
            txtSteps.setText(
                    "1. Take a glass with ice cubes.\n\n" +
                            "2. Pour sprite gently.\n\n" +
                            "3. Add lemon slice if required.\n\n" +
                            "4. Stir lightly.\n\n" +
                            "5. Serve chilled."
            );
        }
        else if (food.equals("Orange Juice")) {
            imgFood.setImageResource(R.drawable.orange_juice);
            txtIngredients.setText(
                    "- Fresh Oranges\n" +
                            "- Sugar (optional)\n" +
                            "- Water\n" +
                            "- Ice cubes"
            );
            txtSteps.setText(
                    "1. Peel the oranges.\n\n" +
                            "2. Blend oranges with water.\n\n" +
                            "3. Strain the juice if needed.\n\n" +
                            "4. Add sugar and ice.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Apple Juice")) {
            imgFood.setImageResource(R.drawable.apple_juice);
            txtIngredients.setText(
                    "- Apples\n" +
                            "- Sugar (optional)\n" +
                            "- Water\n" +
                            "- Lemon juice"
            );
            txtSteps.setText(
                    "1. Wash and chop apples.\n\n" +
                            "2. Blend with water.\n\n" +
                            "3. Strain the juice.\n\n" +
                            "4. Add lemon juice.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Mango Juice")) {
            imgFood.setImageResource(R.drawable.mango_juice);
            txtIngredients.setText(
                    "- Ripe Mangoes\n" +
                            "- Sugar\n" +
                            "- Milk or Water\n" +
                            "- Ice cubes"
            );
            txtSteps.setText(
                    "1. Peel and chop mangoes.\n\n" +
                            "2. Blend mango pulp.\n\n" +
                            "3. Add milk or water.\n\n" +
                            "4. Add sugar and ice.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Pineapple Juice")) {
            imgFood.setImageResource(R.drawable.pineapple_juice);
            txtIngredients.setText(
                    "- Pineapple pieces\n" +
                            "- Sugar\n" +
                            "- Water\n" +
                            "- Ice cubes"
            );
            txtSteps.setText(
                    "1. Peel and chop pineapple.\n\n" +
                            "2. Blend with water.\n\n" +
                            "3. Strain if required.\n\n" +
                            "4. Add sugar and ice.\n\n" +
                            "5. Serve cold."
            );
        }

        else if (food.equals("Pomegranate Juice")) {
            imgFood.setImageResource(R.drawable.pomegranate_juice);
            txtIngredients.setText(
                    "- Pomegranate seeds\n" +
                            "- Sugar (optional)\n" +
                            "- Water"
            );
            txtSteps.setText(
                    "1. Remove seeds carefully.\n\n" +
                            "2. Blend seeds lightly.\n\n" +
                            "3. Strain juice.\n\n" +
                            "4. Add sugar if needed.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Watermelon Juice")) {
            imgFood.setImageResource(R.drawable.watermelon_juice);
            txtIngredients.setText(
                    "- Watermelon cubes\n" +
                            "- Black salt\n" +
                            "- Lemon juice\n" +
                            "- Ice cubes"
            );
            txtSteps.setText(
                    "1. Remove seeds from watermelon.\n\n" +
                            "2. Blend watermelon cubes.\n\n" +
                            "3. Add lemon juice and salt.\n\n" +
                            "4. Add ice cubes.\n\n" +
                            "5. Serve chilled."
            );
        }
        else if (food.equals("Chocolate Milkshake")) {
            imgFood.setImageResource(R.drawable.chocolate_milkshake);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Chocolate Syrup\n" +
                            "- Sugar\n" +
                            "- Ice Cream\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Add milk to blender.\n\n" +
                            "2. Add chocolate syrup and sugar.\n\n" +
                            "3. Add ice cream.\n\n" +
                            "4. Blend till smooth.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Strawberry Milkshake")) {
            imgFood.setImageResource(R.drawable.strawberry);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Fresh Strawberries\n" +
                            "- Sugar\n" +
                            "- Ice Cream"
            );
            txtSteps.setText(
                    "1. Wash and chop strawberries.\n\n" +
                            "2. Add milk and strawberries to blender.\n\n" +
                            "3. Add sugar and ice cream.\n\n" +
                            "4. Blend well.\n\n" +
                            "5. Serve cold."
            );
        }

        else if (food.equals("Vanilla Milkshake")) {
            imgFood.setImageResource(R.drawable.vanilla_milkshake);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Vanilla Essence\n" +
                            "- Sugar\n" +
                            "- Vanilla Ice Cream"
            );
            txtSteps.setText(
                    "1. Add milk to blender.\n\n" +
                            "2. Add vanilla essence and sugar.\n\n" +
                            "3. Add ice cream.\n\n" +
                            "4. Blend until creamy.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Mango Milkshake")) {
            imgFood.setImageResource(R.drawable.mango_milkshake);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Ripe Mango Pulp\n" +
                            "- Sugar\n" +
                            "- Ice Cream"
            );
            txtSteps.setText(
                    "1. Peel and chop mangoes.\n\n" +
                            "2. Add mango pulp to blender.\n\n" +
                            "3. Add milk and sugar.\n\n" +
                            "4. Blend till smooth.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Oreo Milkshake")) {
            imgFood.setImageResource(R.drawable.oreo_milkshake);
            txtIngredients.setText(
                    "- Milk\n" +
                            "- Oreo Biscuits\n" +
                            "- Sugar\n" +
                            "- Chocolate Syrup\n" +
                            "- Ice Cream"
            );
            txtSteps.setText(
                    "1. Break Oreo biscuits.\n\n" +
                            "2. Add milk and biscuits to blender.\n\n" +
                            "3. Add sugar and chocolate syrup.\n\n" +
                            "4. Blend till thick.\n\n" +
                            "5. Serve cold."
            );
        }
        else if (food.equals("Banana Smoothie")) {
            imgFood.setImageResource(R.drawable.banana_smoothie);
            txtIngredients.setText(
                    "- Banana\n" +
                            "- Milk\n" +
                            "- Honey / Sugar\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Peel and chop bananas.\n\n" +
                            "2. Add banana, milk and honey in blender.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Blend till smooth.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Berry Smoothie")) {
            imgFood.setImageResource(R.drawable.berry_smoothie);
            txtIngredients.setText(
                    "- Mixed Berries\n" +
                            "- Milk / Yogurt\n" +
                            "- Honey\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Wash berries properly.\n\n" +
                            "2. Add berries, yogurt and honey in blender.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Blend until creamy.\n\n" +
                            "5. Serve fresh."
            );
        }

        else if (food.equals("Mango Smoothie")) {
            imgFood.setImageResource(R.drawable.mango_smoothie);
            txtIngredients.setText(
                    "- Ripe Mango\n" +
                            "- Milk\n" +
                            "- Sugar / Honey\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Peel and cut mangoes.\n\n" +
                            "2. Add mango, milk and sugar in blender.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Blend until smooth.\n\n" +
                            "5. Serve chilled."
            );
        }

        else if (food.equals("Strawberry Smoothie")) {
            imgFood.setImageResource(R.drawable.strawberry_smoothie);
            txtIngredients.setText(
                    "- Strawberries\n" +
                            "- Milk / Yogurt\n" +
                            "- Honey\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Wash and chop strawberries.\n\n" +
                            "2. Add strawberries, milk and honey.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Blend till smooth.\n\n" +
                            "5. Serve cold."
            );
        }

        else if (food.equals("Green Smoothie")) {
            imgFood.setImageResource(R.drawable.green_smoothie);
            txtIngredients.setText(
                    "- Spinach\n" +
                            "- Banana\n" +
                            "- Apple\n" +
                            "- Water / Coconut Water"
            );
            txtSteps.setText(
                    "1. Wash spinach leaves properly.\n\n" +
                            "2. Chop fruits.\n\n" +
                            "3. Add all ingredients in blender.\n\n" +
                            "4. Blend until smooth.\n\n" +
                            "5. Serve fresh."
            );
        }
        else if (food.equals("Mojito")) {
            imgFood.setImageResource(R.drawable.mojito);
            txtIngredients.setText(
                    "- Mint Leaves\n" +
                            "- Lemon Juice\n" +
                            "- Sugar Syrup\n" +
                            "- Soda Water\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Crush mint leaves with lemon juice.\n\n" +
                            "2. Add sugar syrup and mix well.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Pour soda water.\n\n" +
                            "5. Stir gently and serve chilled."
            );
        }

        else if (food.equals("Virgin Mojito")) {
            imgFood.setImageResource(R.drawable.virgin_mojito);
            txtIngredients.setText(
                    "- Mint Leaves\n" +
                            "- Lemon Juice\n" +
                            "- Sugar Syrup\n" +
                            "- Soda Water\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Crush mint and lemon together.\n\n" +
                            "2. Add sugar syrup.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Pour soda water.\n\n" +
                            "5. Mix and serve fresh."
            );
        }

        else if (food.equals("Blue Lagoon")) {
            imgFood.setImageResource(R.drawable.blue_lagoon);
            txtIngredients.setText(
                    "- Blue Curacao Syrup\n" +
                            "- Lemon Juice\n" +
                            "- Soda / Sprite\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Add ice cubes to glass.\n\n" +
                            "2. Pour blue curacao syrup.\n\n" +
                            "3. Add lemon juice.\n\n" +
                            "4. Top with soda or sprite.\n\n" +
                            "5. Stir and serve chilled."
            );
        }

        else if (food.equals("Fruit Punch")) {
            imgFood.setImageResource(R.drawable.fruit_punch);
            txtIngredients.setText(
                    "- Mixed Fruit Juice\n" +
                            "- Orange Juice\n" +
                            "- Lemon Juice\n" +
                            "- Sugar Syrup\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Mix all fruit juices.\n\n" +
                            "2. Add lemon juice.\n\n" +
                            "3. Add sugar syrup.\n\n" +
                            "4. Add ice cubes.\n\n" +
                            "5. Stir well and serve cold."
            );
        }

        else if (food.equals("Lemon Mint Cooler")) {
            imgFood.setImageResource(R.drawable.lemon_mint);
            txtIngredients.setText(
                    "- Lemon Juice\n" +
                            "- Mint Leaves\n" +
                            "- Sugar Syrup\n" +
                            "- Cold Water / Soda\n" +
                            "- Ice Cubes"
            );
            txtSteps.setText(
                    "1. Crush mint leaves lightly.\n\n" +
                            "2. Add lemon juice and sugar syrup.\n\n" +
                            "3. Add ice cubes.\n\n" +
                            "4. Pour cold water or soda.\n\n" +
                            "5. Mix well and serve chilled."
            );
        }

        // CHECK already favorite

        isFav = FavoriteManager.isFav(this, food);
        updateFavIcon();

        // Favorite click (PERMANENT)

        imgFav.setOnClickListener(v -> {
            isFav = !isFav;

            if (isFav) {
                FavoriteManager.addFav(this, food);
                Toast.makeText(this, "Added to Favorites", Toast.LENGTH_SHORT).show();
            } else {
                FavoriteManager.removeFav(this, food);
                Toast.makeText(this, "Removed from Favorites", Toast.LENGTH_SHORT).show();
            }

            updateFavIcon();
        });
    }

    // -------------------------
    // Update heart icon
    // -------------------------
    private void updateFavIcon() {
        if (isFav) {
            imgFav.setImageResource(R.drawable.baseline_favorite_24);
        } else {
            imgFav.setImageResource(R.drawable.baseline_favorite_border_24);
        }
    }
}
