package com.poo.labvisitor.task1.document;

public class MarkdownVisitor implements DocumentVisitor{

    private StringBuilder string = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        string.append("*");
        string.append(italicTextSegment.getContent());
        string.append("*");
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        string.append("**");
        string.append(boldTextSegment.getContent());
        string.append("**");

    }

    @Override
    public void visit(UrlSegment urlSegment) {
        string.append("[");
        string.append(urlSegment.getContent());
        string.append("](");
        string.append(urlSegment.getUrl());
        string.append(")");
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        string.append(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
       return string;
    }
}
