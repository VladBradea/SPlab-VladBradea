package com.example.demo.models;

public class Image {
    private String imageName;

    public Image() {
        this.imageName = null;
    }

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image name : " + this.imageName);
    }

}
