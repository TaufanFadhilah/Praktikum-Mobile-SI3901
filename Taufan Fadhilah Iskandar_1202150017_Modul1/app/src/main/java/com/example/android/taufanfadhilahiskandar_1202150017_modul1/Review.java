package com.example.android.taufanfadhilahiskandar_1202150017_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Review extends AppCompatActivity {
    private TextView tvPlace, tvFood, tvPortion,tvPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        tvPlace = (TextView)findViewById(R.id.tv_place);
        tvFood = (TextView)findViewById(R.id.tv_food);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvPrice = (TextView)findViewById(R.id.tv_price);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        tvPlace.setText(extras.getString("Place"));
        tvFood.setText(extras.getString("Food"));
        tvPortion.setText(extras.getString("Portion"));
        tvPrice.setText("Rp. "+String.valueOf(extras.getInt("Price")));
        Toast toast = toast = Toast.makeText(getApplicationContext(), "Disini aja makannya", Toast.LENGTH_SHORT);;
        if (extras.getInt("Price") > 65000){
            toast = Toast.makeText(getApplicationContext(), "Jangan makan disini, terlalu mahal", Toast.LENGTH_SHORT);
        }
        toast.show();
    }

}
