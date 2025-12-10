package p000;

/* renamed from: SV */
/* loaded from: classes4.dex */
public abstract class AbstractC1317SV {

    /* renamed from: a */
    public static final InterfaceC1102PV f5637a = new C1318a();

    /* renamed from: b */
    public static final InterfaceC1102PV f5638b = new C1319b();

    /* renamed from: c */
    public static final InterfaceC1102PV f5639c = new C1320c();

    /* renamed from: d */
    public static final InterfaceC1102PV f5640d = new C1321d();

    /* renamed from: SV$a */
    /* loaded from: classes4.dex */
    public class C1318a implements InterfaceC1102PV {
        @Override // p000.InterfaceC1102PV
        /* renamed from: a */
        public C1391TV mo66323a(float f, float f2, float f3, float f4) {
            return C1391TV.m66200a(255, AbstractC21596pV1.m23671p(0, 255, f2, f3, f));
        }
    }

    /* renamed from: SV$b */
    /* loaded from: classes4.dex */
    public class C1319b implements InterfaceC1102PV {
        @Override // p000.InterfaceC1102PV
        /* renamed from: a */
        public C1391TV mo66323a(float f, float f2, float f3, float f4) {
            return C1391TV.m66199b(AbstractC21596pV1.m23671p(255, 0, f2, f3, f), 255);
        }
    }

    /* renamed from: SV$c */
    /* loaded from: classes4.dex */
    public class C1320c implements InterfaceC1102PV {
        @Override // p000.InterfaceC1102PV
        /* renamed from: a */
        public C1391TV mo66323a(float f, float f2, float f3, float f4) {
            return C1391TV.m66199b(AbstractC21596pV1.m23671p(255, 0, f2, f3, f), AbstractC21596pV1.m23671p(0, 255, f2, f3, f));
        }
    }

    /* renamed from: SV$d */
    /* loaded from: classes4.dex */
    public class C1321d implements InterfaceC1102PV {
        @Override // p000.InterfaceC1102PV
        /* renamed from: a */
        public C1391TV mo66323a(float f, float f2, float f3, float f4) {
            float f5 = ((f3 - f2) * f4) + f2;
            return C1391TV.m66199b(AbstractC21596pV1.m23671p(255, 0, f2, f5, f), AbstractC21596pV1.m23671p(0, 255, f5, f3, f));
        }
    }

    /* renamed from: a */
    public static InterfaceC1102PV m66324a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return f5640d;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i);
                }
                return f5639c;
            } else if (z) {
                return f5638b;
            } else {
                return f5637a;
            }
        } else if (z) {
            return f5637a;
        } else {
            return f5638b;
        }
    }
}
