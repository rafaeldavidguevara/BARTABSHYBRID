package com.example.rd.acionbarapplication;

/**
 * Created by rd on 19/08/15.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ToyotaFragmentTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.toyota_layout, container, false);

        return rootView;

    }

}
