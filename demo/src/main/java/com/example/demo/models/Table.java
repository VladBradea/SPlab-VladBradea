package com.example.demo.models;

public class Table implements Element{
    private String title;

    public Table() {
        this.title = null;
    }

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Title: " + this.title);
    }
}
