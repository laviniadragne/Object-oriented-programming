package com.poo.labvisitor.task1;

import com.poo.labvisitor.task1.document.DokuWikiVisitor;
import com.poo.labvisitor.task1.document.MarkdownVisitor;
import com.poo.labvisitor.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments

        DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for (TextSegment segment : textSegments) {
            segment.accept(dokuWikiVisitor);
        }
        return dokuWikiVisitor.getDocument();

    }


    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments

        MarkdownVisitor markdownVisitor = new MarkdownVisitor();
        for (TextSegment segment : textSegments) {
            segment.accept(markdownVisitor);
        }
        return markdownVisitor.getDocument();
    }
}
