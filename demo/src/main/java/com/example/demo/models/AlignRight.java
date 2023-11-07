package com.example.demo.models;

public class AlignRight implements AlignStrategy{
    @Override
    public String render(Paragraph paragraph) {
        return paragraph.getTextCopy() + "#";
    }
}
