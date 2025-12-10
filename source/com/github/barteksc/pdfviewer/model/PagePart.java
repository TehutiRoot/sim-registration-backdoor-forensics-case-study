package com.github.barteksc.pdfviewer.model;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class PagePart {

    /* renamed from: a */
    public int f43669a;

    /* renamed from: b */
    public Bitmap f43670b;

    /* renamed from: c */
    public RectF f43671c;

    /* renamed from: d */
    public boolean f43672d;

    /* renamed from: e */
    public int f43673e;

    public PagePart(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.f43669a = i;
        this.f43670b = bitmap;
        this.f43671c = rectF;
        this.f43672d = z;
        this.f43673e = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagePart)) {
            return false;
        }
        PagePart pagePart = (PagePart) obj;
        if (pagePart.getPage() != this.f43669a || pagePart.getPageRelativeBounds().left != this.f43671c.left || pagePart.getPageRelativeBounds().right != this.f43671c.right || pagePart.getPageRelativeBounds().top != this.f43671c.top || pagePart.getPageRelativeBounds().bottom != this.f43671c.bottom) {
            return false;
        }
        return true;
    }

    public int getCacheOrder() {
        return this.f43673e;
    }

    public int getPage() {
        return this.f43669a;
    }

    public RectF getPageRelativeBounds() {
        return this.f43671c;
    }

    public Bitmap getRenderedBitmap() {
        return this.f43670b;
    }

    public boolean isThumbnail() {
        return this.f43672d;
    }

    public void setCacheOrder(int i) {
        this.f43673e = i;
    }
}
