package p000;

/* renamed from: VV */
/* loaded from: classes4.dex */
public abstract class AbstractC1522VV {

    /* renamed from: a */
    public static final InterfaceC1448UV f6924a = new C1523a();

    /* renamed from: b */
    public static final InterfaceC1448UV f6925b = new C1524b();

    /* renamed from: c */
    public static final InterfaceC1448UV f6926c = new C1525c();

    /* renamed from: d */
    public static final InterfaceC1448UV f6927d = new C1526d();

    /* renamed from: VV$a */
    /* loaded from: classes4.dex */
    public class C1523a implements InterfaceC1448UV {
        @Override // p000.InterfaceC1448UV
        /* renamed from: a */
        public C1740YV mo65977a(float f, float f2, float f3, float f4) {
            return C1740YV.m65447a(255, AbstractC21314nW1.m26392o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: VV$b */
    /* loaded from: classes4.dex */
    public class C1524b implements InterfaceC1448UV {
        @Override // p000.InterfaceC1448UV
        /* renamed from: a */
        public C1740YV mo65977a(float f, float f2, float f3, float f4) {
            return C1740YV.m65446b(AbstractC21314nW1.m26392o(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: VV$c */
    /* loaded from: classes4.dex */
    public class C1525c implements InterfaceC1448UV {
        @Override // p000.InterfaceC1448UV
        /* renamed from: a */
        public C1740YV mo65977a(float f, float f2, float f3, float f4) {
            return C1740YV.m65446b(AbstractC21314nW1.m26392o(255, 0, f2, f3, f), AbstractC21314nW1.m26392o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: VV$d */
    /* loaded from: classes4.dex */
    public class C1526d implements InterfaceC1448UV {
        @Override // p000.InterfaceC1448UV
        /* renamed from: a */
        public C1740YV mo65977a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C1740YV.m65446b(AbstractC21314nW1.m26392o(255, 0, f2, f5, f), AbstractC21314nW1.m26392o(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static InterfaceC1448UV m65978a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f6927d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f6926c;
            } else if (z) {
                return f6925b;
            } else {
                return f6924a;
            }
        } else if (z) {
            return f6924a;
        } else {
            return f6925b;
        }
    }
}