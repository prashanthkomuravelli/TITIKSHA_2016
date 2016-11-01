package com.hp.paytm;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_events);

        listView= (ListView) findViewById(R.id.listView);


     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF064B44")));
        Intent in=getIntent();
        Bundle b=in.getExtras();
        ArrayList<Event> events= (ArrayList<Event>) b.getSerializable("eventslist");
        EventAdapter arrayAdapter=new EventAdapter(this,events);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv= (TextView) view.findViewById(R.id.Eventname);
                Log.i("clicked",tv.getText().toString());
                String Event_clicked=tv.getText().toString();
                Intent in =new Intent(getApplicationContext(),Description_layout.class);
                in.putExtra("EventClicked",Event_clicked);
                startActivity(in);
            }
        });


        }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
