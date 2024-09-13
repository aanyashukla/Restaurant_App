package com.aanyashukla.restaurantapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView starterscard;
    CardView mainscard;
    CardView dessertcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterscard = findViewById(R.id.card_view_starters);
        mainscard = findViewById(R.id.card_view_main);
        dessertcard = findViewById(R.id.card_view_dessert);

        starterscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this , StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this ,MainCourseActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydeveloper@aanyashukla.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        dessertcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertActivityIntent = new Intent(MainActivity.this , DessertsActivity.class);

                startActivity(dessertActivityIntent);
            }
        });
        }
    }
