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
        listDestination.add(new Destination("Al-Qur\'an Al-Akbar", "Keterangan Al-Qur\'an Al-Akbar", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Jakabaring Sport City", "Keterangan JSC", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Water Tower", "Keterangan Water Tower", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Siguntang Hill", "Keterangan Siguntang Hill", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Kambang Iwak", "Keterangan Kambang Iwak", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Kapitan Village", "Keterangan Kapitan Village", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Al-Munawwar Village", "Keterangan Al-Munawwar Village", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Kawah Tengkurep", "Keterangan Kawah Tengkurep", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Agung Mosque", "Keterangan Agung Mosque", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Monpera", "Keterangan Monpera", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("SMB II Museum", "Keterangan SMB II Museum", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Balaputeradewa Museum", "Keterangan Balaputeradewa Museum", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Sriwijaya Kingdom Archeological Park", "Keterangan Sriwijaya Kingdom Archeological Park", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Kemaro Island", "Keterangan Kemaro Island", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("16 Ilir Market", "Keterangan 16 Ilir Market", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Songket Craft Center", "Keterangan Songket Craft Center", R.mipmap.ic_menu_airport));

    }

    private void initializeAdapter(){
        CardViewPalembangAdapter adapter = new CardViewPalembangAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
