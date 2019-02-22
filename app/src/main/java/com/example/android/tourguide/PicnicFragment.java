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
public class PicnicFragment extends Fragment {


    public PicnicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.patalpani), getString(R.string.patalpani_address),
                getString(R.string.patalpani_details)
                , R.drawable.patalpani_waterfall, getString(R.string.patalpani_timings)));
        places.add(new Place(getString(R.string.regional_park), "",
                getString(R.string.regional_park_details)
                , R.drawable.pipliyapala_regional_park, getString(R.string.regional_park_timings)));
        places.add(new Place(getString(R.string.ahilya_fort), "",
                getString(R.string.ahilya_fort_details)
                , R.drawable.ahilya_fort__maheshwar, getString(R.string.ahilya_fort_timings)));
        places.add(new Place(getString(R.string.gomatgiri), "",
                getString(R.string.gomatgiri_details)
                , R.drawable.gomatgiri, getString(R.string.gomatgiri_timings)));
        places.add(new Place(getString(R.string.tincha_fall), "",
                getString(R.string.tincha_fall_details)
                , R.drawable.tincha_fall, getString(R.string._24hrs)));
        places.add(new Place(getString(R.string.janapav), "",
                getString(R.string.janapav_details)
                , R.drawable.janapav, getString(R.string._24hrs)));
        places.add(new Place(getString(R.string.knps), "",
                getString(R.string.knps_details)
                , R.drawable.kamla_nehru_prani_sangrahalay1, getString(R.string.knps_timings)));
        places.add(new Place(getString(R.string.choral_dam), "",
                getString(R.string.choral_dam_details)
                , R.drawable.choral_dam, ""));
        places.add(new Place(getString(R.string.mohadi_falls), "",
                getString(R.string.mohadi_falls_details)
                , R.drawable.mohadi_falls, getString(R.string._24hrs)));
        places.add(new Place(getString(R.string.bamniya_kund), "",
                getString(R.string.bamniya_kund_details)
                , R.drawable.bamniya_kund, getString(R.string._24hrs)));
        places.add(new Place(getString(R.string.meghdoot), "",
                getString(R.string.meghdoot_details)
                , R.drawable.meghdoot_upvan, getString(R.string.meghdoot_timings)));
        places.add(new Place(getString(R.string.tafreeh), "",
                getString(R.string.tafreeh_details)
                , R.drawable.tafreeh_agro_park, getString(R.string.tafreeh_timings)));
        places.add(new Place(getString(R.string.hatyari_khoh), "",
                getString(R.string.hatyari_khoh_details)
                , R.drawable.hatyari_khoh, getString(R.string.hatyari_khoh_timings)));
        places.add(new Place(getString(R.string.sitlamata_falls), "",
                getString(R.string.sitlamata_falls_details)
                , R.drawable.sitlamata_falls, getString(R.string._24hrs)));
        places.add(new Place(getString(R.string.sirpur_lake), "",
                getString(R.string.sirpur_lake_details)
                , R.drawable.sirpur_lake, getString(R.string.sirpur_lake_timings)));
        places.add(new Place(getString(R.string.ralamandal), "",
                getString(R.string.ralamandal_details)
                , R.drawable.ralamandal_wildlife_sanctuary, getString(R.string.ralamandal_timings)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
