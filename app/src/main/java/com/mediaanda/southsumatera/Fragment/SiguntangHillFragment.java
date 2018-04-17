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
public class SiguntangHillFragment extends Fragment {


    public SiguntangHillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_siguntang_hill, container, false);


        getActivity().setTitle("Siguntang Hill");
        return view;
    }

}
