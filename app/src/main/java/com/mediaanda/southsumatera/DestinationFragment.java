package com.mediaanda.southsumatera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.Adapter.CardViewDestinationAdapter;
import com.mediaanda.southsumatera.Destination;
import com.mediaanda.southsumatera.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DestinationFragment extends Fragment {

    private List<Destination> listDestination;
    private RecyclerView rvDestination;
    private RecyclerView.LayoutManager layoutManager;
    private CardViewDestinationAdapter mCardDestinationAdapter;

    public DestinationFragment() {
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

        getActivity().setTitle("South Sumatera");
        return view;
    }

    private void initializeData(){
        listDestination = new ArrayList<>();
        listDestination.add(new Destination("Palembang", "No Description", R.mipmap.ampera_bridge));
        listDestination.add(new Destination("Banyuasin", "No Description", R.mipmap.sembilang));
        listDestination.add(new Destination("Empat Lawang", "No Description", R.mipmap.tujuh_panggung));
        listDestination.add(new Destination("Lahat", "No Description", R.mipmap.bukit_selero));
        listDestination.add(new Destination("Lubuk Linggau", "No Description", R.mipmap.temam_waterfall));
        listDestination.add(new Destination("Muara Enim", "No Description", R.mipmap.bedegung_waterfall));
        listDestination.add(new Destination("Musi Banyuasin", "No Description", R.mipmap.ulak_lia));
        listDestination.add(new Destination("Musi Rawas", "No Description", R.mipmap.aur_lake));
        listDestination.add(new Destination("Musi Rawas Utara", "No Description", R.mipmap.napal_licin));
        listDestination.add(new Destination("Ogan Komering Ilir", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Ogan Komering Ulu", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("OKU Selatan", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("OKU Timur", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Pagaralam", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Pali", "No Description", R.drawable.logo_south_sumatera));
        listDestination.add(new Destination("Prabumulih", "No Description", R.drawable.logo_south_sumatera));

    }

    private void initializeAdapter(){
        CardViewDestinationAdapter adapter = new CardViewDestinationAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
