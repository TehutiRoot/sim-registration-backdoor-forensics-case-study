package p000;

import com.google.android.gms.internal.measurement.zzkm;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: nF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21214nF2 {

    /* renamed from: c */
    public static final C21214nF2 f72170c = new C21214nF2();

    /* renamed from: b */
    public final ConcurrentMap f72172b = new ConcurrentHashMap();

    /* renamed from: a */
    public final EF2 f72171a = new C20695kE2();

    /* renamed from: a */
    public static C21214nF2 m26147a() {
        return f72170c;
    }

    /* renamed from: b */
    public final DF2 m26146b(Class cls) {
        zzkm.m47151c(cls, "messageType");
        DF2 df2 = (DF2) this.f72172b.get(cls);
        if (df2 == null) {
            df2 = this.f72171a.zza(cls);
            zzkm.m47151c(cls, "messageType");
            zzkm.m47151c(df2, "schema");
            DF2 df22 = (DF2) this.f72172b.putIfAbsent(cls, df2);
            if (df22 != null) {
                return df22;
            }
        }
        return df2;
    }
}
