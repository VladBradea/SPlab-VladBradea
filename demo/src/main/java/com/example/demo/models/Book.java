package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author author;
    private List<Chapter> listOfChapters = new ArrayList<>();

    public Book() {
        this.title = null;
        this.author = null;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, Author author, List<Chapter> listOfChapters) {
        this.title = title;
        this.author = author;
        this.listOfChapters = listOfChapters;
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

    public void print() {
        System.out.println("Book title: " + this.title);
        this.author.print();
        for(Chapter chapter : this.listOfChapters) {
            chapter.print();
        }
    }


}
