package com.github.barteksc.pdfviewer.model;

import android.graphics.RectF;
import com.shockwave.pdfium.PdfDocument;

/* loaded from: classes3.dex */
public class LinkTapEvent {

    /* renamed from: a */
    public float f43675a;

    /* renamed from: b */
    public float f43676b;

    /* renamed from: c */
    public float f43677c;

    /* renamed from: d */
    public float f43678d;

    /* renamed from: e */
    public RectF f43679e;

    /* renamed from: f */
    public PdfDocument.Link f43680f;

    public LinkTapEvent(float f, float f2, float f3, float f4, RectF rectF, PdfDocument.Link link) {
        this.f43675a = f;
        this.f43676b = f2;
        this.f43677c = f3;
        this.f43678d = f4;
        this.f43679e = rectF;
        this.f43680f = link;
    }

    public float getDocumentX() {
        return this.f43677c;
    }

    public float getDocumentY() {
        return this.f43678d;
    }

    public PdfDocument.Link getLink() {
        return this.f43680f;
    }

    public RectF getMappedLinkRect() {
        return this.f43679e;
    }

    public float getOriginalX() {
        return this.f43675a;
    }

    public float getOriginalY() {
        return this.f43676b;
    }
}