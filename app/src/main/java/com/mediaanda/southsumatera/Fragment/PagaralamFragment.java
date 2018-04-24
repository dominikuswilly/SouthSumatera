package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewPagaralamAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PagaralamFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewPagaralamAdapter mCardDestinationAdapter;

    public PagaralamFragment() {
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

        getActivity().setTitle("Pagaralam");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Mount Dempo", getResources().getString(R.string.deskripsi_mount_dempo), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Tea Plantation", getResources().getString(R.string.deskripsi_tea_plantation), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Lematang Waterfall", getResources().getString(R.string.deskripsi_lematang_waterfall), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Megalith Sites", getResources().getString(R.string.deskripsi_megalith_sites_pagar_alam), R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Tebat Gheban", getResources().getString(R.string.deskripsi_tebat_gheban), R.drawable.logo_south_sumatera));
    }

    private void initializeAdapter(){
        CardViewPagaralamAdapter adapter = new CardViewPagaralamAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
