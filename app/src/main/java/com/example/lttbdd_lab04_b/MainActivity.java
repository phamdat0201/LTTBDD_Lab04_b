package com.example.lttbdd_lab04_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvThing;
    ArrayList<ElectricThing> arrayList;
    CustomAdapter ctAdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grvThing = findViewById(R.id.grvThing);

        arrayList = new ArrayList<>();

        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.giacchuyen_1, -39));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.daynguon_1, -39));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.dauchuyendoipsps2_1, -39));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.dauchuyendoi_1, -39));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.carbusbtops2_1, -39));
        arrayList.add(new ElectricThing("Cáp chuyển từ Cổng USB sang PS2...", 4,
                69900, 15, R.drawable.daucam_1, -39));

        ctAdt = new CustomAdapter(MainActivity.this, R.layout.item_gridview, arrayList);

        grvThing.setAdapter(ctAdt);
    }
}