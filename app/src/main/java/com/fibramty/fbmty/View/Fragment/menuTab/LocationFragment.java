package com.fibramty.fbmty.View.Fragment.menuTab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fibramty.fbmty.Library.Validators;
import com.fibramty.fbmty.R;
import com.fibramty.fbmty.View.Activity.MainActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocationFragment extends Fragment implements GoogleMap.OnMarkerClickListener,
        OnMapReadyCallback {

    private GoogleMap mMap;
    MapView mMapView;

    @BindView(R.id.fr_location_arrow)ImageView arrow;
    @BindView(R.id.fr_location_title)TextView titleTxt;
    @BindView(R.id.fr_location_address)TextView addressTxt;

    public LocationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (MainActivity.holdingResponse != null){
            titleTxt.setText(Validators.validateString(MainActivity.holdingResponse.get(0).getName()));
            if (MainActivity.holdingResponse.get(0).getAddress() != null) {
                addressTxt.setText(Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getStreet())
                +" "+Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getNumberExt())
                +" "+Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getSuburb())
                +" "+Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getTown())
                +" "+Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getZip())
                +" "+Validators.validateString(MainActivity.holdingResponse.get(0).getAddress().getState()));
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_location, container, false);
        ButterKnife.bind(this, view);
        mMapView = (MapView) view.findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume();

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(this);

        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        if (MainActivity.holdingResponse != null && MainActivity.holdingResponse.get(0) != null
                && MainActivity.holdingResponse.get(0).getCoordinates() != null &&
                (MainActivity.holdingResponse.get(0).getCoordinates().getLatitude() != 0 && MainActivity.holdingResponse.get(0).getCoordinates().getLongitude() != 0)){
                //String[] latLngString = new String[]{String.valueOf(MainActivity.holdingResponse.get(0).getCoordinates().getLatitude()),String.valueOf(MainActivity.holdingResponse.get(0).getCoordinates().getLongitude())};
                String[] latLngString = new String[]{"19.3783642","-99.1732938"};
                LatLng latLng = new LatLng(new Double(latLngString[0]),new Double(latLngString[1]));
            mMap.animateCamera(CameraUpdateFactory
                    .newCameraPosition(CameraPosition
                            .fromLatLngZoom(
                                    new LatLng(new Double(latLngString[0]),
                                            new Double(latLngString[1])),
                                    15)));
            mMap.addMarker(new MarkerOptions()
                        .position(latLng)
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico_map_pin))
                        .title((MainActivity.holdingResponse.get(0).getName())));

        }

        mMap.isMyLocationEnabled();
        mMap.setOnMarkerClickListener(this);
    }

    /** Called when the user clicks a marker. */
    @Override
    public boolean onMarkerClick(final Marker marker) {


        // Return false to indicate that we have not consumed the event and that we wish
        // for the default behavior to occur (which is for the camera to move such that the
        // marker is centered and for the marker's info window to open, if it has one).
        return false;
    }


    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }

}
