package p000;

import android.graphics.RectF;

/* renamed from: A20 */
/* loaded from: classes4.dex */
public abstract class A20 {

    /* renamed from: a */
    public static final InterfaceC23237z20 f9a = new C0004a();

    /* renamed from: b */
    public static final InterfaceC23237z20 f10b = new C0005b();

    /* renamed from: A20$a */
    /* loaded from: classes4.dex */
    public class C0004a implements InterfaceC23237z20 {
        @Override // p000.InterfaceC23237z20
        /* renamed from: a */
        public D20 mo151a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m23481n = AbstractC21768qV1.m23481n(f4, f6, f2, f3, f, true);
            float f8 = m23481n / f4;
            float f9 = m23481n / f6;
            return new D20(f8, f9, m23481n, f5 * f8, m23481n, f7 * f9);
        }

        @Override // p000.InterfaceC23237z20
        /* renamed from: b */
        public boolean mo150b(D20 d20) {
            if (d20.f894d > d20.f896f) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC23237z20
        /* renamed from: c */
        public void mo149c(RectF rectF, float f, D20 d20) {
            rectF.bottom -= Math.abs(d20.f896f - d20.f894d) * f;
        }
    }

    /* renamed from: A20$b */
    /* loaded from: classes4.dex */
    public class C0005b implements InterfaceC23237z20 {
        @Override // p000.InterfaceC23237z20
        /* renamed from: a */
        public D20 mo151a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m23481n = AbstractC21768qV1.m23481n(f5, f7, f2, f3, f, true);
            float f8 = m23481n / f5;
            float f9 = m23481n / f7;
            return new D20(f8, f9, f4 * f8, m23481n, f6 * f9, m23481n);
        }

        @Override // p000.InterfaceC23237z20
        /* renamed from: b */
        public boolean mo150b(D20 d20) {
            if (d20.f893c > d20.f895e) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC23237z20
        /* renamed from: c */
        public void mo149c(RectF rectF, float f, D20 d20) {
            float abs = (Math.abs(d20.f895e - d20.f893c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static InterfaceC23237z20 m69152a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f10b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f9a;
        } else if (m69151b(z, rectF, rectF2)) {
            return f9a;
        } else {
            return f10b;
        }
    }

    /* renamed from: b */
    public static boolean m69151b(boolean z, RectF rectF, RectF rectF2) {
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
