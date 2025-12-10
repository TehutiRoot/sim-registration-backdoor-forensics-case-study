package com.tom_roush.pdfbox.filter;

import android.graphics.Rect;

/* loaded from: classes5.dex */
public class DecodeOptions {
    public static final DecodeOptions DEFAULT = new C9902a(true);

    /* renamed from: a */
    public Rect f59869a;

    /* renamed from: b */
    public int f59870b;

    /* renamed from: c */
    public int f59871c;

    /* renamed from: d */
    public int f59872d;

    /* renamed from: e */
    public int f59873e;

    /* renamed from: f */
    public boolean f59874f;

    /* renamed from: com.tom_roush.pdfbox.filter.DecodeOptions$a */
    /* loaded from: classes5.dex */
    public static class C9902a extends DecodeOptions {
        public C9902a(boolean z) {
            super.m32781a(z);
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSourceRegion(Rect rect) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingOffsetX(int i) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingOffsetY(int i) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingX(int i) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }

        @Override // com.tom_roush.pdfbox.filter.DecodeOptions
        public void setSubsamplingY(int i) {
            throw new UnsupportedOperationException("This instance may not be modified.");
        }
    }

    public DecodeOptions() {
        this.f59869a = null;
        this.f59870b = 1;
        this.f59871c = 1;
        this.f59872d = 0;
        this.f59873e = 0;
        this.f59874f = false;
    }

    /* renamed from: a */
    public void m32781a(boolean z) {
        this.f59874f = z;
    }

    public Rect getSourceRegion() {
        return this.f59869a;
    }

    public int getSubsamplingOffsetX() {
        return this.f59872d;
    }

    public int getSubsamplingOffsetY() {
        return this.f59873e;
    }

    public int getSubsamplingX() {
        return this.f59870b;
    }

    public int getSubsamplingY() {
        return this.f59871c;
    }

    public boolean isFilterSubsampled() {
        return this.f59874f;
    }

    public void setSourceRegion(Rect rect) {
        this.f59869a = rect;
    }

    public void setSubsamplingOffsetX(int i) {
        this.f59872d = i;
    }

    public void setSubsamplingOffsetY(int i) {
        this.f59873e = i;
    }

    public void setSubsamplingX(int i) {
        this.f59870b = i;
    }

    public void setSubsamplingY(int i) {
        this.f59871c = i;
    }

    public DecodeOptions(Rect rect) {
        this.f59870b = 1;
        this.f59871c = 1;
        this.f59872d = 0;
        this.f59873e = 0;
        this.f59874f = false;
        this.f59869a = rect;
    }

    public DecodeOptions(int i, int i2, int i3, int i4) {
        this(new Rect(i, i2, i3, i4));
    }

    public DecodeOptions(int i) {
        this.f59869a = null;
        this.f59872d = 0;
        this.f59873e = 0;
        this.f59874f = false;
        this.f59870b = i;
        this.f59871c = i;
    }
}
