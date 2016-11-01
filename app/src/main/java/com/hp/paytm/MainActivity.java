package com.hp.paytm;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF064B44")));



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            Intent in=new Intent(getApplicationContext(),team.class);
            startActivity(in);
            return true;
        }
        else if(id==R.id.action_queries)
        {
             Intent in=new Intent(getApplicationContext(),queries.class);
            startActivity(in);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        ArrayList<Event> events=new ArrayList<Event>();

       if (id == R.id.nav_OTHERS) {
           events.add(new Event("PHYSICS OLYMPIAD","by Dept. of Physics"));
           events.add(new Event("mathematics olympiad","by Dept. of Mathematics"));
           events.add(new Event("lab work","by Dept. of Physics"));
           events.add(new Event("jo jeeta wahi sikandar","Informal Event"));
           events.add(new Event("marketing event","by Dept. of Economics"));
           events.add(new Event("panel discussion","by Dept. of Economics"));
           events.add(new Event("sharetech","by Dept. of Management Studies"));
           events.add(new Event("board dat","by Dept. of Computer Applicants"));
           events.add(new Event("water fight","by Dept. of Computer Applicants"));
           Intent in=new Intent(getApplicationContext(),EventsActivity.class);
           in.putExtra("eventslist",events);
           startActivity(in);

        } else if (id == R.id.nav_CSE) {
            events.add(new Event("CODEWAC","School Event"));
            events.add(new Event("CODEHUNT","School Event"));

            events.add(new Event("EEE","School Event"));
            events.add(new Event("WEB CAMP","Informal Event"));
            events.add(new Event("SLOWMO","Informal Event"));
           events.add(new Event("Skull Crack","Informal Event"));
            events.add(new Event("CHIMERA","Mega Event"));

            Intent in=new Intent(getApplicationContext(),EventsActivity.class);
            in.putExtra("eventslist",events);


            startActivity(in);

        } else if (id == R.id.nav_ECE) {
            Intent in=new Intent(getApplicationContext(),EventsActivity.class);
            events.add(new Event("Brain Storm","School Event"));
            events.add(new Event("Elcovision","School Event"));
            events.add(new Event("Electromania","School Event"));
            events.add(new Event("Play with Arduino","School Event"));
            events.add(new Event("Play With Circuits","School Event"));
            events.add(new Event("Technojam","School Event"));
            events.add(new Event("cool skull","Informal Event"));
            events.add(new Event("innoversity","Informal Event"));
            events.add(new Event("robbo soccer","Mega Event"));
            events.add(new Event("wrist race","Mega Event"));

           in.putExtra("eventslist",events);
            startActivity(in);

        } else if (id == R.id.nav_MECH) {
            Intent in=new Intent(getApplicationContext(),EventsActivity.class);
            events.add(new Event("sling shot","School Event"));
            events.add(new Event("let it rip","School Event"));
            events.add(new Event("bridge builder","School Event"));
            events.add(new Event("udaan","School Event"));
            events.add(new Event("excellency in cad cam","School Event"));
            events.add(new Event("robo war","School Event"));
            events.add(new Event("robo disarmer","Mega Event"));
            events.add(new Event("auto messing","Mega Event"));
            in.putExtra("eventslist",events);

            startActivity(in);

        } else if (id == R.id.nav_IBT) {
            Intent in=new Intent(getApplicationContext(),EventsActivity.class);

            events.add(new Event("Streax","School Event"));
            events.add(new Event("Quiz","School Event"));
            events.add(new Event("Biobiz","School Event"));
            events.add(new Event("Game of Clones","School Event"));
            events.add(new Event("Wonderland","Informal Event"));
            events.add(new Event("Unscramble","Informal Event"));
            events.add(new Event("Forensics","Mega Event"));
            events.add(new Event("Brooding Mind","Mega Event"));
            in.putExtra("eventslist",events);

            startActivity(in);

        } else if (id == R.id.nav_MOMENTS) {
            Intent momintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://titiksha.smvdu.ac.in/gallery/index.html"));
            startActivity(momintent);

        }else if(id==R.id.nav_REGISTER)
        {
            Intent regintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://titiksha.smvdu.ac.in/app/register.html"));
            startActivity(regintent);
        }
        else if(id==R.id.BALAJI)
       {
           Intent in=new Intent(getApplicationContext(),BalajiViswanathan.class);
           startActivity(in);
       }
       else if(id==R.id.ADITI)
       {
           Intent in=new Intent(getApplicationContext(),Aditi_chaurasia.class);
           startActivity(in);
       }
       else if(id==R.id.PAWAN)
       {
           Intent in=new Intent(getApplicationContext(),Pawan_Agarwal.class);
           startActivity(in);
       }
       else if(id==R.id.nav_MAP)
       {
             Intent in=new Intent(getApplicationContext(),MapsActivity.class);
           startActivity(in);
       }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
