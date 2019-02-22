package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.radisson), 4.5f,
                getString(R.string.radisson_address),
                getString(R.string.radisson_contact), getString(R.string.radisson_web),
                getString(R.string.radisson_details), R.drawable.radisson_blu_hotel_indore));
        places.add(new Place(getString(R.string.lemon_tree), 3.9f,
                getString(R.string.lemon_tree_address),
                getString(R.string.lemon_tree_contact), getString(R.string.lemon_tree_web),
                getString(R.string.lemon_tree_details), R.drawable.lemon_tree_hotel));
        places.add(new Place(getString(R.string.daksh), 4.4f,
                getString(R.string.daksh_address),
                getString(R.string.daksh_contact), getString(R.string.daksh_web),
                getString(R.string.daksh_details), R.drawable.treebo_daksh_residency));
        places.add(new Place(getString(R.string.effotel), 4.4f,
                getString(R.string.effotel_address),
                getString(R.string.effotel_contact), getString(R.string.effotel_web),
                getString(R.string.effotel_details), R.drawable.effotel_hotel));
        places.add(new Place(getString(R.string.ginger_hotel), 3.8f,
                getString(R.string.ginger_hotel_address),
                getString(R.string.ginger_hotel_contact), getString(R.string.ginger_hotel_web),
                getString(R.string.ginger_hotel_details), R.drawable.ginger_hotel));
        places.add(new Place(getString(R.string.hotel_president), 3.9f,
                getString(R.string.hotel_president_address),
                getString(R.string.hotel_president_contact), getString(R.string.hotel_president_web),
                getString(R.string.hotel_president_details), R.drawable.hotel_president));
        places.add(new Place(getString(R.string.sayaji), 4.5f,
                getString(R.string.sayaji_address),
                getString(R.string.sayaji_contact), getString(R.string.sayaji_web),
                getString(R.string.sayaji_details), R.drawable.sayaji_hotel));
        places.add(new Place(getString(R.string.marriott), 4.4f,
                getString(R.string.marriott_address),
                getString(R.string.marriott_contact), getString(R.string.marriott_web),
                getString(R.string.marriott_details), R.drawable.marriott_hotel));
        places.add(new Place(getString(R.string.apna_palace), 3.8f,
                getString(R.string.apna_palace_address),
                getString(R.string.apna_palace_contact), getString(R.string.apna_palace_web),
                getString(R.string.apna_palace_details), R.drawable.hotel_apna_palace));
        places.add(new Place(getString(R.string.best_western), 4.1f,
                getString(R.string.best_western_address),
                getString(R.string.best_address_contact), getString(R.string.best_western_web),
                getString(R.string.best_western_details), R.drawable.best_western_plus_o2));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
