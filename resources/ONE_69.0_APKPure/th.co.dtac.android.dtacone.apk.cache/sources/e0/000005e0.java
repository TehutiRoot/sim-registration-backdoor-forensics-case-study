package p000;

import com.google.android.gms.internal.vision.zzjb;

/* renamed from: GA2 */
/* loaded from: classes3.dex */
public final class GA2 implements HD2 {

    /* renamed from: a */
    public static final GA2 f1902a = new GA2();

    /* renamed from: a */
    public static GA2 m68308a() {
        return f1902a;
    }

    @Override // p000.HD2
    public final boolean zza(Class cls) {
        return zzjb.class.isAssignableFrom(cls);
    }

    @Override // p000.HD2
    public final InterfaceC22651vD2 zzb(Class cls) {
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
            return (InterfaceC22651vD2) zzjb.m46415f(cls.asSubclass(zzjb.class)).zza(zzjb.zzg.zzc, (Object) null, (Object) null);
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