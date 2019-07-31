package com.example.wisata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bengkulu extends AppCompatActivity {

    Button bengkuluMap1;
    Button bengkuluMap2;
    Button bengkuluMap3;
    Button bengkuluMap4;
    Button bengkuluMap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengkulu);

        bengkuluMap1 = (Button) findViewById(R.id.bengkuluMap1);
        bengkuluMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Rumah+Pengasingan+Bung+Karno/@-3.8020668,102.2558206,15.75z/data=!4m5!3m4!1s0x2e36b0228d92444d:0x33b291d649b74efe!8m2!3d-3.7992631!4d102.2613517";
                Intent bukabrowser1 = new Intent(Intent.ACTION_VIEW);
                bukabrowser1.setData(Uri.parse(url));
                startActivity(bukabrowser1);
            }
        });

        bengkuluMap2 = (Button) findViewById(R.id.bengkuluMap2);
        bengkuluMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Danau+Dendam+Tak+Sudah/@-3.8008014,102.3004274,15z/data=!3m1!4b1!4m5!3m4!1s0x2e36b08940f3ee81:0x9fb78d553b4ebf68!8m2!3d-3.8030703!4d102.3077365";
                Intent bukabrowser2 = new Intent(Intent.ACTION_VIEW);
                bukabrowser2.setData(Uri.parse(url));
                startActivity(bukabrowser2);
            }
        });

        bengkuluMap3 = (Button) findViewById(R.id.bengkuluMap3);
        bengkuluMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Air+Berau,+Pd.+Suguh,+Kabupaten+Mukomuko,+Bengkulu/@-2.9678073,101.0496387,8.25z/data=!4m8!1m2!2m1!1ssungai+air+berau!3m4!1s0x2e3268855350fa03:0x1d554fe01a863e02!8m2!3d-2.687537!4d101.5645958";
                Intent bukabrowser3 = new Intent(Intent.ACTION_VIEW);
                bukabrowser3.setData(Uri.parse(url));
                startActivity(bukabrowser3);
            }
        });

        bengkuluMap4 = (Button) findViewById(R.id.bengkuluMap4);
        bengkuluMap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Air+Terjun+Curup+Ndu/@-3.7535253,102.5505618,17z/data=!3m1!4b1!4m5!3m4!1s0x2e36cf6a34211229:0x7eb4870d302fc3f6!8m2!3d-3.7535253!4d102.5527505";
                Intent bukabrowser4 = new Intent(Intent.ACTION_VIEW);
                bukabrowser4.setData(Uri.parse(url));
                startActivity(bukabrowser4);
            }
        });

        bengkuluMap5 = (Button) findViewById(R.id.bengkuluMap5);
        bengkuluMap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Danau+Picung+Kabupaten+Lebong/@-3.1407916,102.177298,17z/data=!3m1!4b1!4m5!3m4!1s0x2e317b9bf6f7f99b:0xe9da93c9f2ba1b12!8m2!3d-3.1407916!4d102.1794867";
                Intent bukabrowser5 = new Intent(Intent.ACTION_VIEW);
                bukabrowser5.setData(Uri.parse(url));
                startActivity(bukabrowser5);
            }
        });
    }
}
