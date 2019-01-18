package com.example.drawer;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    private DrawerLayout drawer;
    private RecyclerView recyclerview;
    private TextView text_123;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View mview = inflater.inflate(R.layout.fragment_fragment1, container, false);
        findview(mview);
        initEvent();
        return mview;
    }

    private void initEvent() {
        drawer.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {
                //  Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerOpened(@NonNull View view) {

                // View mview = getLayoutInflater().inflate(R.layout.nav_header_main, null);
                recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);

                List<Data> list = new ArrayList<>();

                for (int i = 0; i < 20; i++) {
                    list.add(new Data(String.valueOf(i)));
                }

                Adapter adapter = new Adapter(getActivity(), list);
                LinearLayoutManager manager = new LinearLayoutManager(getActivity());
                manager.setOrientation(LinearLayoutManager.VERTICAL);

                recyclerview.setLayoutManager(manager);
                recyclerview.setAdapter(adapter);

               // text_123.setTextColor(Color.YELLOW);
                text_123.setText("777");
              //  text_123.setBackgroundColor(Color.YELLOW);

                  Toast.makeText(getActivity(), "2", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerClosed(@NonNull View view) {
              //  text_123.setTextColor(Color.WHITE);
               text_123.setText("123");
               // text_123.setBackgroundColor(Color.WHITE);
                  Toast.makeText(getActivity(), "3", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerStateChanged(int i) {
                //  Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
            }
        });

        text_123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }


            }
        });


    }

    private void findview(View mview) {

        Fragment2 fragment2 = new Fragment2();
        getChildFragmentManager().beginTransaction().add(R.id.framelayout2, fragment2, "tag2").commit();


        drawer = (DrawerLayout) mview.findViewById(R.id.drawer_layout);

        text_123 = (TextView) mview.findViewById(R.id.text_123);


    }

}
