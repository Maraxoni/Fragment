package com.example.fragment;


import java.util.Date;
import java.util.UUID;


public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
        category = Category.HOME;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(Boolean bool) {
        this.done = bool;
    }

    public UUID getId() {
        return this.id;
    }

    public void setCategory(Category cat) {
        this.category = cat;
    }

    public Date getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isDone() {
        return this.done;
    }

    public Category getCategory() {
        return this.category;
    }


    public void setDate(Date time) {
        this.date = time;
    }
}