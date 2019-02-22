package com.example.android.tourguide;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        FloatingActionButton button = findViewById(R.id.fab);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayListActivity.class);
                startActivity(intent);
            }
        });

        Place indore = new Place(getString(R.string.indore), getString(R.string.madhya_pradesh),
                getString(R.string.india), getString(R.string.indore_details)
                , R.drawable.indore_image);

        TextView placeName = findViewById(R.id.place_name);
        placeName.setText(indore.getPlaceName());

        TextView physicalAddress = findViewById(R.id.Physical_address);
        physicalAddress.setText(indore.getPhysicalAddress());

        TextView webAddress = findViewById(R.id.web_address);
        webAddress.setText(indore.getWebAddress());

        TextView otherDetails = findViewById(R.id.other_details);
        otherDetails.setText(indore.getOtherDetails());
    }
}
