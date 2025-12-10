package p000;

import android.graphics.RectF;

/* renamed from: E20 */
/* loaded from: classes4.dex */
public abstract class E20 {

    /* renamed from: a */
    public static final D20 f1230a = new C0287a();

    /* renamed from: b */
    public static final D20 f1231b = new C0288b();

    /* renamed from: E20$a */
    /* loaded from: classes4.dex */
    public class C0287a implements D20 {
        @Override // p000.D20
        /* renamed from: a */
        public H20 mo68707a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m26393n = AbstractC21314nW1.m26393n(f4, f6, f2, f3, f, true);
            float f8 = m26393n / f4;
            float f9 = m26393n / f6;
            return new H20(f8, f9, m26393n, f5 * f8, m26393n, f7 * f9);
        }

        @Override // p000.D20
        /* renamed from: b */
        public boolean mo68706b(H20 h20) {
            if (h20.f2268d > h20.f2270f) {
                return true;
            }
            return false;
        }

        @Override // p000.D20
        /* renamed from: c */
        public void mo68705c(RectF rectF, float f, H20 h20) {
            rectF.bottom -= Math.abs(h20.f2270f - h20.f2268d) * f;
        }
    }

    /* renamed from: E20$b */
    /* loaded from: classes4.dex */
    public class C0288b implements D20 {
        @Override // p000.D20
        /* renamed from: a */
        public H20 mo68707a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m26393n = AbstractC21314nW1.m26393n(f5, f7, f2, f3, f, true);
            float f8 = m26393n / f5;
            float f9 = m26393n / f7;
            return new H20(f8, f9, f4 * f8, m26393n, f6 * f9, m26393n);
        }

        @Override // p000.D20
        /* renamed from: b */
        public boolean mo68706b(H20 h20) {
            if (h20.f2267c > h20.f2269e) {
                return true;
            }
            return false;
        }

        @Override // p000.D20
        /* renamed from: c */
        public void mo68705c(RectF rectF, float f, H20 h20) {
            float abs = (Math.abs(h20.f2269e - h20.f2267c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static D20 m68709a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f1231b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f1230a;
        } else if (m68708b(z, rectF, rectF2)) {
            return f1230a;
        } else {
            return f1231b;
        }
    }

    /* renamed from: b */
    public static boolean m68708b(boolean z, RectF rectF, RectF rectF2) {
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