package com.example.bakibillah.materialdesignsmartherd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class StandaloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar mtoolBar = (Toolbar)findViewById(R.id.toolbar);
        mtoolBar.setTitle("Standalone ToolBar");
        mtoolBar.setSubtitle("by Baki");
        mtoolBar.setNavigationIcon(R.drawable.ic_arrow_back);
    }
}
