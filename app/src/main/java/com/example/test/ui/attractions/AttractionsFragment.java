package com.example.test.ui.attractions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

public class AttractionsFragment extends Fragment {

    private AttractionsViewModel attractionsViewModel;
    RecyclerView recyclerview;
    String s1[];
    String s2[];
    String descriptions[];
    int[] images = {R.drawable.keyboard_memorial, R.drawable.yeltsin_center, R.drawable.sevastyanov_house,
                    R.drawable.temple_na_krovi, R.drawable.tatischev_memorial, R.drawable.ekaterinburg_circus,
                    R.drawable.novotichvinskiy_monastery, R.drawable.black_tulip, R.drawable.rastorguev_manor,
                    R.drawable.sverdlov_memorial};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*attractionsViewModel =
                ViewModelProviders.of(this).get(AttractionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_attractions, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        attractionsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        recyclerview = (RecyclerView)view.findViewById(R.id.recyclerview);
        s1 = getResources().getStringArray(R.array.attractions);
        s2 = getResources().getStringArray(R.array.addresses);
        descriptions = getResources().getStringArray((R.array.descriptions));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), s1, s2, descriptions, images);

        recyclerview.setAdapter(attractionAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}
