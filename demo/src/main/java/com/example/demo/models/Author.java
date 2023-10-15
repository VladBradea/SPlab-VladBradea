package com.example.demo.models;

public class Author {
    private String name;

    public Author() {
        this.name = null;
    }

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author name:" + this.name);
    }

}
