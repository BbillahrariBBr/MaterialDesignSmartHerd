package com.example.bakibillah.materialdesignsmartherd;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//            //call me material design APIs here
//        }
//        else {
//            //below 21
//            //implement this feature with out material design
//        }

        Button standAlone = (Button)findViewById(R.id.standAloneToolBar);
        standAlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,StandaloneToolbar.class));
            }
        });
    }
}
