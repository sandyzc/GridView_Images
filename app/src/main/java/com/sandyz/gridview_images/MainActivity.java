package com.sandyz.gridview_images;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid= (GridView)findViewById(R.id.grid);
        grid.setAdapter(new com.sandyz.gridview_images.ArrayAdapter(this));


    }
}
