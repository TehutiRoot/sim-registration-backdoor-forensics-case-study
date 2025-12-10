package p000;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.MathUtils;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.util.SizeF;
import java.util.List;

/* renamed from: yi1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C23249yi1 {

    /* renamed from: a */
    public PDFView f109115a;

    /* renamed from: b */
    public int f109116b;

    /* renamed from: c */
    public float f109117c;

    /* renamed from: d */
    public float f109118d;

    /* renamed from: e */
    public float f109119e;

    /* renamed from: f */
    public float f109120f;

    /* renamed from: g */
    public float f109121g;

    /* renamed from: h */
    public float f109122h;

    /* renamed from: i */
    public final RectF f109123i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f109124j;

    /* renamed from: yi1$b */
    /* loaded from: classes3.dex */
    public class C17153b {

        /* renamed from: a */
        public int f109125a;

        /* renamed from: b */
        public int f109126b;

        public C17153b() {
        }

        public String toString() {
            return "GridSize{rows=" + this.f109125a + ", cols=" + this.f109126b + '}';
        }
    }

    /* renamed from: yi1$c */
    /* loaded from: classes3.dex */
    public class C17154c {

        /* renamed from: a */
        public int f109128a;

        /* renamed from: b */
        public int f109129b;

        public C17154c() {
        }

        public String toString() {
            return "Holder{row=" + this.f109128a + ", col=" + this.f109129b + '}';
        }
    }

    /* renamed from: yi1$d */
    /* loaded from: classes3.dex */
    public class C17155d {

        /* renamed from: a */
        public int f109131a = 0;

        /* renamed from: b */
        public C17153b f109132b;

        /* renamed from: c */
        public C17154c f109133c;

        /* renamed from: d */
        public C17154c f109134d;

        public C17155d() {
            this.f109132b = new C17153b();
            this.f109133c = new C17154c();
            this.f109134d = new C17154c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f109131a + ", gridSize=" + this.f109132b + ", leftTop=" + this.f109133c + ", rightBottom=" + this.f109134d + '}';
        }
    }

    public C23249yi1(PDFView pDFView) {
        this.f109115a = pDFView;
        this.f109124j = Util.getDP(pDFView.getContext(), Constants.PRELOAD_OFFSET);
    }

    /* renamed from: a */
    public final void m260a(C17153b c17153b) {
        float f = 1.0f / c17153b.f109126b;
        this.f109119e = f;
        float f2 = 1.0f / c17153b.f109125a;
        this.f109120f = f2;
        float f3 = Constants.PART_SIZE;
        this.f109121g = f3 / f;
        this.f109122h = f3 / f2;
    }

    /* renamed from: b */
    public final void m259b(C17153b c17153b, int i) {
        SizeF m68223n = this.f109115a.f43614h.m68223n(i);
        float height = (Constants.PART_SIZE * (1.0f / m68223n.getHeight())) / this.f109115a.getZoom();
        float width = (Constants.PART_SIZE * (1.0f / m68223n.getWidth())) / this.f109115a.getZoom();
        c17153b.f109125a = MathUtils.ceil(1.0f / height);
        c17153b.f109126b = MathUtils.ceil(1.0f / width);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m258c(float r20, float r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C23249yi1.m258c(float, float, float, float):java.util.List");
    }

    /* renamed from: d */
    public final boolean m257d(int i, int i2, int i3, float f, float f2) {
        float f3;
        float f4;
        float f5 = i3 * f;
        float f6 = i2 * f2;
        float f7 = this.f109121g;
        float f8 = this.f109122h;
        if (f5 + f > 1.0f) {
            f3 = 1.0f - f5;
        } else {
            f3 = f;
        }
        if (f6 + f2 > 1.0f) {
            f4 = 1.0f - f6;
        } else {
            f4 = f2;
        }
        float f9 = f7 * f3;
        float f10 = f8 * f4;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        if (f9 > 0.0f && f10 > 0.0f) {
            if (!this.f109115a.f43611e.m26266k(i, rectF, this.f109116b)) {
                PDFView pDFView = this.f109115a;
                pDFView.f43623q.m66436b(i, f9, f10, rectF, false, this.f109116b, pDFView.isBestQuality(), this.f109115a.isAnnotationRendering());
            }
            this.f109116b++;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m256e(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i2 <= i3) {
            for (int i8 = i4; i8 <= i5; i8++) {
                if (m257d(i, i2, i8, this.f109119e, this.f109120f)) {
                    i7++;
                }
                if (i7 >= i6) {
                    return i7;
                }
            }
            i2++;
        }
        return i7;
    }

    /* renamed from: f */
    public void m255f() {
        this.f109116b = 1;
        this.f109117c = -MathUtils.max(this.f109115a.getCurrentXOffset(), 0.0f);
        this.f109118d = -MathUtils.max(this.f109115a.getCurrentYOffset(), 0.0f);
        m253h();
    }

    /* renamed from: g */
    public final void m254g(int i) {
        SizeF m68223n = this.f109115a.f43614h.m68223n(i);
        float width = m68223n.getWidth() * Constants.THUMBNAIL_RATIO;
        float height = m68223n.getHeight() * Constants.THUMBNAIL_RATIO;
        if (!this.f109115a.f43611e.m26273d(i, this.f109123i)) {
            PDFView pDFView = this.f109115a;
            pDFView.f43623q.m66436b(i, width, height, this.f109123i, true, 0, pDFView.isBestQuality(), this.f109115a.isAnnotationRendering());
        }
    }

    /* renamed from: h */
    public final void m253h() {
        float f = this.f109124j;
        float f2 = this.f109117c;
        float f3 = this.f109118d;
        List<C17155d> m258c = m258c((-f2) + f, (-f3) + f, ((-f2) - this.f109115a.getWidth()) - f, ((-f3) - this.f109115a.getHeight()) - f);
        for (C17155d c17155d : m258c) {
            m254g(c17155d.f109131a);
        }
        int i = 0;
        for (C17155d c17155d2 : m258c) {
            m260a(c17155d2.f109132b);
            int i2 = c17155d2.f109131a;
            C17154c c17154c = c17155d2.f109133c;
            int i3 = c17154c.f109128a;
            C17154c c17154c2 = c17155d2.f109134d;
            i += m256e(i2, i3, c17154c2.f109128a, c17154c.f109129b, c17154c2.f109129b, Constants.Cache.CACHE_SIZE - i);
            if (i >= Constants.Cache.CACHE_SIZE) {
                return;
            }
        }
    }
}