package p000;

import com.google.android.gms.internal.clearcut.zzcg;

/* renamed from: Wg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18734Wg2 implements InterfaceC19099ak2 {

    /* renamed from: a */
    public static final C18734Wg2 f7348a = new C18734Wg2();

    /* renamed from: a */
    public static C18734Wg2 m65682a() {
        return f7348a;
    }

    @Override // p000.InterfaceC19099ak2
    public final boolean zza(Class cls) {
        return zzcg.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC19099ak2
    public final InterfaceC18613Uj2 zzb(Class cls) {
        String str;
        String str2;
        if (!zzcg.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unsupported message type: ".concat(name);
            } else {
                str2 = new String("Unsupported message type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        try {
            return (InterfaceC18613Uj2) zzcg.m48160e(cls.asSubclass(zzcg.class)).zza(zzcg.zzg.zzkf, (Object) null, (Object) null);
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