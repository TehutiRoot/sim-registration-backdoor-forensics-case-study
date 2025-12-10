package p000;

import com.google.android.gms.internal.vision.zzjb;

/* renamed from: Jz2 */
/* loaded from: classes3.dex */
public final class Jz2 implements KC2 {

    /* renamed from: a */
    public static final Jz2 f3083a = new Jz2();

    /* renamed from: a */
    public static Jz2 m67653a() {
        return f3083a;
    }

    @Override // p000.KC2
    public final boolean zza(Class cls) {
        return zzjb.class.isAssignableFrom(cls);
    }

    @Override // p000.KC2
    public final InterfaceC23097yC2 zzb(Class cls) {
        String str;
        String str2;
        if (!zzjb.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC23097yC2) zzjb.m46430f(cls.asSubclass(zzjb.class)).zza(zzjb.zzg.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to get message info for ".concat(name2);
            } else {
                str = new String("Unable to get message info for ");
            }
            throw new RuntimeException(str, e);
        }
    }
}
