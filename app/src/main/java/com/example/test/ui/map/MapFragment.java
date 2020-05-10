package com.example.test.ui.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import com.example.test.R;

public class MapFragment extends Fragment implements OnMapReadyCallback{

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_map, container, false);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
        return root;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.*/

    @Override
    public void onMapReady(GoogleMap googleMap) {
         GoogleMap mMap = googleMap;

        LatLng keyboard_memorial = new LatLng(56.832389, 60.607548);
        mMap.addMarker(new MarkerOptions().position(keyboard_memorial).title("Памятник клавиатуре"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(keyboard_memorial));

        LatLng yeltsin_center = new LatLng(56.8452090, 60.5897850);
        mMap.addMarker(new MarkerOptions().position(yeltsin_center).title("Ельцин-центр"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yeltsin_center));

        LatLng sevastyanov_house = new LatLng(56.839033, 60.60593);
        mMap.addMarker(new MarkerOptions().position(sevastyanov_house).title("Дом Севастьянова"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sevastyanov_house));

        LatLng temple_on_blood = new LatLng(56.8443809, 60.6088771);
        mMap.addMarker(new MarkerOptions().position(temple_on_blood).title("Храм на Крови"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple_on_blood));

        LatLng tatischev_memorial = new LatLng(56.838167, 60.605861);
        mMap.addMarker(new MarkerOptions().position(tatischev_memorial).title("Памятник Татищеву и де Геннину"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tatischev_memorial));

        LatLng ekaterinburg_circus = new LatLng(56.8259266, 60.604886);
        mMap.addMarker(new MarkerOptions().position(ekaterinburg_circus).title("Екатеринбургский цирк"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ekaterinburg_circus));

        LatLng novotikhvinskiy_monastery = new LatLng(56.822778, 60.598611);
        mMap.addMarker(new MarkerOptions().position(novotikhvinskiy_monastery).title("Ново-Тихвинский монастырь"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(novotikhvinskiy_monastery));

        LatLng black_tulip = new LatLng(56.843139, 60.617361);
        mMap.addMarker(new MarkerOptions().position(black_tulip).title("Чёрный тюльпан"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(black_tulip));

        LatLng rastorguev_manor = new LatLng(56.845636, 60.611111);
        mMap.addMarker(new MarkerOptions().position(rastorguev_manor).title("Усадьба Расторгуевых-Харитоновых"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rastorguev_manor));

        LatLng sverdlov_memorial = new LatLng(56.839722, 60.616389);
        mMap.addMarker(new MarkerOptions().position(sverdlov_memorial).title("Памятник Свердлову"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sverdlov_memorial));
    }
}
