package com.slackershub.wallpapersapplication_v20;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImagesFragment extends Fragment {

    Button fragButton;

    public ImagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_images, container, false);
        fragButton = (Button) view.findViewById(R.id.fragButton);
        fragButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "HOLA", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
