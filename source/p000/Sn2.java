package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6571e;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.nio.charset.Charset;

/* renamed from: Sn2 */
/* loaded from: classes3.dex */
public final class Sn2 implements Yq2 {

    /* renamed from: b */
    public static final Co2 f5701b = new Gn2();

    /* renamed from: a */
    public final Co2 f5702a;

    public Sn2() {
        Co2 co2;
        C18058Mj2 m67299a = C18058Mj2.m67299a();
        try {
            co2 = (Co2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            co2 = f5701b;
        }
        Mn2 mn2 = new Mn2(m67299a, co2);
        Charset charset = zzem.f46969a;
        this.f5702a = mn2;
    }

    /* renamed from: a */
    public static boolean m66283a(InterfaceC22853wo2 interfaceC22853wo2) {
        if (interfaceC22853wo2.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // p000.Yq2
    public final Rq2 zza(Class cls) {
        AbstractC19766er2.m31461d(cls);
        InterfaceC22853wo2 zzb = this.f5702a.zzb(cls);
        if (zzb.zzb()) {
            if (zzed.class.isAssignableFrom(cls)) {
                return C6571e.m46920c(AbstractC19766er2.m31465W(), AbstractC21978rj2.m23277b(), zzb.zza());
            }
            return C6571e.m46920c(AbstractC19766er2.m31466V(), AbstractC21978rj2.m23278a(), zzb.zza());
        } else if (zzed.class.isAssignableFrom(cls)) {
            if (m66283a(zzb)) {
                return C6570d.m46961A(cls, zzb, AbstractC21996rp2.m23262b(), AbstractC21990rn2.m23266d(), AbstractC19766er2.m31465W(), AbstractC21978rj2.m23277b(), AbstractC21993ro2.m23264b());
            }
            return C6570d.m46961A(cls, zzb, AbstractC21996rp2.m23262b(), AbstractC21990rn2.m23266d(), AbstractC19766er2.m31465W(), null, AbstractC21993ro2.m23264b());
        } else if (m66283a(zzb)) {
            return C6570d.m46961A(cls, zzb, AbstractC21996rp2.m23263a(), AbstractC21990rn2.m23267c(), AbstractC19766er2.m31466V(), AbstractC21978rj2.m23278a(), AbstractC21993ro2.m23265a());
        } else {
            return C6570d.m46961A(cls, zzb, AbstractC21996rp2.m23263a(), AbstractC21990rn2.m23267c(), AbstractC19766er2.m31466V(), null, AbstractC21993ro2.m23265a());
        }
    }
}
