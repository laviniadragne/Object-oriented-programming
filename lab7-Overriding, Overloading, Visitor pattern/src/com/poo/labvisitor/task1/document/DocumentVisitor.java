package com.poo.labvisitor.task1.document;

public interface DocumentVisitor {
    public void visit(ItalicTextSegment italicTextSegment);
    public void visit(BoldTextSegment boldTextSegment);
    public void visit(UrlSegment urlSegment);
    public void visit(PlainTextSegment plainTextSegment);
    public StringBuilder getDocument();

}
