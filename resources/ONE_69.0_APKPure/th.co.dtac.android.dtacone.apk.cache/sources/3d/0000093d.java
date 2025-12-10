package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;

/* renamed from: Jk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17901Jk2 implements InterfaceC23444zp2 {

    /* renamed from: a */
    public static final C17901Jk2 f3092a = new C17901Jk2();

    /* renamed from: a */
    public static C17901Jk2 m67809a() {
        return f3092a;
    }

    @Override // p000.InterfaceC23444zp2
    public final InterfaceC22406tp2 zzb(Class cls) {
        if (zzed.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC22406tp2) zzed.m46871c(cls.asSubclass(zzed.class)).zzg(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC23444zp2
    public final boolean zzc(Class cls) {
        return zzed.class.isAssignableFrom(cls);
    }
}