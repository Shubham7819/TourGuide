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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.poha_jalebi), getString(R.string.chappan), "",
                getString(R.string.poha_jalebi_details),
                R.drawable.poha_jalebi));
        places.add(new Place(getString(R.string.dal_bafle), getString(R.string.sarafa), "",
                getString(R.string.dal_bafle_details),
                R.drawable.dal_bafle));
        places.add(new Place(getString(R.string.butta_kees), getString(R.string.bhutta_kees_address), "",
                getString(R.string.bhutta_kees_details),
                R.drawable.bhutte_ka_kees));
        places.add(new Place(getString(R.string.kachori), getString(R.string.chappan), "",
                getString(R.string.kachori_details),
                R.drawable.indori_kachori));
        places.add(new Place(getString(R.string.khichdi), getString(R.string.sarafa), "",
                getString(R.string.khichdi_details),
                R.drawable.sabudana_khichdi));
        places.add(new Place(getString(R.string.dahi_vadas), getString(R.string.sarafa), "",
                getString(R.string.dahi_vadas_details),
                R.drawable.dahi_vadas));
        places.add(new Place(getString(R.string.patties), getString(R.string.chappan), "",
                getString(R.string.patties_details),
                R.drawable.khopra_patties));
        places.add(new Place(getString(R.string.garadu), getString(R.string.sarafa), "",
                getString(R.string.garadu_details),
                R.drawable.fried_garadu));
        places.add(new Place(getString(R.string.bhajiyas), getString(R.string.sarafa), "",
                getString(R.string.bhajiyas_details),
                R.drawable.moong_dal_bhajiyas));
        places.add(new Place(getString(R.string.namkeens), getString(R.string.chappan), "",
                getString(R.string.namkeens_details),
                R.drawable.indori_namkeens));
        places.add(new Place(getString(R.string.tikki), getString(R.string.chappan), "",
                getString(R.string.tikki_details),
                R.drawable.aloo_tikki));
        places.add(new Place(getString(R.string.chaat), getString(R.string.chappan), "",
                getString(R.string.chaat_details),
                R.drawable.papdi_chat));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
