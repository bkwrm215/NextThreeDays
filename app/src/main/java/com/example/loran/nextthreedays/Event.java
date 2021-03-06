package com.example.loran.nextthreedays;

public class Event {

    private String title;
    private String place;
    private String time;
    private String price;
    private String location;
    private String description;

    public Event(String all) {
        String[] tokens = all.split("\n");
        title = tokens[0];
        place = tokens[1];
        time = tokens[2];
        price = tokens[3];
        location = tokens[4];
        description = tokens[5];
    }

    public Event(String title, String place, String time, String price, String location, String description)
    {
        this.title = title;
        this.place = place;
        this.time = time;
        this.price = price;
        this.location = location;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(boolean b)
    {
        if (b)
            return title + " " + place + " " + time + " " + price + " " + location + " " + description;
        else
            return title + "\n" + place + "\n" + time + "\n" + price + "\n" + location + "\n" + description;
    }
}
