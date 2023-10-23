package com.example.demo.models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> listOfElements = new ArrayList<>();

    public Section() {
        this.title = null;
    }

    public Section(String title) {
        this.title = title;
    }

    public Section(String title, List<Element> listOfElements) {
        this.title = title;
        this.listOfElements = listOfElements;
    }

    @Override
    public Element clone() {
        return new Section(this.title, this.listOfElements);
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element element : listOfElements) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        Element clonedElement = element.clone();
        this.listOfElements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.listOfElements.remove(element);
    }

    @Override
    public Element get(int index) {
        return this.listOfElements.get(index);
    }
}
