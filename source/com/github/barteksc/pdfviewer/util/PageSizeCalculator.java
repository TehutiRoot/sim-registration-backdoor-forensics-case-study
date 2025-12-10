package com.github.barteksc.pdfviewer.util;

import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* loaded from: classes3.dex */
public class PageSizeCalculator {

    /* renamed from: a */
    public FitPolicy f43686a;

    /* renamed from: b */
    public final Size f43687b;

    /* renamed from: c */
    public final Size f43688c;

    /* renamed from: d */
    public final Size f43689d;

    /* renamed from: e */
    public SizeF f43690e;

    /* renamed from: f */
    public SizeF f43691f;

    /* renamed from: g */
    public float f43692g;

    /* renamed from: h */
    public float f43693h;

    /* renamed from: i */
    public boolean f43694i;

    /* renamed from: com.github.barteksc.pdfviewer.util.PageSizeCalculator$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6168a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43695a;

        static {
            int[] iArr = new int[FitPolicy.values().length];
            f43695a = iArr;
            try {
                iArr[FitPolicy.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43695a[FitPolicy.BOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PageSizeCalculator(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z) {
        this.f43686a = fitPolicy;
        this.f43687b = size;
        this.f43688c = size2;
        this.f43689d = size3;
        this.f43694i = z;
        m49303a();
    }

    /* renamed from: a */
    public final void m49303a() {
        int i = C6168a.f43695a[this.f43686a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                SizeF m49300d = m49300d(this.f43687b, this.f43689d.getWidth());
                this.f43690e = m49300d;
                this.f43692g = m49300d.getWidth() / this.f43687b.getWidth();
                Size size = this.f43688c;
                this.f43691f = m49300d(size, size.getWidth() * this.f43692g);
                return;
            }
            float width = m49302b(this.f43687b, this.f43689d.getWidth(), this.f43689d.getHeight()).getWidth() / this.f43687b.getWidth();
            Size size2 = this.f43688c;
            SizeF m49302b = m49302b(size2, size2.getWidth() * width, this.f43689d.getHeight());
            this.f43691f = m49302b;
            this.f43693h = m49302b.getHeight() / this.f43688c.getHeight();
            SizeF m49302b2 = m49302b(this.f43687b, this.f43689d.getWidth(), this.f43687b.getHeight() * this.f43693h);
            this.f43690e = m49302b2;
            this.f43692g = m49302b2.getWidth() / this.f43687b.getWidth();
            return;
        }
        SizeF m49301c = m49301c(this.f43688c, this.f43689d.getHeight());
        this.f43691f = m49301c;
        this.f43693h = m49301c.getHeight() / this.f43688c.getHeight();
        Size size3 = this.f43687b;
        this.f43690e = m49301c(size3, size3.getHeight() * this.f43693h);
    }

    /* renamed from: b */
    public final SizeF m49302b(Size size, float f, float f2) {
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
    public final SizeF m49301c(Size size, float f) {
        return new SizeF((float) Math.floor(f / (size.getHeight() / size.getWidth())), f);
    }

    public SizeF calculate(Size size) {
        float width;
        float height;
        if (size.getWidth() > 0 && size.getHeight() > 0) {
            if (this.f43694i) {
                width = this.f43689d.getWidth();
            } else {
                width = size.getWidth() * this.f43692g;
            }
            if (this.f43694i) {
                height = this.f43689d.getHeight();
            } else {
                height = size.getHeight() * this.f43693h;
            }
            int i = C6168a.f43695a[this.f43686a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m49300d(size, width);
                }
                return m49302b(size, width, height);
            }
            return m49301c(size, height);
        }
        return new SizeF(0.0f, 0.0f);
    }

    /* renamed from: d */
    public final SizeF m49300d(Size size, float f) {
        return new SizeF(f, (float) Math.floor(f / (size.getWidth() / size.getHeight())));
    }

    public SizeF getOptimalMaxHeightPageSize() {
        return this.f43691f;
    }

    public SizeF getOptimalMaxWidthPageSize() {
        return this.f43690e;
    }
}
