package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewMusiBanyuasinAdapter;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusibanyuasinFragment extends Fragment {
    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewMusiBanyuasinAdapter mCardDestinationAdapter;

    public MusibanyuasinFragment() {
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

        getActivity().setTitle(" Musi Banyuasin");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Konger Lake", getResources().getString(R.string.deskripsi_konger_lake), R.mipmap.konger_lake));
        listDestination.add(new Destination("Sekayu Waterfront Park", getResources().getString(R.string.deskripsi_sekayu_waterfront_park), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Ulak Lia Lake", getResources().getString(R.string.deskripsi_ulak_lia_lake), R.mipmap.ulak_lia));
        listDestination.add(new Destination("Rakit House", getResources().getString(R.string.deskripsi_rakit_house), R.mipmap.rumah_panggung));

    }

    private void initializeAdapter(){
        CardViewMusiBanyuasinAdapter adapter = new CardViewMusiBanyuasinAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
