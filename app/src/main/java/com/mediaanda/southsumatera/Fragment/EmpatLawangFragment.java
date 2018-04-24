package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewBanyuasinAdapter;
import com.mediaanda.southsumatera.Adapter.CardViewEmpatLawangAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmpatLawangFragment extends Fragment {


    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewEmpatLawangAdapter mCardDestinationAdapter;

    public EmpatLawangFragment() {
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

        getActivity().setTitle("Empat Lawang");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Tujuh Panggung Waterfall", getResources().getString(R.string.deskripsi_tujuh_panggung_waterfall), R.mipmap.tujuh_panggung));
        listDestination.add(new Destination("Batu Betang Waterfall", getResources().getString(R.string.deskripsi_batu_betang_waterfall), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Lubuk Tudung", getResources().getString(R.string.deskripsi_lubuk_tudung), R.mipmap.lubuk_tudung ));
        listDestination.add(new Destination("Rafting Empat Lawang", getResources().getString(R.string.deskripsi_rafting), R.mipmap.rafting));
    }

    private void initializeAdapter(){
        CardViewEmpatLawangAdapter adapter = new CardViewEmpatLawangAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
