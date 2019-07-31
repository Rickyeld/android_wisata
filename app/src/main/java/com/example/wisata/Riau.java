package com.example.wisata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Riau extends AppCompatActivity {

    Button riauMap1;
    Button riauMap2;
    Button riauMap3;
    Button riauMap4;
    Button riauMap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riau);

        riauMap1 = (Button) findViewById(R.id.riauMap1);
        riauMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Masjid+Raya+An-Nur+Provinsi+Riau/@0.5266866,101.435867,13.17z/data=!4m5!3m4!1s0x31d5a95555555555:0xde40a84bc75e107e!8m2!3d0.5266631!4d101.4508545";
                Intent bukabrowser1 = new Intent(Intent.ACTION_VIEW);
                bukabrowser1.setData(Uri.parse(url));
                startActivity(bukabrowser1);
            }
        });

        riauMap2 = (Button) findViewById(R.id.riauMap2);
        riauMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Hutan+Wisata,Kota+Dumai/@1.6275418,101.4326973,14.46z/data=!4m5!3m4!1s0x31d3a5e361599157:0xec549982a88a94b4!8m2!3d1.6317963!4d101.4392895";
                Intent bukabrowser2 = new Intent(Intent.ACTION_VIEW);
                bukabrowser2.setData(Uri.parse(url));
                startActivity(bukabrowser2);
            }
        });

        riauMap3 = (Button) findViewById(R.id.riauMap3);
        riauMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pantai+Selat+Baru/@1.5452675,102.227666,13.21z/data=!4m5!3m4!1s0x31d16607810b45c3:0xdcf48be692296d95!8m2!3d1.5625169!4d102.2460199";
                Intent bukabrowser3 = new Intent(Intent.ACTION_VIEW);
                bukabrowser3.setData(Uri.parse(url));
                startActivity(bukabrowser3);
            }
        });

        riauMap4 = (Button) findViewById(R.id.riauMap4);
        riauMap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Candi+Muara+Takus/@0.3397118,100.5491525,10z/data=!4m8!1m2!2m1!1scandi+muara+takus!3m4!1s0x31d534de1cfa81d7:0x915328680a25f7f5!8m2!3d0.3360266!4d100.6419697";
                Intent bukabrowser4 = new Intent(Intent.ACTION_VIEW);
                bukabrowser4.setData(Uri.parse(url));
                startActivity(bukabrowser4);
            }
        });

        riauMap5 = (Button) findViewById(R.id.riauMap5);
        riauMap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pulau+Jemur/@2.7407065,100.096718,8.75z/data=!4m5!3m4!1s0x3032cd98f32d8cd1:0x7d3d052068a7c223!8m2!3d2.8888889!4d100.5708333";
                Intent bukabrowser5 = new Intent(Intent.ACTION_VIEW);
                bukabrowser5.setData(Uri.parse(url));
                startActivity(bukabrowser5);
            }
        });
    }
}
