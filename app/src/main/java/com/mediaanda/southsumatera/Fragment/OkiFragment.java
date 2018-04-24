package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewOkiAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OkiFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewOkiAdapter mCardDestinationAdapter;

    public OkiFragment() {
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

        getActivity().setTitle("Ogan Komering Ilir");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Teluk Gelam Lake", getResources().getString(R.string.deskripsi_teluk_gelam), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Maspari Island", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Kayuagung", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Bukit Batu", "No Description", R.drawable.logo_south_sumatera));


    }

    private void initializeAdapter(){
        CardViewOkiAdapter adapter = new CardViewOkiAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
