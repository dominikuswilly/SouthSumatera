package com.mediaanda.southsumatera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TourismKampoengFragment extends Fragment {


    public TourismKampoengFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourism_kampoeng, container, false);


        getActivity().setTitle("Tourism Kampoeng");
        return view;
    }

}