package com.example.feedbackform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*; // Import Button class

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect with UI Widget RateBarFeedback, TVRating, ETFeedback, BTNFeedback
        RatingBar RateBarFeedback = findViewById(R.id.RateBarFeedback);
        TextView TVRating = findViewById(R.id.TVRating);
        EditText ETFeedback = findViewById(R.id.ETFeedback);
        Button BtnFeedback = findViewById(R.id.BtnFeedback);

        //The button OnClickListener to toast a message and share the cashback code is user has entered the feedback
        BtnFeedback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String message = "Thank you for your feedback";
                if(!ETFeedback.getText().toString().isEmpty())
                    message = message + "Please enjoy your RM5 Cashback: ABC123";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        //The rating bar OnRatingBarChangeListener to change the rating whenever it is used by user
        RateBarFeedback.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){
                TVRating.setText("You have rated " + rating);
            }
        });


    }
}


