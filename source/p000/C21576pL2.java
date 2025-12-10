package p000;

import com.google.android.gms.internal.firebase_ml.C6437G0;
import com.google.android.gms.internal.firebase_ml.C6441I0;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzxl;

/* renamed from: pL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21576pL2 implements QL2 {

    /* renamed from: b */
    public static final InterfaceC22780wL2 f76572b = new C21404oL2();

    /* renamed from: a */
    public final InterfaceC22780wL2 f76573a;

    public C21576pL2() {
        this(new C21748qL2(YK2.m65365c(), m23694c()));
    }

    /* renamed from: b */
    public static boolean m23695b(InterfaceC22436uL2 interfaceC22436uL2) {
        if (interfaceC22436uL2.mo1278c() == zzxh.zzg.zzcpe) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static InterfaceC22780wL2 m23694c() {
        try {
            return (InterfaceC22780wL2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f76572b;
        }
    }

    @Override // p000.QL2
    /* renamed from: a */
    public final OL2 mo23696a(Class cls) {
        PL2.m66850I(cls);
        InterfaceC22436uL2 mo861b = this.f76573a.mo861b(cls);
        if (mo861b.mo1279b()) {
            if (zzxh.class.isAssignableFrom(cls)) {
                return C6441I0.m47998i(PL2.m66831a0(), VK2.m65862b(), mo861b.mo1280a());
            }
            return C6441I0.m47998i(PL2.m66834Y(), VK2.m65861c(), mo861b.mo1280a());
        } else if (zzxh.class.isAssignableFrom(cls)) {
            if (m23695b(mo861b)) {
                return C6437G0.m48022o(cls, mo861b, JL2.m67762b(), AbstractC20544jL2.m29216d(), PL2.m66831a0(), VK2.m65862b(), AbstractC22608vL2.m1047b());
            }
            return C6437G0.m48022o(cls, mo861b, JL2.m67762b(), AbstractC20544jL2.m29216d(), PL2.m66831a0(), null, AbstractC22608vL2.m1047b());
        } else if (m23695b(mo861b)) {
            return C6437G0.m48022o(cls, mo861b, JL2.m67763a(), AbstractC20544jL2.m29217c(), PL2.m66834Y(), VK2.m65861c(), AbstractC22608vL2.m1048a());
        } else {
            return C6437G0.m48022o(cls, mo861b, JL2.m67763a(), AbstractC20544jL2.m29217c(), PL2.m66833Z(), null, AbstractC22608vL2.m1048a());
        }
    }

    public C21576pL2(InterfaceC22780wL2 interfaceC22780wL2) {
        this.f76573a = (InterfaceC22780wL2) zzxl.m47421b(interfaceC22780wL2, "messageInfoFactory");
    }
}
