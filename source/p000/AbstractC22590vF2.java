package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjk;

/* renamed from: vF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22590vF2 {
    /* renamed from: a */
    public abstract Object mo1091a();

    /* renamed from: b */
    public abstract Object mo1090b(Object obj);

    /* renamed from: c */
    public abstract void mo1089c(Object obj, int i, int i2);

    /* renamed from: d */
    public abstract void mo1088d(Object obj, int i, long j);

    /* renamed from: e */
    public abstract void mo1087e(Object obj, int i, zzht zzhtVar);

    /* renamed from: f */
    public abstract void mo1086f(Object obj, int i, Object obj2);

    /* renamed from: g */
    public abstract void mo1085g(Object obj, Object obj2);

    /* renamed from: h */
    public abstract void mo1084h(Object obj, InterfaceC21048mH2 interfaceC21048mH2);

    /* renamed from: i */
    public final boolean m1083i(Object obj, InterfaceC20523jE2 interfaceC20523jE2) {
        int zzb = interfaceC20523jE2.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo1089c(obj, i, interfaceC20523jE2.zzj());
                                return true;
                            }
                            throw zzjk.zzf();
                        }
                        return false;
                    }
                    Object mo1091a = mo1091a();
                    int i3 = 4 | (i << 3);
                    while (interfaceC20523jE2.zza() != Integer.MAX_VALUE && m1083i(mo1091a, interfaceC20523jE2)) {
                    }
                    if (i3 == interfaceC20523jE2.zzb()) {
                        mo1086f(obj, i, mo1090b(mo1091a));
                        return true;
                    }
                    throw zzjk.zze();
                }
                mo1087e(obj, i, interfaceC20523jE2.zzn());
                return true;
            }
            mo1080l(obj, i, interfaceC20523jE2.zzi());
            return true;
        }
        mo1088d(obj, i, interfaceC20523jE2.zzg());
        return true;
    }

    /* renamed from: j */
    public abstract boolean mo1082j(InterfaceC20523jE2 interfaceC20523jE2);

    /* renamed from: k */
    public abstract Object mo1081k(Object obj);

    /* renamed from: l */
    public abstract void mo1080l(Object obj, int i, long j);

    /* renamed from: m */
    public abstract void mo1079m(Object obj, Object obj2);

    /* renamed from: n */
    public abstract void mo1078n(Object obj, InterfaceC21048mH2 interfaceC21048mH2);

    /* renamed from: o */
    public abstract Object mo1077o(Object obj);

    /* renamed from: p */
    public abstract Object mo1076p(Object obj, Object obj2);

    /* renamed from: q */
    public abstract void mo1075q(Object obj);

    /* renamed from: r */
    public abstract int mo1074r(Object obj);

    /* renamed from: s */
    public abstract int mo1073s(Object obj);
}
