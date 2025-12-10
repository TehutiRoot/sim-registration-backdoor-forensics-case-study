package p000;

/* renamed from: RV */
/* loaded from: classes4.dex */
public abstract class AbstractC1246RV {

    /* renamed from: a */
    public static final InterfaceC1182QV f5354a = new C1247a();

    /* renamed from: b */
    public static final InterfaceC1182QV f5355b = new C1248b();

    /* renamed from: c */
    public static final InterfaceC1182QV f5356c = new C1249c();

    /* renamed from: d */
    public static final InterfaceC1182QV f5357d = new C1250d();

    /* renamed from: RV$a */
    /* loaded from: classes4.dex */
    public class C1247a implements InterfaceC1182QV {
        @Override // p000.InterfaceC1182QV
        /* renamed from: a */
        public C1468UV mo66446a(float f, float f2, float f3, float f4) {
            return C1468UV.m66028a(255, AbstractC21768qV1.m23480o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: RV$b */
    /* loaded from: classes4.dex */
    public class C1248b implements InterfaceC1182QV {
        @Override // p000.InterfaceC1182QV
        /* renamed from: a */
        public C1468UV mo66446a(float f, float f2, float f3, float f4) {
            return C1468UV.m66027b(AbstractC21768qV1.m23480o(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: RV$c */
    /* loaded from: classes4.dex */
    public class C1249c implements InterfaceC1182QV {
        @Override // p000.InterfaceC1182QV
        /* renamed from: a */
        public C1468UV mo66446a(float f, float f2, float f3, float f4) {
            return C1468UV.m66027b(AbstractC21768qV1.m23480o(255, 0, f2, f3, f), AbstractC21768qV1.m23480o(0, 255, f2, f3, f));
        }
    }

    /* renamed from: RV$d */
    /* loaded from: classes4.dex */
    public class C1250d implements InterfaceC1182QV {
        @Override // p000.InterfaceC1182QV
        /* renamed from: a */
        public C1468UV mo66446a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C1468UV.m66027b(AbstractC21768qV1.m23480o(255, 0, f2, f5, f), AbstractC21768qV1.m23480o(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static InterfaceC1182QV m66447a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f5357d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f5356c;
            } else if (z) {
                return f5355b;
            } else {
                return f5354a;
            }
        } else if (z) {
            return f5354a;
        } else {
            return f5355b;
        }
    }
}
