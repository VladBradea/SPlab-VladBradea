package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public interface Element {
    public Element clone();
    public void print();
    public void add(Element element);
    public void remove(Element element);
    public Element get(int index);

}
