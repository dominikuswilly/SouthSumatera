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
public class KawahTengkurepFragment extends Fragment {


    public KawahTengkurepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kawah_tengkurep, container, false);


        getActivity().setTitle("Kawah Tengkurep");
        return view;
    }

}
