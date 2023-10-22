package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private final List<Chapter> listOfChapters = new ArrayList<>();
    private TableOfContents tableOfContents;

    public Book() {
        this.title = null;
        this.author = null;
        tableOfContents = createTableOfContents();
    }

    public Book(String title) {
        this.title = title;
        tableOfContents = createTableOfContents();
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        this.listOfChapters.add(chapter);
        return this.listOfChapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return this.listOfChapters.get(index);
    }

    public List<Chapter> getListOfChapters() {
        List<Chapter> chapterList = this.listOfChapters;
        return chapterList;
    }

    public TableOfContents createTableOfContents() {
        return new TableOfContents(this);
    }

    public void print() {
        System.out.println("Book title: " + this.title);
        this.author.print();
    }



}
