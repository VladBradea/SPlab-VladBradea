package com.example.demo.models;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String url;

    public Image() {
        this.url = null;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image(String imageName) {
        this.url = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image name : " + this.url);
    }

    @Override
    public String url() {
        String copyUrl = this.url;
        return copyUrl;
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
