package p000;

import com.google.android.gms.internal.measurement.C6531e;
import com.google.android.gms.internal.measurement.C6532f;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzkm;

/* renamed from: kE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20695kE2 implements EF2 {

    /* renamed from: b */
    public static final IE2 f67849b = new C19319cE2();

    /* renamed from: a */
    public final IE2 f67850a;

    public C20695kE2() {
        IE2 ie2;
        DB2 m68677a = DB2.m68677a();
        try {
            ie2 = (IE2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            ie2 = f67849b;
        }
        C20007gE2 c20007gE2 = new C20007gE2(m68677a, ie2);
        zzkm.m47151c(c20007gE2, "messageInfoFactory");
        this.f67850a = c20007gE2;
    }

    /* renamed from: a */
    public static boolean m28971a(EE2 ee2) {
        if (ee2.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // p000.EF2
    public final DF2 zza(Class cls) {
        IF2.m67950g(cls);
        EE2 zzb = this.f67850a.zzb(cls);
        if (zzb.zzb()) {
            if (zzke.class.isAssignableFrom(cls)) {
                return C6532f.m47358c(IF2.m67956b(), ZA2.m65261b(), zzb.zza());
            }
            return C6532f.m47358c(IF2.m67955b0(), ZA2.m65262a(), zzb.zza());
        } else if (zzke.class.isAssignableFrom(cls)) {
            if (m28971a(zzb)) {
                return C6531e.m47362y(cls, zzb, AbstractC19838fF2.m31329b(), ID2.m67986d(), IF2.m67956b(), ZA2.m65261b(), AE2.m69130b());
            }
            return C6531e.m47362y(cls, zzb, AbstractC19838fF2.m31329b(), ID2.m67986d(), IF2.m67956b(), null, AE2.m69130b());
        } else if (m28971a(zzb)) {
            return C6531e.m47362y(cls, zzb, AbstractC19838fF2.m31330a(), ID2.m67987c(), IF2.m67955b0(), ZA2.m65262a(), AE2.m69131a());
        } else {
            return C6531e.m47362y(cls, zzb, AbstractC19838fF2.m31330a(), ID2.m67987c(), IF2.m67958a(), null, AE2.m69131a());
        }
    }
}
