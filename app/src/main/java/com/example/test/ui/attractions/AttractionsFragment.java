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

    RecyclerView recyclerview;
    String s1[];
    String s2[];
    String descriptions[];
    int[] images = {R.drawable.keyboard_memorial, R.drawable.yeltsin_center, R.drawable.sevastyanov_house,
                    R.drawable.temple_na_krovi, R.drawable.tatischev_memorial, R.drawable.ekaterinburg_circus,
                    R.drawable.novotichvinskiy_monastery, R.drawable.black_tulip, R.drawable.rastorguev_manor,
                    R.drawable.sverdlov_memorial};
    int[] gallery_images1 = {R.drawable.keyboard_memorial_gallery1, R.drawable.eltsin_center_gallery1, R.drawable.sevastyanov_house_gallery1,
                             R.drawable.temple_on_blood_gallery1, R.drawable.tatischev_memorial_gallery1, R.drawable.ekaterinburg_circus_gallery1,
                             R.drawable.novotikhinskiy_monastery_gallery1, R.drawable.black_tulip_gallery1, R.drawable.rastorguev_manor_gallery1,
                             R.drawable.sverdlov_memorial_gallery1};
    int[] gallery_images2 = {R.drawable.keyboard_memorial_gallery2, R.drawable.eltsin_center_gallery2, R.drawable.sevastyanov_house_gallery2,
                             R.drawable.temple_on_blood_gallery2, R.drawable.tatischev_memorial_gallery2, R.drawable.ekaterinburg_circus_gallery2,
                             R.drawable.novotikhinskiy_monastery_gallery2, R.drawable.black_tulip_gallery2, R.drawable.rastorguev_manor_gallery2,
                             R.drawable.sverdlov_memorial_gallery2};
    int[] gallery_images3 = {R.drawable.keyboard_memorial_gallery3, R.drawable.eltsin_center_gallery3, R.drawable.sevastyanov_house_gallery3,
                             R.drawable.temple_on_blood_gallery3, R.drawable.tatischev_memorial_gallery3, R.drawable.ekaterinburg_circus_gallery3,
                             R.drawable.novotikhinskiy_monastery_gallery3, R.drawable.black_tulip_gallery3, R.drawable.rastorguev_manor_gallery3,
                             R.drawable.sverdlov_memorial_gallery3};
    int[] audioguides = {R.raw.keyboard_memorial_audioguide, R.raw.yeltsin_center_audioguide, R.raw.sevastyanov_house_audioguide,
                         R.raw.temple_on_blood_audioguide, R.raw.tatischev_memorial_audioguide, R.raw.ekaterinburg_circus_audioguide,
                         R.raw.novotikhvinskiy_monastery_audioguide, R.raw.black_tulip_audioguide, R.raw.rastorguev_manor_audioguide,
                         R.raw.sverdlov_memorial_audioguide};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_attractions, container, false);

        recyclerview = (RecyclerView)view.findViewById(R.id.recyclerview);
        s1 = getResources().getStringArray(R.array.attractions);
        s2 = getResources().getStringArray(R.array.addresses);
        descriptions = getResources().getStringArray((R.array.descriptions));

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), s1, s2, descriptions, images,
                gallery_images1, gallery_images2, gallery_images3, audioguides);

        recyclerview.setAdapter(attractionAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}
