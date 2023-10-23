package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> listOfAuthors = new ArrayList<>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        this.listOfAuthors.add(author);
    }

    public void addContent(Element element) {
        super.add(element);
    }

    public void print() {
        for (Author author : listOfAuthors) {
            author.print();
        }
        System.out.print("Book title: ");
        super.print();
    }



}
