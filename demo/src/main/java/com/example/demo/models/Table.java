package com.example.demo.models;

import java.io.*;

public class Table implements Element{
    private String title;

    public Table() {
        this.title = null;
    }

    public Table(String title) {
        this.title = title;
    }

    @Override
    public Element clone() {
        return new Table(this.title);
    }

    @Override
    public void print() {
        System.out.println("Title: " + this.title);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}
