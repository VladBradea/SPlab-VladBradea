package com.example.demo.models;

public class TableOfContents {
    private final Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void print() {
        for(Chapter chapter : this.book.getListOfChapters()) {
            chapter.print();
        }
    }
}
