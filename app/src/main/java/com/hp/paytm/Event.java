package com.hp.paytm;

import java.io.Serializable;

/**
 * Created by K.PRASHANTH on 27-10-2016.
 */
public class Event implements Serializable {
    private String Event_name;
    private String Event_type;
    public Event(String Event_name,String Event_type)
    {
        this.Event_name=Event_name;
        this.Event_type=Event_type;
    }
    public String getEvent_name()
    {
        return Event_name;
    }
    public String getEvent_type()
    {
        return Event_type;
    }
}
