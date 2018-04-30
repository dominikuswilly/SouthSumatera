package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewOkuTimurAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OkutFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewOkuTimurAdapter mCardDestinationAdapter;

    public OkutFragment() {
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

        getActivity().setTitle("OKU Timur");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Martapura Town", getResources().getString(R.string.deskripsi_martapura_town), R.mipmap.martapura_town));
        listDestination.add(new Destination("Komering River", getResources().getString(R.string.deskripsi_komering_river), R.mipmap.komering_river));
        listDestination.add(new Destination("Datuk Lake", getResources().getString(R.string.deskripsi_datuk_lake), R.drawable.logo_south_sumatera));
    }

    private void initializeAdapter(){
        CardViewOkuTimurAdapter adapter = new CardViewOkuTimurAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
