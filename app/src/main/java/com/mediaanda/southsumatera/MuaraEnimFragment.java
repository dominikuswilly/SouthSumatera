package com.mediaanda.southsumatera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewMuaraEnimAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuaraEnimFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewMuaraEnimAdapter mCardDestinationAdapter;

    public MuaraEnimFragment() {
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

        getActivity().setTitle("Muara Enim");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Bedegung Waterfall", getResources().getString(R.string.deskripsi_bedegun_waterfall), R.mipmap.bedegung_waterfall));

    }

    private void initializeAdapter(){
        CardViewMuaraEnimAdapter adapter = new CardViewMuaraEnimAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
