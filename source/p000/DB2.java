package p000;

import com.google.android.gms.internal.measurement.zzke;

/* renamed from: DB2 */
/* loaded from: classes3.dex */
public final class DB2 implements IE2 {

    /* renamed from: a */
    public static final DB2 f932a = new DB2();

    /* renamed from: a */
    public static DB2 m68677a() {
        return f932a;
    }

    @Override // p000.IE2
    public final EE2 zzb(Class cls) {
        if (zzke.class.isAssignableFrom(cls)) {
            try {
                return (EE2) zzke.m47154d(cls.asSubclass(zzke.class)).zzl(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.IE2
    public final boolean zzc(Class cls) {
        return zzke.class.isAssignableFrom(cls);
    }
}
