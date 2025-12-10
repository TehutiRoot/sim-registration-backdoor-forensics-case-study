package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6559d;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6560e;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.nio.charset.Charset;

/* renamed from: Po2 */
/* loaded from: classes3.dex */
public final class Po2 implements Vr2 {

    /* renamed from: b */
    public static final InterfaceC23444zp2 f4891b = new Do2();

    /* renamed from: a */
    public final InterfaceC23444zp2 f4892a;

    public Po2() {
        InterfaceC23444zp2 interfaceC23444zp2;
        C17901Jk2 m67809a = C17901Jk2.m67809a();
        try {
            interfaceC23444zp2 = (InterfaceC23444zp2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC23444zp2 = f4891b;
        }
        Jo2 jo2 = new Jo2(m67809a, interfaceC23444zp2);
        Charset charset = zzem.f46981a;
        this.f4892a = jo2;
    }

    /* renamed from: a */
    public static boolean m66911a(InterfaceC22406tp2 interfaceC22406tp2) {
        if (interfaceC22406tp2.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // p000.Vr2
    public final Or2 zza(Class cls) {
        AbstractC19301bs2.m51847d(cls);
        InterfaceC22406tp2 zzb = this.f4892a.zzb(cls);
        if (zzb.zzb()) {
            if (zzed.class.isAssignableFrom(cls)) {
                return C6560e.m46912c(AbstractC19301bs2.m51851W(), AbstractC21526ok2.m26055b(), zzb.zza());
            }
            return C6560e.m46912c(AbstractC19301bs2.m51852V(), AbstractC21526ok2.m26056a(), zzb.zza());
        } else if (zzed.class.isAssignableFrom(cls)) {
            if (m66911a(zzb)) {
                return C6559d.m46953A(cls, zzb, AbstractC21544oq2.m25948b(), AbstractC21538oo2.m25955d(), AbstractC19301bs2.m51851W(), AbstractC21526ok2.m26055b(), AbstractC21541op2.m25953b());
            }
            return C6559d.m46953A(cls, zzb, AbstractC21544oq2.m25948b(), AbstractC21538oo2.m25955d(), AbstractC19301bs2.m51851W(), null, AbstractC21541op2.m25953b());
        } else if (m66911a(zzb)) {
            return C6559d.m46953A(cls, zzb, AbstractC21544oq2.m25949a(), AbstractC21538oo2.m25956c(), AbstractC19301bs2.m51852V(), AbstractC21526ok2.m26056a(), AbstractC21541op2.m25954a());
        } else {
            return C6559d.m46953A(cls, zzb, AbstractC21544oq2.m25949a(), AbstractC21538oo2.m25956c(), AbstractC19301bs2.m51852V(), null, AbstractC21541op2.m25954a());
        }
    }
}