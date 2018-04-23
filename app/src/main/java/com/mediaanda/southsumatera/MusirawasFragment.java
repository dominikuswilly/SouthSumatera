package com.mediaanda.southsumatera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewMusiRawasAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusirawasFragment extends Fragment {
    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewMusiRawasAdapter mCardDestinationAdapter;

    public MusirawasFragment() {
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

        getActivity().setTitle("Musi Rawas");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Gegar Lake", getResources().getString(R.string.deskripsi_gegas_lake), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Aur Lake", getResources().getString(R.string.deskripsi_aur_lake), R.mipmap.aur_lake));

    }

    private void initializeAdapter(){
        CardViewMusiRawasAdapter adapter = new CardViewMusiRawasAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }

}
