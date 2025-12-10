package p000;

import com.google.android.gms.internal.firebase_ml.zzxh;

/* renamed from: YK2 */
/* loaded from: classes3.dex */
public final class YK2 implements InterfaceC22780wL2 {

    /* renamed from: a */
    public static final YK2 f7743a = new YK2();

    /* renamed from: c */
    public static YK2 m65365c() {
        return f7743a;
    }

    @Override // p000.InterfaceC22780wL2
    /* renamed from: a */
    public final boolean mo862a(Class cls) {
        return zzxh.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC22780wL2
    /* renamed from: b */
    public final InterfaceC22436uL2 mo861b(Class cls) {
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
            return (InterfaceC22436uL2) zzxh.m47426e(cls.asSubclass(zzxh.class)).zza(zzxh.zzg.zzcoy, (Object) null, (Object) null);
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
