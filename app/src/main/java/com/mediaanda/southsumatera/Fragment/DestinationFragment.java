package com.mediaanda.southsumatera.Fragment;


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
        listDestination.add(new Destination("Palembang", "Keterangan Palembang", R.mipmap.ampera_bridge));
        listDestination.add(new Destination("Banyuasin", "Keterangan Banyuasin", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Empat Lawang", "Keterangan Empat Lawang", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Lahat", "Keterangan Lahat", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Lubuk Linggau", "Keterangan Lubuk Linggau", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Muara Enim", "Keterangan Muara Enim", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Musi Banyuasin", "Keterangan Musi Banyuasin", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Musi Rawas", "Keterangan Musi Rawas", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Musi Rawas Utara", "Keterangan Musi Rawas Utara", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Ogan Komering Ilir", "Keterangan Ogan Komering Ilir", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Ogan Komering Ulu", "Keterangan Ogan Komering Ulu", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("OKU Selatan", "Keterangan OKU Selatan", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("OKU Timur", "Keterangan OKU Timur", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Pagaralam", "Keterangan Pagar Alam", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Pali", "Keterangan Pali", R.mipmap.ic_menu_airport));
        listDestination.add(new Destination("Prabumulih", "Keterangan Prabumulih", R.mipmap.ic_menu_airport));

    }

    private void initializeAdapter(){
        CardViewDestinationAdapter adapter = new CardViewDestinationAdapter(listDestination);
        rvDestination.setAdapter(adapter);
    }
}
