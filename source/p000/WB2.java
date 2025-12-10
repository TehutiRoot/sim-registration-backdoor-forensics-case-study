package p000;

import com.google.android.gms.internal.vision.C6616A;
import com.google.android.gms.internal.vision.C6618C;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzkz;

/* renamed from: WB2 */
/* loaded from: classes3.dex */
public final class WB2 implements InterfaceC21727qE2 {

    /* renamed from: b */
    public static final KC2 f7161b = new PB2();

    /* renamed from: a */
    public final KC2 f7162a;

    public WB2() {
        this(new C19657eC2(Jz2.m67653a(), m65652a()));
    }

    /* renamed from: a */
    public static KC2 m65652a() {
        try {
            return (KC2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f7161b;
        }
    }

    /* renamed from: b */
    public static boolean m65651b(InterfaceC23097yC2 interfaceC23097yC2) {
        if (interfaceC23097yC2.zza() == zzkz.zza) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC21727qE2
    public final InterfaceC19835fE2 zza(Class cls) {
        AbstractC21039mE2.m26324m(cls);
        InterfaceC23097yC2 zzb = this.f7162a.zzb(cls);
        if (zzb.zzb()) {
            if (zzjb.class.isAssignableFrom(cls)) {
                return C6618C.m46609f(AbstractC21039mE2.m26365B(), AbstractC21507oy2.m23744a(), zzb.zzc());
            }
            return C6618C.m46609f(AbstractC21039mE2.m26329h(), AbstractC21507oy2.m23743b(), zzb.zzc());
        } else if (zzjb.class.isAssignableFrom(cls)) {
            if (m65651b(zzb)) {
                return C6616A.m46628l(cls, zzb, AbstractC21552pD2.m23719b(), AbstractC19482dB2.m31916d(), AbstractC21039mE2.m26365B(), AbstractC21507oy2.m23744a(), CC2.m68817b());
            }
            return C6616A.m46628l(cls, zzb, AbstractC21552pD2.m23719b(), AbstractC19482dB2.m31916d(), AbstractC21039mE2.m26365B(), null, CC2.m68817b());
        } else if (m65651b(zzb)) {
            return C6616A.m46628l(cls, zzb, AbstractC21552pD2.m23720a(), AbstractC19482dB2.m31917b(), AbstractC21039mE2.m26329h(), AbstractC21507oy2.m23743b(), CC2.m68818a());
        } else {
            return C6616A.m46628l(cls, zzb, AbstractC21552pD2.m23720a(), AbstractC19482dB2.m31917b(), AbstractC21039mE2.m26315v(), null, CC2.m68818a());
        }
    }

    public WB2(KC2 kc2) {
        this.f7162a = (KC2) zzjf.m46419d(kc2, "messageInfoFactory");
    }
}
