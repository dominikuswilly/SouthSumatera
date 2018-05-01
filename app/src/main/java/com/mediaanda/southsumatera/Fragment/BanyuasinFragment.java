package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewBanyuasinAdapter;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BanyuasinFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewBanyuasinAdapter mCardDestinationAdapter;

    public BanyuasinFragment() {
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

        getActivity().setTitle("Banyuasin");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Sembilang National Park", getResources().getString(R.string.deskripsi_sembilang_national_park), R.mipmap.sembilang));

    }

    private void initializeAdapter(){
        CardViewBanyuasinAdapter adapter = new CardViewBanyuasinAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
