package com.mediaanda.southsumatera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewOkuSelatanAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OkusFragment extends Fragment {
    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewOkuSelatanAdapter mCardDestinationAdapter;

    public OkusFragment() {
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

        getActivity().setTitle("Oku Selatan");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        //listDestination.add(new Destination("Sembilang National Park", getResources().getString(R.string.deskripsi_sembilang_national_park), R.mipmap.sembilang));

    }

    private void initializeAdapter(){
        CardViewOkuSelatanAdapter adapter = new CardViewOkuSelatanAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
