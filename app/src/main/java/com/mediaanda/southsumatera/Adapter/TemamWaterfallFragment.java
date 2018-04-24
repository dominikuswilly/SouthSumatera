package com.mediaanda.southsumatera.Adapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mediaanda.southsumatera.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TemamWaterfallFragment extends Fragment {


    public TemamWaterfallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temam_waterfall, container, false);


        getActivity().setTitle("Temam Waterfall");
        return view;
    }

}
