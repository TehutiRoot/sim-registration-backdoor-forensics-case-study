package p000;

import com.google.android.gms.internal.measurement.zzke;

/* renamed from: AC2 */
/* loaded from: classes3.dex */
public final class AC2 implements FF2 {

    /* renamed from: a */
    public static final AC2 f43a = new AC2();

    /* renamed from: a */
    public static AC2 m69311a() {
        return f43a;
    }

    @Override // p000.FF2
    public final BF2 zzb(Class cls) {
        if (zzke.class.isAssignableFrom(cls)) {
            try {
                return (BF2) zzke.m47163d(cls.asSubclass(zzke.class)).zzl(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.FF2
    public final boolean zzc(Class cls) {
        return zzke.class.isAssignableFrom(cls);
    }
}