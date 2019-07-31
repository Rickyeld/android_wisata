package com.example.wisata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jambi extends AppCompatActivity {

    Button jambiMap1;
    Button jambiMap2;
    Button jambiMap3;
    Button jambiMap4;
    Button jambiMap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jambi);

        jambiMap1 = (Button) findViewById(R.id.jambiMap1);
        jambiMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Danau+Kaco/@-2.3312346,101.5211184,14.25z/data=!4m5!3m4!1s0x2e2d8f4eefad48c1:0x94f8dc776d70db07!8m2!3d-2.3267771!4d101.5398627";
                Intent bukabrowser1 = new Intent(Intent.ACTION_VIEW);
                bukabrowser1.setData(Uri.parse(url));
                startActivity(bukabrowser1);
            }
        });

        jambiMap2 = (Button) findViewById(R.id.jambiMap2);
        jambiMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Danau+Sipin/@-1.6019514,103.5831356,15.75z/data=!4m5!3m4!1s0x2e2588509ee7d107:0x77a2cdff0878431b!8m2!3d-1.5996453!4d103.5847179";
                Intent bukabrowser2 = new Intent(Intent.ACTION_VIEW);
                bukabrowser2.setData(Uri.parse(url));
                startActivity(bukabrowser2);
            }
        });

        jambiMap3 = (Button) findViewById(R.id.jambiMap3);
        jambiMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Jambi+Paradise/@-1.6710471,103.6482761,16z/data=!4m5!3m4!1s0x2e25843396a160b3:0x8eacdff215797d2b!8m2!3d-1.6699318!4d103.6511514";
                Intent bukabrowser3 = new Intent(Intent.ACTION_VIEW);
                bukabrowser3.setData(Uri.parse(url));
                startActivity(bukabrowser3);
            }
        });

        jambiMap4 = (Button) findViewById(R.id.jambiMap4);
        jambiMap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Taman+Rimba+Zoo+Jambi/@-1.6281712,103.6434466,16.5z/data=!4m5!3m4!1s0x2e2585f8347ff5cb:0xe9faad09651411ee!8m2!3d-1.6276337!4d103.6459597";
                Intent bukabrowser4 = new Intent(Intent.ACTION_VIEW);
                bukabrowser4.setData(Uri.parse(url));
                startActivity(bukabrowser4);
            }
        });

        jambiMap5 = (Button) findViewById(R.id.jambiMap5);
        jambiMap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Air+Terjun+Pancaro+Rayo/@-2.1872328,101.4337774,15.75z/data=!4m5!3m4!1s0x2e2d9bf975aa3551:0xe6046577b57e342c!8m2!3d-2.1866417!4d101.4383619";
                Intent bukabrowser5 = new Intent(Intent.ACTION_VIEW);
                bukabrowser5.setData(Uri.parse(url));
                startActivity(bukabrowser5);
            }
        });
    }
}
