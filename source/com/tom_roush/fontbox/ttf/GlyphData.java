package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import com.tom_roush.fontbox.util.BoundingBox;

/* loaded from: classes5.dex */
public class GlyphData {

    /* renamed from: a */
    public short f59411a;

    /* renamed from: b */
    public short f59412b;

    /* renamed from: c */
    public short f59413c;

    /* renamed from: d */
    public short f59414d;

    /* renamed from: f */
    public short f59416f;

    /* renamed from: e */
    public BoundingBox f59415e = null;

    /* renamed from: g */
    public GlyfDescript f59417g = null;

    /* renamed from: a */
    public void m32930a(GlyphTable glyphTable, AbstractC22790wQ1 abstractC22790wQ1, int i) {
        this.f59416f = abstractC22790wQ1.mo851m();
        this.f59411a = abstractC22790wQ1.mo851m();
        this.f59412b = abstractC22790wQ1.mo851m();
        this.f59413c = abstractC22790wQ1.mo851m();
        short mo851m = abstractC22790wQ1.mo851m();
        this.f59414d = mo851m;
        this.f59415e = new BoundingBox(this.f59411a, this.f59412b, this.f59413c, mo851m);
        short s = this.f59416f;
        if (s >= 0) {
            this.f59417g = new GlyfSimpleDescript(s, abstractC22790wQ1, (short) (i - this.f59411a));
        } else {
            this.f59417g = new GlyfCompositeDescript(abstractC22790wQ1, glyphTable);
        }
    }

    /* renamed from: b */
    public void m32929b() {
        this.f59417g = new GlyfSimpleDescript();
        this.f59415e = new BoundingBox();
    }

    public BoundingBox getBoundingBox() {
        return this.f59415e;
    }

    public GlyphDescription getDescription() {
        return this.f59417g;
    }

    public short getNumberOfContours() {
        return this.f59416f;
    }

    public Path getPath() {
        return new C22217t60(this.f59417g).m22510c();
    }

    public short getXMaximum() {
        return this.f59413c;
    }

    public short getXMinimum() {
        return this.f59411a;
    }

    public short getYMaximum() {
        return this.f59414d;
    }

    public short getYMinimum() {
        return this.f59412b;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.f59415e = boundingBox;
    }

    public void setNumberOfContours(short s) {
        this.f59416f = s;
    }
}
