package com.example.sandipghosh.vikashbirthday.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sandipghosh.vikashbirthday.R;

/**
 * Created by sandipghosh on 21/09/17.
 */

public class ChatFragment extends Fragment {

    View rootView;

    public static ChatFragment newInstance() {
        ChatFragment fragment = new ChatFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_chat, container, false);

        return rootView;

    }

}
