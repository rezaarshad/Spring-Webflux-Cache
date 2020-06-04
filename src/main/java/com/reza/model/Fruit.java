package com.reza.model;

public class Fruit {

    private long id;

    private String name;

    public Fruit(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}
