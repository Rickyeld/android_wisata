package com.example.wisata;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageButton;

public class TampilanAwal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Button next = (Button) findViewById(R.id.prov1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Aceh.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button yuk = (Button) findViewById(R.id.prov2);
        yuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View soang) {
                Intent myIntent = new
                        Intent(soang.getContext(), Riau.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button kuy = (Button) findViewById(R.id.prov3);
        kuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View angsa) {
                Intent myIntent = new
                        Intent(angsa.getContext(), SumateraUtara.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button skuy = (Button) findViewById(R.id.prov4);
        skuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View manuk) {
                Intent myIntent = new
                        Intent(manuk.getContext(), Jambi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button njut = (Button) findViewById(R.id.prov5);
        njut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View orai) {
                Intent myIntent = new
                        Intent(orai.getContext(), Bengkulu.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Apakah Anda Yakin Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        TampilanAwal.this.finish();

                    }
                })
                .setNegativeButton("No", null)
                .show();

//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tampilan_awal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, About.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_prov1) {
            startActivity(new Intent(this, Aceh.class));

        } else if (id == R.id.nav_prov2) {
            startActivity(new Intent(this, Riau.class));

        } else if (id == R.id.nav_prov3) {
            startActivity(new Intent(this, SumateraUtara.class));

        } else if (id == R.id.nav_prov4) {
            startActivity(new Intent(this, Jambi.class));

        } else if (id == R.id.nav_prov5) {
            startActivity(new Intent(this, Bengkulu.class));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
