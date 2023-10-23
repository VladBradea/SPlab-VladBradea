package com.example.demo.models;

import java.io.*;

public class Image implements Element{
    private String url;

    public Image() {
        this.url = null;
    }

    public Image(String imageName) {
        this.url = imageName;
    }

    @Override
    public Element clone() {
        return new Image(this.url);
    }

    @Override
    public void print() {
        System.out.println("Image name : " + this.url);
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
