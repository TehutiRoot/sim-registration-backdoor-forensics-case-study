package p000;

import android.graphics.RectF;

/* renamed from: F20 */
/* loaded from: classes4.dex */
public abstract class F20 {

    /* renamed from: a */
    public static final C20 f1557a = new C0355a();

    /* renamed from: b */
    public static final C20 f1558b = new C0356b();

    /* renamed from: F20$a */
    /* loaded from: classes4.dex */
    public class C0355a implements C20 {
        @Override // p000.C20
        /* renamed from: a */
        public G20 mo68547a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m26641o = AbstractC21141mW1.m26641o(f4, f6, f2, f3, f, true);
            float f8 = m26641o / f4;
            float f9 = m26641o / f6;
            return new G20(f8, f9, m26641o, f5 * f8, m26641o, f7 * f9);
        }

        @Override // p000.C20
        /* renamed from: b */
        public boolean mo68546b(G20 g20) {
            if (g20.f1853d > g20.f1855f) {
                return true;
            }
            return false;
        }

        @Override // p000.C20
        /* renamed from: c */
        public void mo68545c(RectF rectF, float f, G20 g20) {
            rectF.bottom -= Math.abs(g20.f1855f - g20.f1853d) * f;
        }
    }

    /* renamed from: F20$b */
    /* loaded from: classes4.dex */
    public class C0356b implements C20 {
        @Override // p000.C20
        /* renamed from: a */
        public G20 mo68547a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m26641o = AbstractC21141mW1.m26641o(f5, f7, f2, f3, f, true);
            float f8 = m26641o / f5;
            float f9 = m26641o / f7;
            return new G20(f8, f9, f4 * f8, m26641o, f6 * f9, m26641o);
        }

        @Override // p000.C20
        /* renamed from: b */
        public boolean mo68546b(G20 g20) {
            if (g20.f1852c > g20.f1854e) {
                return true;
            }
            return false;
        }

        @Override // p000.C20
        /* renamed from: c */
        public void mo68545c(RectF rectF, float f, G20 g20) {
            float abs = (Math.abs(g20.f1854e - g20.f1852c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static C20 m68549a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f1558b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f1557a;
        } else if (m68548b(z, rectF, rectF2)) {
            return f1557a;
        } else {
            return f1558b;
        }
    }

    /* renamed from: b */
    public static boolean m68548b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f < height) {
                return false;
            }
        } else if (f2 < height2) {
            return false;
        }
        return true;
    }
}