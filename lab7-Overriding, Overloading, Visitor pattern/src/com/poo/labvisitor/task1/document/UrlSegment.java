package com.poo.labvisitor.task1.document;

public class UrlSegment extends TextSegment{

    private String url;

    //private String description;
    public UrlSegment(String url, String content) {
        super(content);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public UrlSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
