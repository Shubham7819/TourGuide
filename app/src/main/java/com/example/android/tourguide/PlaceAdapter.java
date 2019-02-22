package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        ImageView cardImageView = (ImageView) convertView.findViewById(R.id.card_image);
        cardImageView.setImageResource(currentPlace.getImageResourceId());

        TextView placeNameTV = (TextView) convertView.findViewById(R.id.place_name);
        placeNameTV.setText(currentPlace.getPlaceName());

        RatingBar ratingBar = (RatingBar) convertView.findViewById(R.id.rating);
        if (currentPlace.hasRating()) {
            ratingBar.setRating(currentPlace.getRating());
            // Make sure the view is visible
            ratingBar.setVisibility(View.VISIBLE);
        } else {
            ratingBar.setVisibility(View.GONE);
        }


        TextView addressTV = (TextView) convertView.findViewById(R.id.address);
        addressTV.setText(currentPlace.getPhysicalAddress());

        return convertView;
    }
}
