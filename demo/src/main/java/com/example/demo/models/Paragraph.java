package com.example.demo.models;

import java.io.*;

public class Paragraph implements Element{
    private String text;

    public Paragraph() {
        this.text = null;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public Element clone() {
        return new Paragraph(this.text);
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
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
