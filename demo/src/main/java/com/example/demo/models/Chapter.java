package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> listOfSubChapters = new ArrayList<>();

    public Chapter () {
        this.name = null;
    }

    public Chapter(String name) {
        this.name = name;
    }

    public Chapter(String name, List<SubChapter> listOfSubChapters) {
        this.name = name;
        this.listOfSubChapters = listOfSubChapters;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        this.listOfSubChapters.add(subChapter);
        return this.listOfSubChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return this.listOfSubChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter name: " + this.name);
        for(SubChapter subChapter : this.listOfSubChapters) {
            subChapter.print();
        }
    }
}
