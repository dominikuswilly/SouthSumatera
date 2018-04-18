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
public class MonperaFragment extends Fragment {


    public MonperaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monpera, container, false);


        getActivity().setTitle("Monpera");
        return view;
    }

}
