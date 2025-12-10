package p000;

import com.google.android.gms.internal.firebase_ml.zzxh;

/* renamed from: VL2 */
/* loaded from: classes3.dex */
public final class VL2 implements InterfaceC22332tM2 {

    /* renamed from: a */
    public static final VL2 f6889a = new VL2();

    /* renamed from: c */
    public static VL2 m66005c() {
        return f6889a;
    }

    @Override // p000.InterfaceC22332tM2
    /* renamed from: a */
    public final boolean mo22697a(Class cls) {
        return zzxh.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC22332tM2
    /* renamed from: b */
    public final InterfaceC21986rM2 mo22696b(Class cls) {
        String str;
        String str2;
        if (!zzxh.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC21986rM2) zzxh.m47435e(cls.asSubclass(zzxh.class)).zza(zzxh.zzg.zzcoy, (Object) null, (Object) null);
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