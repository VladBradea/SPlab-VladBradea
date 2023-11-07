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

    public String getTextCopy() {
        String textCopy;
        textCopy = this.text;
        return textCopy;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.text = alignStrategy.render(this);
    }

    @Override
    public void print() {

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
