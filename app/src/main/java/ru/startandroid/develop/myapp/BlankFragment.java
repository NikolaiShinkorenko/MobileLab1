package ru.startandroid.develop.myapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {
    TextView tvChangeable;
    Button btnChange;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        tvChangeable = (TextView) v.findViewById(R.id.tvChangeable);
        btnChange = (Button) v.findViewById(R.id.btnChange);

        View.OnClickListener oclBtnChange = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChangeable.setText("Error");
                Toast.makeText(view.getContext(), "Try again", Toast.LENGTH_LONG).show();
            }
        };
        btnChange.setOnClickListener(oclBtnChange);

        return v;
    }
}
