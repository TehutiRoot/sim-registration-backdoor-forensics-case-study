package com.github.barteksc.pdfviewer.exception;

/* loaded from: classes3.dex */
public class PageRenderingException extends Exception {
    private final int page;

    public PageRenderingException(int i, Throwable th2) {
        super(th2);
        this.page = i;
    }

    public int getPage() {
        return this.page;
    }
}