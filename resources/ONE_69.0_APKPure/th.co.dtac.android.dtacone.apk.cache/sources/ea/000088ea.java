package com.github.barteksc.pdfviewer.model;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class PagePart {

    /* renamed from: a */
    public int f43681a;

    /* renamed from: b */
    public Bitmap f43682b;

    /* renamed from: c */
    public RectF f43683c;

    /* renamed from: d */
    public boolean f43684d;

    /* renamed from: e */
    public int f43685e;

    public PagePart(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.f43681a = i;
        this.f43682b = bitmap;
        this.f43683c = rectF;
        this.f43684d = z;
        this.f43685e = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagePart)) {
            return false;
        }
        PagePart pagePart = (PagePart) obj;
        if (pagePart.getPage() != this.f43681a || pagePart.getPageRelativeBounds().left != this.f43683c.left || pagePart.getPageRelativeBounds().right != this.f43683c.right || pagePart.getPageRelativeBounds().top != this.f43683c.top || pagePart.getPageRelativeBounds().bottom != this.f43683c.bottom) {
            return false;
        }
        return true;
    }

    public int getCacheOrder() {
        return this.f43685e;
    }

    public int getPage() {
        return this.f43681a;
    }

    public RectF getPageRelativeBounds() {
        return this.f43683c;
    }

    public Bitmap getRenderedBitmap() {
        return this.f43682b;
    }

    public boolean isThumbnail() {
        return this.f43684d;
    }

    public void setCacheOrder(int i) {
        this.f43685e = i;
    }
}