package com.example.demo.models;

public class Paragraph {
    private String text;

    public Paragraph() {
        this.text = null;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }
}
