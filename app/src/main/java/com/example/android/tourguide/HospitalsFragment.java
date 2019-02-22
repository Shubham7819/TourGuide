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
public class HospitalsFragment extends Fragment {


    public HospitalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.greater_kailash), 3.2f,
                getString(R.string.greater_kailash_address),
                getString(R.string.greater_kailash_contact), getString(R.string.greater_kailash_web),
                getString(R.string.greater_kailash_details),
                R.drawable.greater_kailash_hospital));

        places.add(new Place(getString(R.string.macretina), 5.0f,
                getString(R.string.macretina_address),
                getString(R.string.macretina_contact), getString(R.string.macretina_web),
                getString(R.string.macretina_details),
                R.drawable.macretina_hospital));

        places.add(new Place(getString(R.string.bombay_hospital), 3.5f, getString(R.string.bomday_hospital_address),
                getString(R.string.bombay_hospital_contact), getString(R.string.bombay_hospital_web),
                getString(R.string.bombay_hospital_details), R.drawable.bombay_hospital));

        places.add(new Place(getString(R.string.chl), 3.5f, getString(R.string.chl_address),
                getString(R.string.chl_contact), getString(R.string.chl_web),
                getString(R.string.chl_details), R.drawable.chl_hospital_indore));

        places.add(new Place(getString(R.string.shalby), 4.2f, getString(R.string.shalby_address),
                getString(R.string.shalby_contact), getString(R.string.shalby_web),
                getString(R.string.shalby_details), R.drawable.shalby_hospital__indore));

        places.add(new Place(getString(R.string.apollo_hospital), 3.1f, getString(R.string.apollo_hospital_address),
                getString(R.string.apollo_hospital_contact), getString(R.string.apollo_hospital_web),
                getString(R.string.apollo_hospital_details), R.drawable.apollo_hospitals));

        places.add(new Place(getString(R.string.bapat_hospital), 3.3f, getString(R.string.bapat_hospital_address),
                getString(R.string.bapat_hostpital_contact), "",
                getString(R.string.bapat_hospital_details), R.drawable.bapat_hospital));

        places.add(new Place(getString(R.string.gokuldas_hospital), 2.9f, getString(R.string.gokuldas_hospital_address),
                getString(R.string.gokuldas_hospital_contact), getString(R.string.gokuldas_hospital_web),
                getString(R.string.gokuldas_hospital_details), R.drawable.gokuldas_hospital_indore));

        places.add(new Place(getString(R.string.bhandari_hospital), 3.5f, getString(R.string.bhandari_hospital_address),
                getString(R.string.bhandari_hospital_contact), getString(R.string.bhandari_hospital_web),
                getString(R.string.bhandari_hospital_details), R.drawable.bhandari_hospital_and_research_centre));

        places.add(new Place(getString(R.string.life_care), 3.8f, getString(R.string.life_care_address),
                getString(R.string.life_care_contact), getString(R.string.life_care_web),
                getString(R.string.life_care_details), R.drawable.life_care_hospital));

        places.add(new Place(getString(R.string.choithram), 3.3f, getString(R.string.choithram_address),
                getString(R.string.choithram_contact), getString(R.string.choithram_web),
                getString(R.string.choithram_details), R.drawable.choithram_hospital_and_research_centre));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
