package com.example.wisata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SumateraUtara extends AppCompatActivity {

    Button sumutMap1;
    Button sumutMap2;
    Button sumutMap3;
    Button sumutMap4;
    Button sumutMap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatera_utara);

        sumutMap1 = (Button) findViewById(R.id.sumutMap1);
        sumutMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pantai+Indah+Tureloto/@1.3730473,97.1029193,12z/data=!4m5!3m4!1s0x3025cc7918f927ad:0x27a99002904068b5!8m2!3d1.4294342!4d97.1428125";
                Intent bukabrowser1 = new Intent(Intent.ACTION_VIEW);
                bukabrowser1.setData(Uri.parse(url));
                startActivity(bukabrowser1);
            }
        });

        sumutMap2 = (Button) findViewById(R.id.sumutMap2);
        sumutMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pulau+Asu/@0.7201648,97.0847342,9.75z/data=!4m5!3m4!1s0x302668052f21a37b:0xa941ed396488b4a1!8m2!3d0.9058333!4d97.2755556";
                Intent bukabrowser2 = new Intent(Intent.ACTION_VIEW);
                bukabrowser2.setData(Uri.parse(url));
                startActivity(bukabrowser2);
            }
        });

        sumutMap3 = (Button) findViewById(R.id.sumutMap3);
        sumutMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/PANTAI+LAGUNDI+NIAS+SELATAN/@0.4640053,97.5314083,10.71z/data=!4m5!3m4!1s0x3027d4deb475a9f9:0x872d972a9031f950!8m2!3d0.5804208!4d97.741569";
                Intent bukabrowser3 = new Intent(Intent.ACTION_VIEW);
                bukabrowser3.setData(Uri.parse(url));
                startActivity(bukabrowser3);
            }
        });

        sumutMap4 = (Button) findViewById(R.id.sumutMap4);
        sumutMap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pulau+Nias/@1.0422564,96.9426019,9z/data=!3m1!4b1!4m5!3m4!1s0x30261272d7d1a777:0x35ec71eeb2bc1c2!8m2!3d1.1255279!4d97.5247243";
                Intent bukabrowser4 = new Intent(Intent.ACTION_VIEW);
                bukabrowser4.setData(Uri.parse(url));
                startActivity(bukabrowser4);
            }
        });

        sumutMap5 = (Button) findViewById(R.id.sumutMap5);
        sumutMap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pulau+Hinako/@0.8666667,97.3238792,14z/data=!3m1!4b1!4m5!3m4!1s0x3026422e248c30a1:0xc0745f79d52f5511!8m2!3d0.8666667!4d97.3413889";
                Intent bukabrowser5 = new Intent(Intent.ACTION_VIEW);
                bukabrowser5.setData(Uri.parse(url));
                startActivity(bukabrowser5);
            }
        });
    }
}
