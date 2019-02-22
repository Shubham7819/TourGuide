package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HeritageFragment extends Fragment {


    public HeritageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.rajwada), getString(R.string.rajwada_address),
                getString(R.string.rajwada_webaddress),
                getString(R.string.rajwada_details)
                , R.drawable.rajwada));
        places.add(new Place(getString(R.string.lalbagh), getString(R.string.lalbagh_address)
                , "", getString(R.string.lalbagh_details)
                , R.drawable.lal_bagh_palace));
        places.add(new Place(getString(R.string.museum), getString(R.string.museum_address)
                , "", getString(R.string.museum_details)
                , R.drawable.indore_museum));
        places.add(new Place(getString(R.string.zoo), getString(R.string.zoo_address)
                , "", getString(R.string.zoo_details)
                , R.drawable.kamla_nehru_prani_sangrahalay));
        places.add(new Place(getString(R.string.khajrana), getString(R.string.khajrana_address)
                , "", getString(R.string.khajrana_details)
                , R.drawable.khajrana_ganesh_temple));
        places.add(new Place(getString(R.string.annapurna), getString(R.string.annapurna_address)
                , "", getString(R.string.annapurna_details)
                , R.drawable.annapurna_temple));
        places.add(new Place(getString(R.string.bijasan), getString(R.string.bijasan_address)
                , "", getString(R.string.bijasan_details)
                , R.drawable.bijasan_mata_temple_indore));
        places.add(new Place(getString(R.string.gandhi_hall), getString(R.string.gandhi_hall_address)
                , "", getString(R.string.gandhi_hall_details)
                , R.drawable.gandhi_hall));
        places.add(new Place(getString(R.string.chhatri), getString(R.string.chhatri_address)
                , "", getString(R.string.chhatri_details)
                , R.drawable.krishna_pura_chhatri));
        places.add(new Place(getString(R.string.gommatagiri), getString(R.string.gommatagiri_address)
                , "", getString(R.string.gommatagiri_details)
                , R.drawable.gommatagiri_digambar_jain_temple));
        places.add(new Place(getString(R.string.white_church), getString(R.string.white_church_address),
                "", "", R.drawable.white_church_indore));
        places.add(new Place(getString(R.string.ranjeet_hanuman), getString(R.string.ranjeet_hanuman_address)
                , "", "", R.drawable.shri_ranjeet_hanuman_mandir));
        places.add(new Place(getString(R.string.devguradia), getString(R.string.devguradia_address)
                , "", "", R.drawable.devguradia_temple));
        places.add(new Place(getString(R.string.gopal_mandir), getString(R.string.gopal_mandir_address)
                , "", "", R.drawable.gopal_mandir));
        places.add(new Place(getString(R.string.harsiddhi), getString(R.string.harsiddhi_address)
                , "", "", R.drawable.harsiddhi_mata_temple));
        places.add(new Place(getString(R.string.kanch_mandir), getString(R.string.kanch_mandir_address)
                , "", "", R.drawable.kanch_mandir));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
