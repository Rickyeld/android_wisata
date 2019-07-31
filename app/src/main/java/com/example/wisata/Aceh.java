package com.example.wisata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Aceh extends AppCompatActivity {

    Button acehMap1;
    Button acehMap2;
    Button acehMap3;
    Button acehMap4;
    Button acehMap5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceh);

        acehMap1 = (Button) findViewById(R.id.acehMap1);
        acehMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.co.id/maps/place/Pulau+Bangkaru/@2.059392,97.0479784,12z/data=!3m1!4b1!4m5!3m4!1s0x30251e726937d9c7:0x70647981d80ae72f!8m2!3d2.0603049!4d97.1251699";
                Intent bukabrowser1 = new Intent(Intent.ACTION_VIEW);
                bukabrowser1.setData(Uri.parse(url));
                startActivity(bukabrowser1);
            }
        });

        acehMap2 = (Button) findViewById(R.id.acehMap2);
        acehMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Taman+Nasional+Gunung+Leuser/@3.4133581,96.9833979,9z/data=!4m5!3m4!1s0x3039861c87a73591:0x3f1b67119f4d54b2!8m2!3d3.7742069!4d97.2437105";
                    Intent bukabrowser2 = new Intent(Intent.ACTION_VIEW);
                    bukabrowser2.setData(Uri.parse(url));
                    startActivity(bukabrowser2);
            }
        });

        acehMap3 = (Button) findViewById(R.id.acehMap3);
        acehMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Tanah+Bara,+Gn.+Meriah,+Kabupaten+Aceh+Singkil,+Aceh/@2.5030086,97.7660274,8.37z/data=!4m5!3m4!1s0x302ffcc659213dc3:0xf4f0c40911f63fa4!8m2!3d2.3829948!4d97.9429421https://www.google.com/maps/place/Tanah+Bara,+Gn.+Meriah,+Kabupaten+Aceh+Singkil,+Aceh/@2.5030086,97.7660274,8.37z/data=!4m5!3m4!1s0x302ffcc659213dc3:0xf4f0c40911f63fa4!8m2!3d2.3829948!4d97.9429421";
                Intent bukabrowser3 = new Intent(Intent.ACTION_VIEW);
                bukabrowser3.setData(Uri.parse(url));
                startActivity(bukabrowser3);
            }
        });

        acehMap4 = (Button) findViewById(R.id.acehMap4);
        acehMap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Air+Terjun+Situmurun/@2.178335,98.5524039,9.5z/data=!4m5!3m4!1s0x3031e4cdf02698d9:0x4e813a548e5424a9!8m2!3d2.5370911!4d99.0081719";
                Intent bukabrowser4 = new Intent(Intent.ACTION_VIEW);
                bukabrowser4.setData(Uri.parse(url));
                startActivity(bukabrowser4);
            }
        });

        acehMap5 = (Button) findViewById(R.id.acehMap5);
        acehMap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/Pulau+Banyak,+Kabupaten+Aceh+Singkil,+Aceh/@2.0786573,97.1225275,9.25z/data=!4m5!3m4!1s0x302539becc5a84b9:0xf22eba8ba0db80e0!8m2!3d2.3198851!4d97.413802";
                Intent bukabrowser5 = new Intent(Intent.ACTION_VIEW);
                bukabrowser5.setData(Uri.parse(url));
                startActivity(bukabrowser5);
            }
        });
    }
}
