package com.example.demo.models;

public class ImageProxy implements Element, Picture{
    private final String url;
    private  Image image;



    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public String url() {
        String copyUrl = this.url;
        return copyUrl;
    }

    public Image loadImage() {
        if(this.image == null) {
            this.image = new Image(this.url);
        }
        return this.image;
    }

    @Override
    public void print() {
        loadImage().print();
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
