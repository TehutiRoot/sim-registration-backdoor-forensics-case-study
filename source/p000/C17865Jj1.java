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

/* renamed from: Jj1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17865Jj1 {

    /* renamed from: t */
    public static final Object f2891t = new Object();

    /* renamed from: a */
    public PdfDocument f2892a;

    /* renamed from: b */
    public PdfiumCore f2893b;

    /* renamed from: k */
    public boolean f2902k;

    /* renamed from: l */
    public int f2903l;

    /* renamed from: m */
    public boolean f2904m;

    /* renamed from: q */
    public final FitPolicy f2908q;

    /* renamed from: r */
    public final boolean f2909r;

    /* renamed from: s */
    public int[] f2910s;

    /* renamed from: c */
    public int f2894c = 0;

    /* renamed from: d */
    public List f2895d = new ArrayList();

    /* renamed from: e */
    public List f2896e = new ArrayList();

    /* renamed from: f */
    public SparseBooleanArray f2897f = new SparseBooleanArray();

    /* renamed from: g */
    public Size f2898g = new Size(0, 0);

    /* renamed from: h */
    public Size f2899h = new Size(0, 0);

    /* renamed from: i */
    public SizeF f2900i = new SizeF(0.0f, 0.0f);

    /* renamed from: j */
    public SizeF f2901j = new SizeF(0.0f, 0.0f);

    /* renamed from: n */
    public List f2905n = new ArrayList();

    /* renamed from: o */
    public List f2906o = new ArrayList();

    /* renamed from: p */
    public float f2907p = 0.0f;

    public C17865Jj1(PdfiumCore pdfiumCore, PdfDocument pdfDocument, FitPolicy fitPolicy, Size size, int[] iArr, boolean z, int i, boolean z2, boolean z3) {
        this.f2893b = pdfiumCore;
        this.f2892a = pdfDocument;
        this.f2908q = fitPolicy;
        this.f2910s = iArr;
        this.f2902k = z;
        this.f2903l = i;
        this.f2904m = z2;
        this.f2909r = z3;
        m67717A(size);
    }

    /* renamed from: A */
    public final void m67717A(Size size) {
        int[] iArr = this.f2910s;
        if (iArr != null) {
            this.f2894c = iArr.length;
        } else {
            this.f2894c = this.f2893b.getPageCount(this.f2892a);
        }
        for (int i = 0; i < this.f2894c; i++) {
            Size pageSize = this.f2893b.getPageSize(this.f2892a, m67714c(i));
            if (pageSize.getWidth() > this.f2898g.getWidth()) {
                this.f2898g = pageSize;
            }
            if (pageSize.getHeight() > this.f2899h.getHeight()) {
                this.f2899h = pageSize;
            }
            this.f2895d.add(pageSize);
        }
        m67692y(size);
    }

    /* renamed from: a */
    public int m67716a(int i) {
        int m67701p;
        if (i <= 0) {
            return 0;
        }
        int[] iArr = this.f2910s;
        if (iArr != null) {
            if (i >= iArr.length) {
                m67701p = iArr.length;
                return m67701p - 1;
            }
            return i;
        }
        if (i >= m67701p()) {
            m67701p = m67701p();
            return m67701p - 1;
        }
        return i;
    }

    /* renamed from: b */
    public void m67715b() {
        PdfDocument pdfDocument;
        PdfiumCore pdfiumCore = this.f2893b;
        if (pdfiumCore != null && (pdfDocument = this.f2892a) != null) {
            pdfiumCore.closeDocument(pdfDocument);
        }
        this.f2892a = null;
        this.f2910s = null;
    }

    /* renamed from: c */
    public int m67714c(int i) {
        int i2;
        int[] iArr = this.f2910s;
        if (iArr != null) {
            if (i < 0 || i >= iArr.length) {
                return -1;
            }
            i2 = iArr[i];
        } else {
            i2 = i;
        }
        if (i2 < 0 || i >= m67701p()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: d */
    public List m67713d() {
        PdfDocument pdfDocument = this.f2892a;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.f2893b.getTableOfContents(pdfDocument);
    }

    /* renamed from: e */
    public float m67712e(float f) {
        return this.f2907p * f;
    }

    /* renamed from: f */
    public float m67711f() {
        return m67710g().getHeight();
    }

    /* renamed from: g */
    public SizeF m67710g() {
        if (this.f2902k) {
            return this.f2901j;
        }
        return this.f2900i;
    }

    /* renamed from: h */
    public float m67709h() {
        return m67710g().getWidth();
    }

    /* renamed from: i */
    public PdfDocument.Meta m67708i() {
        PdfDocument pdfDocument = this.f2892a;
        if (pdfDocument == null) {
            return null;
        }
        return this.f2893b.getDocumentMeta(pdfDocument);
    }

    /* renamed from: j */
    public int m67707j(float f, float f2) {
        int i = 0;
        for (int i2 = 0; i2 < m67701p() && (((Float) this.f2905n.get(i2)).floatValue() * f2) - (m67702o(i2, f2) / 2.0f) < f; i2++) {
            i++;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    public float m67706k(int i, float f) {
        float width;
        SizeF m67703n = m67703n(i);
        if (this.f2902k) {
            width = m67703n.getHeight();
        } else {
            width = m67703n.getWidth();
        }
        return width * f;
    }

    /* renamed from: l */
    public List m67705l(int i) {
        return this.f2893b.getPageLinks(this.f2892a, m67714c(i));
    }

    /* renamed from: m */
    public float m67704m(int i, float f) {
        if (m67714c(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.f2905n.get(i)).floatValue() * f;
    }

    /* renamed from: n */
    public SizeF m67703n(int i) {
        if (m67714c(i) < 0) {
            return new SizeF(0.0f, 0.0f);
        }
        return (SizeF) this.f2896e.get(i);
    }

    /* renamed from: o */
    public float m67702o(int i, float f) {
        float f2;
        if (this.f2904m) {
            f2 = ((Float) this.f2906o.get(i)).floatValue();
        } else {
            f2 = this.f2903l;
        }
        return f2 * f;
    }

    /* renamed from: p */
    public int m67701p() {
        return this.f2894c;
    }

    /* renamed from: q */
    public SizeF m67700q(int i, float f) {
        SizeF m67703n = m67703n(i);
        return new SizeF(m67703n.getWidth() * f, m67703n.getHeight() * f);
    }

    /* renamed from: r */
    public float m67699r(int i, float f) {
        float m67711f;
        float height;
        SizeF m67703n = m67703n(i);
        if (this.f2902k) {
            m67711f = m67709h();
            height = m67703n.getWidth();
        } else {
            m67711f = m67711f();
            height = m67703n.getHeight();
        }
        return (f * (m67711f - height)) / 2.0f;
    }

    /* renamed from: s */
    public RectF m67698s(int i, int i2, int i3, int i4, int i5, RectF rectF) {
        return this.f2893b.mapRectToDevice(this.f2892a, m67714c(i), i2, i3, i4, i5, 0, rectF);
    }

    /* renamed from: t */
    public boolean m67697t(int i) {
        int m67714c = m67714c(i);
        if (m67714c < 0) {
            return false;
        }
        synchronized (f2891t) {
            try {
                if (this.f2897f.indexOfKey(m67714c) >= 0) {
                    return false;
                }
                try {
                    this.f2893b.openPage(this.f2892a, m67714c);
                    this.f2897f.put(m67714c, true);
                    return true;
                } catch (Exception e) {
                    this.f2897f.put(m67714c, false);
                    throw new PageRenderingException(i, e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public boolean m67696u(int i) {
        return !this.f2897f.get(m67714c(i), false);
    }

    /* renamed from: v */
    public final void m67695v(Size size) {
        float width;
        float width2;
        this.f2906o.clear();
        for (int i = 0; i < m67701p(); i++) {
            SizeF sizeF = (SizeF) this.f2896e.get(i);
            if (this.f2902k) {
                width = size.getHeight();
                width2 = sizeF.getHeight();
            } else {
                width = size.getWidth();
                width2 = sizeF.getWidth();
            }
            float max = Math.max(0.0f, width - width2);
            if (i < m67701p() - 1) {
                max += this.f2903l;
            }
            this.f2906o.add(Float.valueOf(max));
        }
    }

    /* renamed from: w */
    public final void m67694w() {
        float width;
        float f;
        float f2 = 0.0f;
        for (int i = 0; i < m67701p(); i++) {
            SizeF sizeF = (SizeF) this.f2896e.get(i);
            if (this.f2902k) {
                width = sizeF.getHeight();
            } else {
                width = sizeF.getWidth();
            }
            f2 += width;
            if (this.f2904m) {
                f = ((Float) this.f2906o.get(i)).floatValue();
            } else if (i < m67701p() - 1) {
                f = this.f2903l;
            }
            f2 += f;
        }
        this.f2907p = f2;
    }

    /* renamed from: x */
    public final void m67693x() {
        float width;
        float f;
        this.f2905n.clear();
        float f2 = 0.0f;
        for (int i = 0; i < m67701p(); i++) {
            SizeF sizeF = (SizeF) this.f2896e.get(i);
            if (this.f2902k) {
                width = sizeF.getHeight();
            } else {
                width = sizeF.getWidth();
            }
            if (this.f2904m) {
                f2 += ((Float) this.f2906o.get(i)).floatValue() / 2.0f;
                if (i == 0) {
                    f2 -= this.f2903l / 2.0f;
                } else if (i == m67701p() - 1) {
                    f2 += this.f2903l / 2.0f;
                }
                this.f2905n.add(Float.valueOf(f2));
                f = ((Float) this.f2906o.get(i)).floatValue() / 2.0f;
            } else {
                this.f2905n.add(Float.valueOf(f2));
                f = this.f2903l;
            }
            f2 += width + f;
        }
    }

    /* renamed from: y */
    public void m67692y(Size size) {
        this.f2896e.clear();
        PageSizeCalculator pageSizeCalculator = new PageSizeCalculator(this.f2908q, this.f2898g, this.f2899h, size, this.f2909r);
        this.f2901j = pageSizeCalculator.getOptimalMaxWidthPageSize();
        this.f2900i = pageSizeCalculator.getOptimalMaxHeightPageSize();
        for (Size size2 : this.f2895d) {
            this.f2896e.add(pageSizeCalculator.calculate(size2));
        }
        if (this.f2904m) {
            m67695v(size);
        }
        m67694w();
        m67693x();
    }

    /* renamed from: z */
    public void m67691z(Bitmap bitmap, int i, Rect rect, boolean z) {
        this.f2893b.renderPageBitmap(this.f2892a, bitmap, m67714c(i), rect.left, rect.top, rect.width(), rect.height(), z);
    }
}
