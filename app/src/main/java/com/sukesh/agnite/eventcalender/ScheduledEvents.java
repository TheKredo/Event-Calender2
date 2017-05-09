package com.sukesh.agnite.eventcalender;

import com.google.api.services.calendar.model.EventDateTime;

/**
 * Created by mrsp7 on 09-05-2017.
 */

public class ScheduledEvents {

        private String eventSummery;
        private String description;
        private String location;
        //private EventDateTime start;
        private String name;
        private String mail;

        public String getEventSummery() {
            return eventSummery;
        }

        public void setEventSummery(String eventSummery) {
            this.eventSummery = eventSummery;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLocation() {
        return location;
    }

        public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /*public EventDateTime getStarts() {
        return start;
    }

    public void setStarts(EventDateTime start) {
        this.start = start;
    }*/



}
