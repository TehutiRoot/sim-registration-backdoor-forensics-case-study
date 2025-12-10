package p000;

import com.google.android.gms.internal.measurement.C6520e;
import com.google.android.gms.internal.measurement.C6521f;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzkm;

/* renamed from: hF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20235hF2 implements BG2 {

    /* renamed from: b */
    public static final FF2 f62434b = new ZE2();

    /* renamed from: a */
    public final FF2 f62435a;

    public C20235hF2() {
        FF2 ff2;
        AC2 m69311a = AC2.m69311a();
        try {
            ff2 = (FF2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            ff2 = f62434b;
        }
        C19543dF2 c19543dF2 = new C19543dF2(m69311a, ff2);
        zzkm.m47160c(c19543dF2, "messageInfoFactory");
        this.f62435a = c19543dF2;
    }

    /* renamed from: a */
    public static boolean m31253a(BF2 bf2) {
        if (bf2.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // p000.BG2
    public final AG2 zza(Class cls) {
        FG2.m68463g(cls);
        BF2 zzb = this.f62435a.zzb(cls);
        if (zzb.zzb()) {
            if (zzke.class.isAssignableFrom(cls)) {
                return C6521f.m47367c(FG2.m68469b(), WB2.m65795b(), zzb.zza());
            }
            return C6521f.m47367c(FG2.m68468b0(), WB2.m65796a(), zzb.zza());
        } else if (zzke.class.isAssignableFrom(cls)) {
            if (m31253a(zzb)) {
                return C6520e.m47371y(cls, zzb, AbstractC19373cG2.m51714b(), FE2.m68498d(), FG2.m68469b(), WB2.m65795b(), AbstractC23003xF2.m588b());
            }
            return C6520e.m47371y(cls, zzb, AbstractC19373cG2.m51714b(), FE2.m68498d(), FG2.m68469b(), null, AbstractC23003xF2.m588b());
        } else if (m31253a(zzb)) {
            return C6520e.m47371y(cls, zzb, AbstractC19373cG2.m51715a(), FE2.m68499c(), FG2.m68468b0(), WB2.m65796a(), AbstractC23003xF2.m589a());
        } else {
            return C6520e.m47371y(cls, zzb, AbstractC19373cG2.m51715a(), FE2.m68499c(), FG2.m68471a(), null, AbstractC23003xF2.m589a());
        }
    }
}