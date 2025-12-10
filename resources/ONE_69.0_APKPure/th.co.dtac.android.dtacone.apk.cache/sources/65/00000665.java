package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.PageSizeCalculator;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Gk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17705Gk1 {

    /* renamed from: t */
    public static final Object f2070t = new Object();

    /* renamed from: a */
    public PdfDocument f2071a;

    /* renamed from: b */
    public PdfiumCore f2072b;

    /* renamed from: k */
    public boolean f2081k;

    /* renamed from: l */
    public int f2082l;

    /* renamed from: m */
    public boolean f2083m;

    /* renamed from: q */
    public final FitPolicy f2087q;

    /* renamed from: r */
    public final boolean f2088r;

    /* renamed from: s */
    public int[] f2089s;

    /* renamed from: c */
    public int f2073c = 0;

    /* renamed from: d */
    public List f2074d = new ArrayList();

    /* renamed from: e */
    public List f2075e = new ArrayList();

    /* renamed from: f */
    public SparseBooleanArray f2076f = new SparseBooleanArray();

    /* renamed from: g */
    public Size f2077g = new Size(0, 0);

    /* renamed from: h */
    public Size f2078h = new Size(0, 0);

    /* renamed from: i */
    public SizeF f2079i = new SizeF(0.0f, 0.0f);

    /* renamed from: j */
    public SizeF f2080j = new SizeF(0.0f, 0.0f);

    /* renamed from: n */
    public List f2084n = new ArrayList();

    /* renamed from: o */
    public List f2085o = new ArrayList();

    /* renamed from: p */
    public float f2086p = 0.0f;

    public C17705Gk1(PdfiumCore pdfiumCore, PdfDocument pdfDocument, FitPolicy fitPolicy, Size size, int[] iArr, boolean z, int i, boolean z2, boolean z3) {
        this.f2072b = pdfiumCore;
        this.f2071a = pdfDocument;
        this.f2087q = fitPolicy;
        this.f2089s = iArr;
        this.f2081k = z;
        this.f2082l = i;
        this.f2083m = z2;
        this.f2088r = z3;
        m68237A(size);
    }

    /* renamed from: A */
    public final void m68237A(Size size) {
        int[] iArr = this.f2089s;
        if (iArr != null) {
            this.f2073c = iArr.length;
        } else {
            this.f2073c = this.f2072b.getPageCount(this.f2071a);
        }
        for (int i = 0; i < this.f2073c; i++) {
            Size pageSize = this.f2072b.getPageSize(this.f2071a, m68234c(i));
            if (pageSize.getWidth() > this.f2077g.getWidth()) {
                this.f2077g = pageSize;
            }
            if (pageSize.getHeight() > this.f2078h.getHeight()) {
                this.f2078h = pageSize;
            }
            this.f2074d.add(pageSize);
        }
        m68212y(size);
    }

    /* renamed from: a */
    public int m68236a(int i) {
        int m68221p;
        if (i <= 0) {
            return 0;
        }
        int[] iArr = this.f2089s;
        if (iArr != null) {
            if (i >= iArr.length) {
                m68221p = iArr.length;
                return m68221p - 1;
            }
            return i;
        }
        if (i >= m68221p()) {
            m68221p = m68221p();
            return m68221p - 1;
        }
        return i;
    }

    /* renamed from: b */
    public void m68235b() {
        PdfDocument pdfDocument;
        PdfiumCore pdfiumCore = this.f2072b;
        if (pdfiumCore != null && (pdfDocument = this.f2071a) != null) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.f2071a = null;
        this.f2089s = null;
    }

    /* renamed from: c */
    public int m68234c(int i) {
        int i2;
        int[] iArr = this.f2089s;
        if (iArr != null) {
            if (i < 0 || i >= iArr.length) {
                return -1;
            }
            i2 = iArr[i];
        } else {
            i2 = i;
        }
        if (i2 < 0 || i >= m68221p()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: d */
    public List m68233d() {
        PdfDocument pdfDocument = this.f2071a;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.f2072b.getTableOfContents(pdfDocument);
    }

    /* renamed from: e */
    public float m68232e(float f) {
        return this.f2086p * f;
    }

    /* renamed from: f */
    public float m68231f() {
        return m68230g().getHeight();
    }

    /* renamed from: g */
    public SizeF m68230g() {
        if (this.f2081k) {
            return this.f2080j;
        }
        return this.f2079i;
    }

    /* renamed from: h */
    public float m68229h() {
        return m68230g().getWidth();
    }

    /* renamed from: i */
    public PdfDocument.Meta m68228i() {
        PdfDocument pdfDocument = this.f2071a;
        if (pdfDocument == null) {
            return null;
        }
        return this.f2072b.getDocumentMeta(pdfDocument);
    }

    /* renamed from: j */
    public int m68227j(float f, float f2) {
        int i = 0;
        for (int i2 = 0; i2 < m68221p() && (((Float) this.f2084n.get(i2)).floatValue() * f2) - (m68222o(i2, f2) / 2.0f) < f; i2++) {
            i++;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    public float m68226k(int i, float f) {
        float width;
        SizeF m68223n = m68223n(i);
        if (this.f2081k) {
            width = m68223n.getHeight();
        } else {
            width = m68223n.getWidth();
        }
        return width * f;
    }

    /* renamed from: l */
    public List m68225l(int i) {
        return this.f2072b.getPageLinks(this.f2071a, m68234c(i));
    }

    /* renamed from: m */
    public float m68224m(int i, float f) {
        if (m68234c(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.f2084n.get(i)).floatValue() * f;
    }

    /* renamed from: n */
    public SizeF m68223n(int i) {
        if (m68234c(i) < 0) {
            return new SizeF(0.0f, 0.0f);
        }
        return (SizeF) this.f2075e.get(i);
    }

    /* renamed from: o */
    public float m68222o(int i, float f) {
        float f2;
        if (this.f2083m) {
            f2 = ((Float) this.f2085o.get(i)).floatValue();
        } else {
            f2 = this.f2082l;
        }
        return f2 * f;
    }

    /* renamed from: p */
    public int m68221p() {
        return this.f2073c;
    }

    /* renamed from: q */
    public SizeF m68220q(int i, float f) {
        SizeF m68223n = m68223n(i);
        return new SizeF(m68223n.getWidth() * f, m68223n.getHeight() * f);
    }

    /* renamed from: r */
    public float m68219r(int i, float f) {
        float m68231f;
        float height;
        SizeF m68223n = m68223n(i);
        if (this.f2081k) {
            m68231f = m68229h();
            height = m68223n.getWidth();
        } else {
            m68231f = m68231f();
            height = m68223n.getHeight();
        }
        return (f * (m68231f - height)) / 2.0f;
    }

    /* renamed from: s */
    public RectF m68218s(int i, int i2, int i3, int i4, int i5, RectF rectF) {
        return this.f2072b.mapRectToDevice(this.f2071a, m68234c(i), i2, i3, i4, i5, 0, rectF);
    }

    /* renamed from: t */
    public boolean m68217t(int i) {
        int m68234c = m68234c(i);
        if (m68234c < 0) {
            return false;
        }
        synchronized (f2070t) {
            try {
                if (this.f2076f.indexOfKey(m68234c) >= 0) {
                    return false;
                }
                try {
                    this.f2072b.openPage(this.f2071a, m68234c);
                    this.f2076f.put(m68234c, true);
                    return true;
                } catch (Exception e) {
                    this.f2076f.put(m68234c, false);
                    throw new PageRenderingException(i, e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public boolean m68216u(int i) {
        return !this.f2076f.get(m68234c(i), false);
    }

    /* renamed from: v */
    public final void m68215v(Size size) {
        float width;
        float width2;
        this.f2085o.clear();
        for (int i = 0; i < m68221p(); i++) {
            SizeF sizeF = (SizeF) this.f2075e.get(i);
            if (this.f2081k) {
                width = size.getHeight();
                width2 = sizeF.getHeight();
            } else {
                width = size.getWidth();
                width2 = sizeF.getWidth();
            }
            float max = Math.max(0.0f, width - width2);
            if (i < m68221p() - 1) {
                max += this.f2082l;
            }
            this.f2085o.add(Float.valueOf(max));
        }
    }

    /* renamed from: w */
    public final void m68214w() {
        float width;
        float f;
        float f2 = 0.0f;
        for (int i = 0; i < m68221p(); i++) {
            SizeF sizeF = (SizeF) this.f2075e.get(i);
            if (this.f2081k) {
                width = sizeF.getHeight();
            } else {
                width = sizeF.getWidth();
            }
            f2 += width;
            if (this.f2083m) {
                f = ((Float) this.f2085o.get(i)).floatValue();
            } else if (i < m68221p() - 1) {
                f = this.f2082l;
            }
            f2 += f;
        }
        this.f2086p = f2;
    }

    /* renamed from: x */
    public final void m68213x() {
        float width;
        float f;
        this.f2084n.clear();
        float f2 = 0.0f;
        for (int i = 0; i < m68221p(); i++) {
            SizeF sizeF = (SizeF) this.f2075e.get(i);
            if (this.f2081k) {
                width = sizeF.getHeight();
            } else {
                width = sizeF.getWidth();
            }
            if (this.f2083m) {
                f2 += ((Float) this.f2085o.get(i)).floatValue() / 2.0f;
                if (i == 0) {
                    f2 -= this.f2082l / 2.0f;
                } else if (i == m68221p() - 1) {
                    f2 += this.f2082l / 2.0f;
                }
                this.f2084n.add(Float.valueOf(f2));
                f = ((Float) this.f2085o.get(i)).floatValue() / 2.0f;
            } else {
                this.f2084n.add(Float.valueOf(f2));
                f = this.f2082l;
            }
            f2 += width + f;
        }
    }

    /* renamed from: y */
    public void m68212y(Size size) {
        this.f2075e.clear();
        PageSizeCalculator pageSizeCalculator = new PageSizeCalculator(this.f2087q, this.f2077g, this.f2078h, size, this.f2088r);
        this.f2080j = pageSizeCalculator.getOptimalMaxWidthPageSize();
        this.f2079i = pageSizeCalculator.getOptimalMaxHeightPageSize();
        for (Size size2 : this.f2074d) {
            this.f2075e.add(pageSizeCalculator.calculate(size2));
        }
        if (this.f2083m) {
            m68215v(size);
        }
        m68214w();
        m68213x();
    }

    /* renamed from: z */
    public void m68211z(Bitmap bitmap, int i, Rect rect, boolean z) {
        this.f2072b.renderPageBitmap(this.f2071a, bitmap, m68234c(i), rect.left, rect.top, rect.width(), rect.height(), z);
    }
}