package com.example.sandipghosh.vikashbirthday;


import android.support.v4.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.sandipghosh.vikashbirthday.fragment.ImageFragment;
import com.example.sandipghosh.vikashbirthday.fragment.VideoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.image:
                                // selectedFragment = ItemOneFragment.newInstance();
                                selectedFragment = ImageFragment.newInstance();
                                break;
                            case R.id.video:
                                // selectedFragment = ItemTwoFragment.newInstance();
                                selectedFragment = VideoFragment.newInstance();
                                break;
                            case R.id.chatting:
                                // selectedFragment = ItemThreeFragment.newInstance();
                                selectedFragment = ImageFragment.newInstance();
                                break;

                        }
                        //FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, ImageFragment.newInstance());
        transaction.commit();


    }


}

