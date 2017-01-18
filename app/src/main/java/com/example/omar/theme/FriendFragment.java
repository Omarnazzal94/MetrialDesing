package com.example.omar.theme;

import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Activity;
import android.view.ViewGroup;
/**
 * Created by omar on 1/4/2017.
 */
public class FriendFragment extends android.support.v4.app.Fragment {


    public  FriendFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friend, container, false);

        return rootView;


}
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }
    }



