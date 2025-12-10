package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: Bp2 */
/* loaded from: classes3.dex */
public final class Bp2 {

    /* renamed from: c */
    public static final Bp2 f538c = new Bp2();

    /* renamed from: b */
    public final ConcurrentMap f540b = new ConcurrentHashMap();

    /* renamed from: a */
    public final Yq2 f539a = new Sn2();

    /* renamed from: a */
    public static Bp2 m68857a() {
        return f538c;
    }

    /* renamed from: b */
    public final Rq2 m68856b(Class cls) {
        zzem.m46870b(cls, "messageType");
        Rq2 rq2 = (Rq2) this.f540b.get(cls);
        if (rq2 == null) {
            rq2 = this.f539a.zza(cls);
            zzem.m46870b(cls, "messageType");
            zzem.m46870b(rq2, "schema");
            Rq2 rq22 = (Rq2) this.f540b.putIfAbsent(cls, rq2);
            if (rq22 != null) {
                return rq22;
            }
        }
        return rq2;
    }
}
