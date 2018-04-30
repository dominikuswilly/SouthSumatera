package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewOkuAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OkuFragment extends Fragment {
    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewOkuAdapter mCardDestinationAdapter;

    public OkuFragment() {
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

        getActivity().setTitle("Ogan Komering Ulu");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Princess Cave", getResources().getString(R.string.deskripsi_putri_cave), R.mipmap.putri_cave));
        listDestination.add(new Destination("Tiger Cave", getResources().getString(R.string.deskripsi_harimau_cave), R.mipmap.harimau_cave));
        listDestination.add(new Destination("Tembulun Waterfall", getResources().getString(R.string.deskripsi_tembulun_waterfall), R.mipmap.tembulun_waterfall));
        listDestination.add(new Destination("Kambas Waterfall", getResources().getString(R.string.deskripsi_kambas_waterfall), R.mipmap.kambas_waterfall));

    }

    private void initializeAdapter(){
        CardViewOkuAdapter adapter = new CardViewOkuAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
