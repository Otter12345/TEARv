package com.tearvandroid.tearvandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    Button upArrow;
    Button downArrow;
    Button leftArrow;
    Button rightArrow;
    TextView textToChange;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        upArrow = (Button) view.findViewById(R.id.arrow_up);
        downArrow = (Button) view.findViewById(R.id.arrow_down);
        leftArrow = (Button) view.findViewById(R.id.arrow_left);
        rightArrow = (Button) view.findViewById(R.id.arrow_right);
        textToChange = (TextView) view.findViewById(R.id.txt);

        upArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToChange.setText("Moved Up");
            }
        });

        downArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToChange.setText("Moved Down");
            }
        });

        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToChange.setText("Moved Left");
            }
        });

        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToChange.setText("Moved Right");
            }
        });

        return view;
    }
}
