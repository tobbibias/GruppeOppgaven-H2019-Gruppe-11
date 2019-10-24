package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.Date;

public class Events {
    private Federation host;
    private String location, eventName, description;
    private Date date;

    public Events(Federation host, String location, String eventName, String description, Date date) {
        this.host = host;
        this.location = location;
        this.eventName = eventName;
        this.description = description;
        this.date = date;
    }

    public Federation getHost() {
        return host;
    }

    public String getLocation() {
        return location;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}
