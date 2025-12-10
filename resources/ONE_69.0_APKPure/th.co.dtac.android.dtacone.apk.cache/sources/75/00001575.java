package p000;

/* renamed from: WV */
/* loaded from: classes4.dex */
public abstract class AbstractC1601WV {

    /* renamed from: a */
    public static final InterfaceC1373TV f7289a = new C1602a();

    /* renamed from: b */
    public static final InterfaceC1373TV f7290b = new C1603b();

    /* renamed from: c */
    public static final InterfaceC1373TV f7291c = new C1604c();

    /* renamed from: d */
    public static final InterfaceC1373TV f7292d = new C1605d();

    /* renamed from: WV$a */
    /* loaded from: classes4.dex */
    public class C1602a implements InterfaceC1373TV {
        @Override // p000.InterfaceC1373TV
        /* renamed from: a */
        public C1671XV mo65750a(float f, float f2, float f3, float f4) {
            return C1671XV.m65607a(255, AbstractC21141mW1.m26640p(0, 255, f2, f3, f));
        }
    }

    /* renamed from: WV$b */
    /* loaded from: classes4.dex */
    public class C1603b implements InterfaceC1373TV {
        @Override // p000.InterfaceC1373TV
        /* renamed from: a */
        public C1671XV mo65750a(float f, float f2, float f3, float f4) {
            return C1671XV.m65606b(AbstractC21141mW1.m26640p(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: WV$c */
    /* loaded from: classes4.dex */
    public class C1604c implements InterfaceC1373TV {
        @Override // p000.InterfaceC1373TV
        /* renamed from: a */
        public C1671XV mo65750a(float f, float f2, float f3, float f4) {
            return C1671XV.m65606b(AbstractC21141mW1.m26640p(255, 0, f2, f3, f), AbstractC21141mW1.m26640p(0, 255, f2, f3, f));
        }
    }

    /* renamed from: WV$d */
    /* loaded from: classes4.dex */
    public class C1605d implements InterfaceC1373TV {
        @Override // p000.InterfaceC1373TV
        /* renamed from: a */
        public C1671XV mo65750a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C1671XV.m65606b(AbstractC21141mW1.m26640p(255, 0, f2, f5, f), AbstractC21141mW1.m26640p(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static InterfaceC1373TV m65751a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f7292d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f7291c;
            } else if (z) {
                return f7290b;
            } else {
                return f7289a;
            }
        } else if (z) {
            return f7289a;
        } else {
            return f7290b;
        }
    }
}