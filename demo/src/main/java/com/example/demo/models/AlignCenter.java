package com.example.demo.models;

public class AlignCenter implements AlignStrategy{
    @Override
    public String render(Paragraph paragraph) {
        return "#" + paragraph.getTextCopy() + "#";
    }
}
