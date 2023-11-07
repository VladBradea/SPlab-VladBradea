package com.example.demo.models;

public class AlignLeft implements AlignStrategy{
    @Override
    public String render(Paragraph paragraph) {
        return "#" + paragraph.getTextCopy();
    }
}
