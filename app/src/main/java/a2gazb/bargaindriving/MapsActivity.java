package a2gazb.bargaindriving;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import java.util.ArrayList;
import java.util.List;

import a2gazb.bargaindriving.customerlist.CasarealRecycleViewAdapter;
import a2gazb.bargaindriving.customerlist.RowData;

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

        RecyclerView rv = (RecyclerView) findViewById(R.id.casarealRecyclerView);
        CasarealRecycleViewAdapter adapter = new CasarealRecycleViewAdapter(this.createDataset());

        //LinearLayoutManager llm = new LinearLayoutManager(this);

        rv.setHasFixedSize(true);

        //rv.setLayoutManager(llm);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new GridLayoutManager(this, 2));
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

        LatLng tokyo = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tokyo));

        CameraUpdate cUpdate = CameraUpdateFactory.newLatLngZoom(
                new LatLng(35.68, 139.76), 12);
        mMap.moveCamera(cUpdate);
    }

    private List<RowData> createDataset() {

        List<RowData> dataset = new ArrayList<>();

        RowData data = new RowData();
        // ヘッダーの左側
        data.setHeader(1);
        data.setTitle("送客費用1000円圏内");
        dataset.add(data);
        // ヘッダーの右側
        data = new RowData();
        data.setHeader(1);
        data.setTitle("");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：32990円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：17210円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setHeader(1);
        data.setTitle("送客費用1500円圏内");
        dataset.add(data);
        // ヘッダーの右側
        data = new RowData();
        data.setHeader(1);
        data.setTitle("");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：91020円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：55250円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setHeader(1);
        data.setTitle("送客費用2000円圏内");
        dataset.add(data);
        // ヘッダーの右側
        data = new RowData();
        data.setHeader(1);
        data.setTitle("");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：60020円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：2567円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：117597円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：8657円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setHeader(1);
        data.setTitle("送客費用2500円圏内");
        dataset.add(data);
        // ヘッダーの右側
        data = new RowData();
        data.setHeader(1);
        data.setTitle("");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：5600円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        data = new RowData();
        data.setTitle("累計消費額：13542円");
        data.setDetail("詳しく見る／招待する");
        dataset.add(data);

        return dataset;
    }
}
