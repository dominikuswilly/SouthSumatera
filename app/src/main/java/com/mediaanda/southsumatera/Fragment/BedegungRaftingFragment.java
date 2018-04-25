package com.mediaanda.southsumatera.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BedegungRaftingFragment extends Fragment {


    public BedegungRaftingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bedegung_rafting, container, false);


        getActivity().setTitle("Bedegung Rafting");
        return view;
    }

}
