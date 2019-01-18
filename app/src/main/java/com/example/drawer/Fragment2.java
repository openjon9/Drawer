package com.example.drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    private RecyclerView recyclerview;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View mview = inflater.inflate(R.layout.fragment_fragment2, container, false);
        findview(mview);
        return mview;
    }

    private void findview(View mview) {


        recyclerview = (RecyclerView) mview.findViewById(R.id.recyclerview);


        List<Data2> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(new Data2());
        }

        Adapter2 adapter2 = new Adapter2(getActivity(),list );

        GridLayoutManager manager =new GridLayoutManager(getActivity(),2);

        recyclerview.setLayoutManager(manager);
        recyclerview.setAdapter(adapter2);
    }

}
