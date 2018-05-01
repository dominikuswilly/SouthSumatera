package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewLahatAdapter;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LahatFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewLahatAdapter mCardBanyuasinAdapter;


    public LahatFragment() {
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

        getActivity().setTitle("Lahat");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Serelo Hill", getResources().getString(R.string.deskripsi_serelo_hill), R.mipmap.bukit_selero));
        listDestination.add(new Destination("Maung Waterfall", getResources().getString(R.string.deskripsi_maung_waterfall), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Bidadari Waterfall", getResources().getString(R.string.deskripsi_bidadari_waterfall), R.mipmap.bidadari_waterfall));
        listDestination.add(new Destination("Santo Mikael Church", getResources().getString(R.string.deskripsi_santo_mikael_church), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Megalith Sites", getResources().getString(R.string.deskripsi_megalith_sites_lahat), R.mipmap.megalith_sites));

    }

    private void initializeAdapter(){
        CardViewLahatAdapter adapter = new CardViewLahatAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
