package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewLubukLinggauAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LubuklinggauFragment extends Fragment {
    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewLubukLinggauAdapter mCardDestinationAdapter;

    public LubuklinggauFragment() {
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

        getActivity().setTitle("Lubuklinggau");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Temam Waterfall", getResources().getString(R.string.deskripsi_temam_waterfall), R.mipmap.temam_waterfall));
        listDestination.add(new Destination("Magic Hill", getResources().getString(R.string.deskripsi_magic_hill), R.mipmap.bukit_sulap));
        listDestination.add(new Destination("Water Vang", getResources().getString(R.string.deskripsi_water_vang), R.mipmap.watervang));
    }

    private void initializeAdapter(){
        CardViewLubukLinggauAdapter adapter = new CardViewLubukLinggauAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
