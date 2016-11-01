/**
 * Created by K.PRASHANTH on 16-10-2016.
 */
public class Event {
    private int imageresourceid;
    private String eventname;
     public Event(int imageresourceid,String eventname)
     {
         this.imageresourceid=imageresourceid;
         this.eventname=eventname;
     }
    public int getimageresourseid()
    {
        return this.imageresourceid;

    }
    public String getEventname()
    {
        return this.eventname;
    }
}
