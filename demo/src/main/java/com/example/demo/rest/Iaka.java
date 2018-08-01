package com.example.demo.rest;

public class Iaka {
    private final long id;
    private final String content;

    public Iaka(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
