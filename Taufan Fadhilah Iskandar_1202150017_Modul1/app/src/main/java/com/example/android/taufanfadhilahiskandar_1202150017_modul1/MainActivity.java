package com.example.android.taufanfadhilahiskandar_1202150017_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etFood, etPortion;
    private Intent intent;
    private int portion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText)findViewById(R.id.et_food);
        etPortion = (EditText)findViewById(R.id.et_portion);
        intent = new Intent(this, Review.class);
    }

    private void getLayoutText(){
        intent.putExtra("Food", etFood.getText().toString());
        intent.putExtra("Portion", etPortion.getText().toString());
        portion = Integer.parseInt(etPortion.getText().toString());
    }

    public void onAbnormalClicked(View view) {
        getLayoutText();
        intent.putExtra("Place", "Abnormal");
        intent.putExtra("Price",(30000 * portion));
        startActivity(intent);
    }

    public void onEatbusClicked(View view) {
        getLayoutText();
        intent.putExtra("Place", "Eatbus");
        intent.putExtra("Price",(50000 * portion));
        startActivity(intent);
    }
}
