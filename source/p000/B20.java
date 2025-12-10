package p000;

import android.graphics.RectF;

/* renamed from: B20 */
/* loaded from: classes4.dex */
public abstract class B20 {

    /* renamed from: a */
    public static final InterfaceC23065y20 f279a = new C0073a();

    /* renamed from: b */
    public static final InterfaceC23065y20 f280b = new C0074b();

    /* renamed from: B20$a */
    /* loaded from: classes4.dex */
    public class C0073a implements InterfaceC23065y20 {
        @Override // p000.InterfaceC23065y20
        /* renamed from: a */
        public C20 mo352a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m23672o = AbstractC21596pV1.m23672o(f4, f6, f2, f3, f, true);
            float f8 = m23672o / f4;
            float f9 = m23672o / f6;
            return new C20(f8, f9, m23672o, f5 * f8, m23672o, f7 * f9);
        }

        @Override // p000.InterfaceC23065y20
        /* renamed from: b */
        public boolean mo351b(C20 c20) {
            if (c20.f596d > c20.f598f) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC23065y20
        /* renamed from: c */
        public void mo350c(RectF rectF, float f, C20 c20) {
            rectF.bottom -= Math.abs(c20.f598f - c20.f596d) * f;
        }
    }

    /* renamed from: B20$b */
    /* loaded from: classes4.dex */
    public class C0074b implements InterfaceC23065y20 {
        @Override // p000.InterfaceC23065y20
        /* renamed from: a */
        public C20 mo352a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m23672o = AbstractC21596pV1.m23672o(f5, f7, f2, f3, f, true);
            float f8 = m23672o / f5;
            float f9 = m23672o / f7;
            return new C20(f8, f9, f4 * f8, m23672o, f6 * f9, m23672o);
        }

        @Override // p000.InterfaceC23065y20
        /* renamed from: b */
        public boolean mo351b(C20 c20) {
            if (c20.f595c > c20.f597e) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC23065y20
        /* renamed from: c */
        public void mo350c(RectF rectF, float f, C20 c20) {
            float abs = (Math.abs(c20.f597e - c20.f595c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    /* renamed from: a */
    public static InterfaceC23065y20 m69029a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f280b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i);
            }
            return f279a;
        } else if (m69028b(z, rectF, rectF2)) {
            return f279a;
        } else {
            return f280b;
        }
    }

    /* renamed from: b */
    public static boolean m69028b(boolean z, RectF rectF, RectF rectF2) {
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
