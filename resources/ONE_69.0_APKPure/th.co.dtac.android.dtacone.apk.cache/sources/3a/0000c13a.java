package com.tom_roush.pdfbox.filter;

import android.graphics.Rect;

/* loaded from: classes5.dex */
public class DecodeOptions {
    public static final DecodeOptions DEFAULT = new C9891a(true);

    /* renamed from: a */
    public Rect f59881a;

    /* renamed from: b */
    public int f59882b;

    /* renamed from: c */
    public int f59883c;

    /* renamed from: d */
    public int f59884d;

    /* renamed from: e */
    public int f59885e;

    /* renamed from: f */
    public boolean f59886f;

    /* renamed from: com.tom_roush.pdfbox.filter.DecodeOptions$a */
    /* loaded from: classes5.dex */
    public static class C9891a extends DecodeOptions {
        public C9891a(boolean z) {
            super.m32773a(z);
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
        this.f59881a = null;
        this.f59882b = 1;
        this.f59883c = 1;
        this.f59884d = 0;
        this.f59885e = 0;
        this.f59886f = false;
    }

    /* renamed from: a */
    public void m32773a(boolean z) {
        this.f59886f = z;
    }

    public Rect getSourceRegion() {
        return this.f59881a;
    }

    public int getSubsamplingOffsetX() {
        return this.f59884d;
    }

    public int getSubsamplingOffsetY() {
        return this.f59885e;
    }

    public int getSubsamplingX() {
        return this.f59882b;
    }

    public int getSubsamplingY() {
        return this.f59883c;
    }

    public boolean isFilterSubsampled() {
        return this.f59886f;
    }

    public void setSourceRegion(Rect rect) {
        this.f59881a = rect;
    }

    public void setSubsamplingOffsetX(int i) {
        this.f59884d = i;
    }

    public void setSubsamplingOffsetY(int i) {
        this.f59885e = i;
    }

    public void setSubsamplingX(int i) {
        this.f59882b = i;
    }

    public void setSubsamplingY(int i) {
        this.f59883c = i;
    }

    public DecodeOptions(Rect rect) {
        this.f59882b = 1;
        this.f59883c = 1;
        this.f59884d = 0;
        this.f59885e = 0;
        this.f59886f = false;
        this.f59881a = rect;
    }

    public DecodeOptions(int i, int i2, int i3, int i4) {
        this(new Rect(i, i2, i3, i4));
    }

    public DecodeOptions(int i) {
        this.f59881a = null;
        this.f59884d = 0;
        this.f59885e = 0;
        this.f59886f = false;
        this.f59882b = i;
        this.f59883c = i;
    }
}