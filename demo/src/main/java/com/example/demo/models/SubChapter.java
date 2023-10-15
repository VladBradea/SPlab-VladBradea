package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> listOfImages = new ArrayList<>();
    private List<Paragraph> listOfParagraphs = new ArrayList<>();
    private List<Table> listOfTables = new ArrayList<>();

    public SubChapter () {
        this.name = null;
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public SubChapter(String name, List<Image> listOfImages, List<Paragraph> listOfParagraphs,
                      List<Table> listOfTables) {
        this.name = name;
        this.listOfImages = listOfImages;
        this.listOfParagraphs = listOfParagraphs;
        this.listOfTables = listOfTables;
    }

    public void createNewParagraph(String text) {
        this.listOfParagraphs.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        this.listOfImages.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        this.listOfTables.add(new Table(title));
    }

    public void print () {
        System.out.println("SubChapter: " + this.name);
        for(Paragraph paragraph : this.listOfParagraphs) {
            paragraph.print();
        }
        for(Image image : this.listOfImages) {
            image.print();
        }
        for(Table table : this.listOfTables) {
            table.print();
        }
    }


}
