package com.deepak.captionyourimage.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepak.captionyourimage.MainActivity;
import com.deepak.captionyourimage.R;

/**
 * Created by Deepak Kumar on 24-05-2018.
 * SPLASH FRAGMENT
 */

public class SplashFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.splash_layout, container, false);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Fragment fragment = new AddImageWithCaptionFragment();
                ((MainActivity)getActivity()).loadFragment(fragment);
            }
        }, 4000);

        return view;
    }
}
