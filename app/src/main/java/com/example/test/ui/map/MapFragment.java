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

        LatLng jackson_memorial = new LatLng(56.8295, 60.5971917);
        mMap.addMarker(new MarkerOptions().position(jackson_memorial).title("Памятник Майклу Джексону"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jackson_memorial));

        LatLng visotskiy_skyscraper = new LatLng(56.836092, 60.614473);
        mMap.addMarker(new MarkerOptions().position(visotskiy_skyscraper).title("Небоскрёб Высоцкий"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(visotskiy_skyscraper));

        LatLng sevastyanov_house = new LatLng(56.839033, 60.60593);
        mMap.addMarker(new MarkerOptions().position(sevastyanov_house).title("Дом Севастьянова"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sevastyanov_house));

        LatLng temple_on_blood = new LatLng(56.8443809, 60.6088771);
        mMap.addMarker(new MarkerOptions().position(temple_on_blood).title("Храм на Крови"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(temple_on_blood));

        LatLng popov_museum = new LatLng(56.8334760, 60.6129970);
        mMap.addMarker(new MarkerOptions().position(popov_museum).title("Музей радио имени А.С.Попова"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(popov_museum));

        LatLng mayakovskiy_park = new LatLng(56.811389, 60.645278);
        mMap.addMarker(new MarkerOptions().position(mayakovskiy_park).title("ЦПКиО имени В.В.Маяковского"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mayakovskiy_park));

        LatLng novotikhvinskiy_monastery = new LatLng(56.822778, 60.598611);
        mMap.addMarker(new MarkerOptions().position(novotikhvinskiy_monastery).title("Ново-Тихвинский монастырь"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(novotikhvinskiy_monastery));

        LatLng black_tulip = new LatLng(56.843139, 60.617361);
        mMap.addMarker(new MarkerOptions().position(black_tulip).title("Чёрный тюльпан"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(black_tulip));

        LatLng rastorguev_manor = new LatLng(56.845636, 60.611111);
        mMap.addMarker(new MarkerOptions().position(rastorguev_manor).title("Усадьба Расторгуевых-Харитоновых"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rastorguev_manor));

        LatLng dendropark = new LatLng(56.848, 60.651);
        mMap.addMarker(new MarkerOptions().position(dendropark).title("Екатеринбургский дендропарк"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dendropark));
    }
}
