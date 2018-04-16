package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewPalembangAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.MainActivity;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PalembangFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewPalembangAdapter mCardDestinationAdapter;

    public PalembangFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_destination, container, false);

        rvDestination = (RecyclerView) view.findViewById(R.id.rv_destination);
        rvDestination.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvDestination.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

        getActivity().setTitle("Palembang");
        return view;
    }


    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Ampera Bridge", getResources().getString(R.string.deskripsi_ampera), R.mipmap.ampera_bridge));
        listDestination.add(new Destination("Al-Qur\'an Al-Akbar", getResources().getString(R.string.deskripsi_quran_alakbar), R.mipmap.quran_al_akbar));
        listDestination.add(new Destination("Jakabaring Sport City", getResources().getString(R.string.deskripsi_jakabaring), R.mipmap.jakabaring));
        listDestination.add(new Destination("Water Tower", getResources().getString(R.string.deskripsi_water_tower), R.mipmap.kantor_ledeng));
        listDestination.add(new Destination("Siguntang Hill", getResources().getString(R.string.deskripsi_siguntang) , R.mipmap.bukit_siguntang));
        listDestination.add(new Destination("Kambang Iwak", getResources().getString(R.string.deskripsi_kambang_iwak), R.mipmap.kambang_iwak));
        listDestination.add(new Destination("Kapitan Village", getResources().getString(R.string.deskripsi_kapitan_village), R.mipmap.kampung_kapitan));
        listDestination.add(new Destination("Al-Munawwar Village", getResources().getString(R.string.deskripsi_almunawar), R.mipmap.kampung_arab));
        listDestination.add(new Destination("Kawah Tengkurep", getResources().getString(R.string.deskripsi_kawah_tengkurep), R.mipmap.kawah_tengkurep));
        listDestination.add(new Destination("Agung Mosque", getResources().getString(R.string.deskripsi_masjid_agung), R.mipmap.masjid_agung));
        listDestination.add(new Destination("Monpera", getResources().getString(R.string.deskripsi_monpera), R.mipmap.monpera));
        listDestination.add(new Destination("SMB II Museum", getResources().getString(R.string.deskripsi_smbii_museum), R.mipmap.smbii_museum));
        listDestination.add(new Destination("Balaputeradewa Museum", getResources().getString(R.string.deskripsi_balaputeradewa_museum), R.mipmap.balaputra_dewa));
        listDestination.add(new Destination("Sriwijaya Kingdom Archeological Park", getResources().getString(R.string.deskripsi_sriwijaya_kingdom_archeological_park), R.mipmap.taman_budaya));
        listDestination.add(new Destination("Kemaro Island", getResources().getString(R.string.deskripsi_kemaro_island), R.mipmap.kemaro_island));
        listDestination.add(new Destination("16 Ilir Market", getResources().getString(R.string.deskripsi_16_ilir_market), R.mipmap.pasar16_ilir));
        listDestination.add(new Destination("Songket Craft Center", getResources().getString(R.string.deskripsi_songket_crafter), R.mipmap.songket_crafter));

    }

    private void initializeAdapter(){
        CardViewPalembangAdapter adapter = new CardViewPalembangAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
