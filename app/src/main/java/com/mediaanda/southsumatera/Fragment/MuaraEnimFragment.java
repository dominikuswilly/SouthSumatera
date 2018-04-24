package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewMuaraEnimAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

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
        listDestination.add(new Destination("Gemuhak Hot Springs", getResources().getString(R.string.deskripsi_gemuhak_hotsprings), R.mipmap.gemuhak));
        listDestination.add(new Destination("Napal Carik Waterfall", getResources().getString(R.string.deskripsi_napal_carik), R.mipmap.napal_carik));
        listDestination.add(new Destination("Bedegung Rafting", getResources().getString(R.string.deskripsi_bedegung_rafting), R.mipmap.bedegung_rafting));
    }

    private void initializeAdapter(){
        CardViewMuaraEnimAdapter adapter = new CardViewMuaraEnimAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
