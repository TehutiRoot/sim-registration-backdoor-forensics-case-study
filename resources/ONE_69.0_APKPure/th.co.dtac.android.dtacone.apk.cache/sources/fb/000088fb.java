package com.github.barteksc.pdfviewer.util;

import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* loaded from: classes3.dex */
public class PageSizeCalculator {

    /* renamed from: a */
    public FitPolicy f43698a;

    /* renamed from: b */
    public final Size f43699b;

    /* renamed from: c */
    public final Size f43700c;

    /* renamed from: d */
    public final Size f43701d;

    /* renamed from: e */
    public SizeF f43702e;

    /* renamed from: f */
    public SizeF f43703f;

    /* renamed from: g */
    public float f43704g;

    /* renamed from: h */
    public float f43705h;

    /* renamed from: i */
    public boolean f43706i;

    /* renamed from: com.github.barteksc.pdfviewer.util.PageSizeCalculator$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6157a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43707a;

        static {
            int[] iArr = new int[FitPolicy.values().length];
            f43707a = iArr;
            try {
                iArr[FitPolicy.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43707a[FitPolicy.BOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PageSizeCalculator(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z) {
        this.f43698a = fitPolicy;
        this.f43699b = size;
        this.f43700c = size2;
        this.f43701d = size3;
        this.f43706i = z;
        m49300a();
    }

    /* renamed from: a */
    public final void m49300a() {
        int i = C6157a.f43707a[this.f43698a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                SizeF m49297d = m49297d(this.f43699b, this.f43701d.getWidth());
                this.f43702e = m49297d;
                this.f43704g = m49297d.getWidth() / this.f43699b.getWidth();
                Size size = this.f43700c;
                this.f43703f = m49297d(size, size.getWidth() * this.f43704g);
                return;
            }
            float width = m49299b(this.f43699b, this.f43701d.getWidth(), this.f43701d.getHeight()).getWidth() / this.f43699b.getWidth();
            Size size2 = this.f43700c;
            SizeF m49299b = m49299b(size2, size2.getWidth() * width, this.f43701d.getHeight());
            this.f43703f = m49299b;
            this.f43705h = m49299b.getHeight() / this.f43700c.getHeight();
            SizeF m49299b2 = m49299b(this.f43699b, this.f43701d.getWidth(), this.f43699b.getHeight() * this.f43705h);
            this.f43702e = m49299b2;
            this.f43704g = m49299b2.getWidth() / this.f43699b.getWidth();
            return;
        }
        SizeF m49298c = m49298c(this.f43700c, this.f43701d.getHeight());
        this.f43703f = m49298c;
        this.f43705h = m49298c.getHeight() / this.f43700c.getHeight();
        Size size3 = this.f43699b;
        this.f43702e = m49298c(size3, size3.getHeight() * this.f43705h);
    }

    /* renamed from: b */
    public final SizeF m49299b(Size size, float f, float f2) {
        float width = size.getWidth() / size.getHeight();
        float floor = (float) Math.floor(f / width);
        if (floor > f2) {
            f = (float) Math.floor(width * f2);
        } else {
            f2 = floor;
        }
        return new SizeF(f, f2);
    }

    /* renamed from: c */
    public final SizeF m49298c(Size size, float f) {
        return new SizeF((float) Math.floor(f / (size.getHeight() / size.getWidth())), f);
    }

    public SizeF calculate(Size size) {
        float width;
        float height;
        if (size.getWidth() > 0 && size.getHeight() > 0) {
            if (this.f43706i) {
                width = this.f43701d.getWidth();
            } else {
                width = size.getWidth() * this.f43704g;
            }
            if (this.f43706i) {
                height = this.f43701d.getHeight();
            } else {
                height = size.getHeight() * this.f43705h;
            }
            int i = C6157a.f43707a[this.f43698a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m49297d(size, width);
                }
                return m49299b(size, width, height);
            }
            return m49298c(size, height);
        }
        return new SizeF(0.0f, 0.0f);
    }

    /* renamed from: d */
    public final SizeF m49297d(Size size, float f) {
        return new SizeF(f, (float) Math.floor(f / (size.getWidth() / size.getHeight())));
    }

    public SizeF getOptimalMaxHeightPageSize() {
        return this.f43703f;
    }

    public SizeF getOptimalMaxWidthPageSize() {
        return this.f43702e;
    }
}