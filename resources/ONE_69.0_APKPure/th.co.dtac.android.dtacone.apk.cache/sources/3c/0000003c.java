package p000;

import com.google.android.gms.internal.vision.zzjf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: AE2 */
/* loaded from: classes3.dex */
public final class AE2 {

    /* renamed from: c */
    public static final AE2 f50c = new AE2();

    /* renamed from: b */
    public final ConcurrentMap f52b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC21273nF2 f51a = new TC2();

    /* renamed from: a */
    public static AE2 m69300a() {
        return f50c;
    }

    /* renamed from: b */
    public final InterfaceC19370cF2 m69299b(Class cls) {
        zzjf.m46404d(cls, "messageType");
        InterfaceC19370cF2 interfaceC19370cF2 = (InterfaceC19370cF2) this.f52b.get(cls);
        if (interfaceC19370cF2 == null) {
            InterfaceC19370cF2 zza = this.f51a.zza(cls);
            zzjf.m46404d(cls, "messageType");
            zzjf.m46404d(zza, "schema");
            InterfaceC19370cF2 interfaceC19370cF22 = (InterfaceC19370cF2) this.f52b.putIfAbsent(cls, zza);
            if (interfaceC19370cF22 != null) {
                return interfaceC19370cF22;
            }
            return zza;
        }
        return interfaceC19370cF2;
    }

    /* renamed from: c */
    public final InterfaceC19370cF2 m69298c(Object obj) {
        return m69299b(obj.getClass());
    }
}