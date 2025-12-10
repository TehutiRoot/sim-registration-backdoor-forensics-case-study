package com.github.barteksc.pdfviewer.model;

import android.graphics.RectF;
import com.shockwave.pdfium.PdfDocument;

/* loaded from: classes3.dex */
public class LinkTapEvent {

    /* renamed from: a */
    public float f43663a;

    /* renamed from: b */
    public float f43664b;

    /* renamed from: c */
    public float f43665c;

    /* renamed from: d */
    public float f43666d;

    /* renamed from: e */
    public RectF f43667e;

    /* renamed from: f */
    public PdfDocument.Link f43668f;

    public LinkTapEvent(float f, float f2, float f3, float f4, RectF rectF, PdfDocument.Link link) {
        this.f43663a = f;
        this.f43664b = f2;
        this.f43665c = f3;
        this.f43666d = f4;
        this.f43667e = rectF;
        this.f43668f = link;
    }

    public float getDocumentX() {
        return this.f43665c;
    }

    public float getDocumentY() {
        return this.f43666d;
    }

    public PdfDocument.Link getLink() {
        return this.f43668f;
    }

    public RectF getMappedLinkRect() {
        return this.f43667e;
    }

    public float getOriginalX() {
        return this.f43663a;
    }

    public float getOriginalY() {
        return this.f43664b;
    }
}
