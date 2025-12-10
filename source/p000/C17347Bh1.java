package p000;

import android.graphics.RectF;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.MathUtils;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.util.SizeF;
import java.util.List;

/* renamed from: Bh1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17347Bh1 {

    /* renamed from: a */
    public PDFView f465a;

    /* renamed from: b */
    public int f466b;

    /* renamed from: c */
    public float f467c;

    /* renamed from: d */
    public float f468d;

    /* renamed from: e */
    public float f469e;

    /* renamed from: f */
    public float f470f;

    /* renamed from: g */
    public float f471g;

    /* renamed from: h */
    public float f472h;

    /* renamed from: i */
    public final RectF f473i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j */
    public final int f474j;

    /* renamed from: Bh1$b */
    /* loaded from: classes3.dex */
    public class C0122b {

        /* renamed from: a */
        public int f475a;

        /* renamed from: b */
        public int f476b;

        public C0122b() {
        }

        public String toString() {
            return "GridSize{rows=" + this.f475a + ", cols=" + this.f476b + '}';
        }
    }

    /* renamed from: Bh1$c */
    /* loaded from: classes3.dex */
    public class C0123c {

        /* renamed from: a */
        public int f478a;

        /* renamed from: b */
        public int f479b;

        public C0123c() {
        }

        public String toString() {
            return "Holder{row=" + this.f478a + ", col=" + this.f479b + '}';
        }
    }

    /* renamed from: Bh1$d */
    /* loaded from: classes3.dex */
    public class C0124d {

        /* renamed from: a */
        public int f481a = 0;

        /* renamed from: b */
        public C0122b f482b;

        /* renamed from: c */
        public C0123c f483c;

        /* renamed from: d */
        public C0123c f484d;

        public C0124d() {
            this.f482b = new C0122b();
            this.f483c = new C0123c();
            this.f484d = new C0123c();
        }

        public String toString() {
            return "RenderRange{page=" + this.f481a + ", gridSize=" + this.f482b + ", leftTop=" + this.f483c + ", rightBottom=" + this.f484d + '}';
        }
    }

    public C17347Bh1(PDFView pDFView) {
        this.f465a = pDFView;
        this.f474j = Util.getDP(pDFView.getContext(), Constants.PRELOAD_OFFSET);
    }

    /* renamed from: a */
    public final void m68892a(C0122b c0122b) {
        float f = 1.0f / c0122b.f476b;
        this.f469e = f;
        float f2 = 1.0f / c0122b.f475a;
        this.f470f = f2;
        float f3 = Constants.PART_SIZE;
        this.f471g = f3 / f;
        this.f472h = f3 / f2;
    }

    /* renamed from: b */
    public final void m68891b(C0122b c0122b, int i) {
        SizeF m67703n = this.f465a.f43602h.m67703n(i);
        float height = (Constants.PART_SIZE * (1.0f / m67703n.getHeight())) / this.f465a.getZoom();
        float width = (Constants.PART_SIZE * (1.0f / m67703n.getWidth())) / this.f465a.getZoom();
        c0122b.f475a = MathUtils.ceil(1.0f / height);
        c0122b.f476b = MathUtils.ceil(1.0f / width);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m68890c(float r20, float r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C17347Bh1.m68890c(float, float, float, float):java.util.List");
    }

    /* renamed from: d */
    public final boolean m68889d(int i, int i2, int i3, float f, float f2) {
        float f3;
        float f4;
        float f5 = i3 * f;
        float f6 = i2 * f2;
        float f7 = this.f471g;
        float f8 = this.f472h;
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
            if (!this.f465a.f43599e.m26061k(i, rectF, this.f466b)) {
                PDFView pDFView = this.f465a;
                pDFView.f43611q.m65731b(i, f9, f10, rectF, false, this.f466b, pDFView.isBestQuality(), this.f465a.isAnnotationRendering());
            }
            this.f466b++;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m68888e(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i2 <= i3) {
            for (int i8 = i4; i8 <= i5; i8++) {
                if (m68889d(i, i2, i8, this.f469e, this.f470f)) {
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
    public void m68887f() {
        this.f466b = 1;
        this.f467c = -MathUtils.max(this.f465a.getCurrentXOffset(), 0.0f);
        this.f468d = -MathUtils.max(this.f465a.getCurrentYOffset(), 0.0f);
        m68885h();
    }

    /* renamed from: g */
    public final void m68886g(int i) {
        SizeF m67703n = this.f465a.f43602h.m67703n(i);
        float width = m67703n.getWidth() * Constants.THUMBNAIL_RATIO;
        float height = m67703n.getHeight() * Constants.THUMBNAIL_RATIO;
        if (!this.f465a.f43599e.m26068d(i, this.f473i)) {
            PDFView pDFView = this.f465a;
            pDFView.f43611q.m65731b(i, width, height, this.f473i, true, 0, pDFView.isBestQuality(), this.f465a.isAnnotationRendering());
        }
    }

    /* renamed from: h */
    public final void m68885h() {
        float f = this.f474j;
        float f2 = this.f467c;
        float f3 = this.f468d;
        List<C0124d> m68890c = m68890c((-f2) + f, (-f3) + f, ((-f2) - this.f465a.getWidth()) - f, ((-f3) - this.f465a.getHeight()) - f);
        for (C0124d c0124d : m68890c) {
            m68886g(c0124d.f481a);
        }
        int i = 0;
        for (C0124d c0124d2 : m68890c) {
            m68892a(c0124d2.f482b);
            int i2 = c0124d2.f481a;
            C0123c c0123c = c0124d2.f483c;
            int i3 = c0123c.f478a;
            C0123c c0123c2 = c0124d2.f484d;
            i += m68888e(i2, i3, c0123c2.f478a, c0123c.f479b, c0123c2.f479b, Constants.Cache.CACHE_SIZE - i);
            if (i >= Constants.Cache.CACHE_SIZE) {
                return;
            }
        }
    }
}
