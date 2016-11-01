package com.hp.paytm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by K.PRASHANTH on 27-10-2016.
 */
public class EventAdapter extends ArrayAdapter<Event> {
    public EventAdapter(Activity context, ArrayList<Event> events) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, events);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        Event currentAndroidFlavor = getItem(position);
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_events_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
              

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView eventname = (TextView) listItemView.findViewById(R.id.Eventname);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        eventname.setText(currentAndroidFlavor.getEvent_name());
        TextView eventtype = (TextView) listItemView.findViewById(R.id.Eventtype);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        eventtype.setText(currentAndroidFlavor.getEvent_type());





        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
