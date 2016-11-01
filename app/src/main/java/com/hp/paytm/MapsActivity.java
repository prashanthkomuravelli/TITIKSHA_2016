package com.hp.paytm;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera


        LatLng smvdu = new LatLng(32.943364, 74.953361);
        mMap.addMarker(new MarkerOptions().position(smvdu).title("Nescafe"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(32.941542, 74.953854),18));
        mMap.addMarker(new MarkerOptions().position(new LatLng(32.941806, 74.952833)).title("Central Library"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(32.940723, 74.952970)).title("LT A and LT B"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(32.940673, 74.954905)).title("LT C and LT D"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(32.941542, 74.953854)).title("Fountain"));


    }
}
