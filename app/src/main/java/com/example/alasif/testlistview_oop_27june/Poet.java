package com.example.alasif.testlistview_oop_27june;

import java.util.ArrayList;

public class Poet {
    private String name, description;
    private ArrayList<Poet> poets;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Poet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Poet() {
    }

    @Override
    public String toString() {
        return getName();
    }

    public ArrayList<Poet> getAllPoets(){
        poets = new ArrayList<>();
        poets.add(new Poet("robi","nobel poet"));
        poets.add(new Poet("michel","patriot"));
        return poets;
    }
}
