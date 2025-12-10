package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;

/* renamed from: Mj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18058Mj2 implements Co2 {

    /* renamed from: a */
    public static final C18058Mj2 f3861a = new C18058Mj2();

    /* renamed from: a */
    public static C18058Mj2 m67299a() {
        return f3861a;
    }

    @Override // p000.Co2
    public final InterfaceC22853wo2 zzb(Class cls) {
        if (zzed.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC22853wo2) zzed.m46879c(cls.asSubclass(zzed.class)).zzg(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.Co2
    public final boolean zzc(Class cls) {
        return zzed.class.isAssignableFrom(cls);
    }
}
