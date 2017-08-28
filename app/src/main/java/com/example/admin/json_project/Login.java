package com.example.admin.json_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Login extends Fragment {


    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       getActivity().overridePendingTransition(R.anim.slide_n_right,R.anim.slide_out_left);
        return inflater.inflate(R.layout.fragment_login, container, false);
    }




}
