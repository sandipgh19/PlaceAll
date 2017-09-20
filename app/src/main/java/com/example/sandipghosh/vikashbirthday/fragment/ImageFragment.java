package com.example.sandipghosh.vikashbirthday.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sandipghosh.vikashbirthday.R;

/**
 * Created by sandipghosh on 17/09/17.
 */

public class ImageFragment extends Fragment {

    View rootView;

    public static ImageFragment newInstance() {
        ImageFragment fragment = new ImageFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_image, container, false);

        return rootView;

    }


}
