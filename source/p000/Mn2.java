package p000;

/* renamed from: Mn2 */
/* loaded from: classes3.dex */
public final class Mn2 implements Co2 {

    /* renamed from: a */
    public final Co2[] f3896a;

    public Mn2(Co2... co2Arr) {
        this.f3896a = co2Arr;
    }

    @Override // p000.Co2
    public final InterfaceC22853wo2 zzb(Class cls) {
        Co2[] co2Arr = this.f3896a;
        for (int i = 0; i < 2; i++) {
            Co2 co2 = co2Arr[i];
            if (co2.zzc(cls)) {
                return co2.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.Co2
    public final boolean zzc(Class cls) {
        Co2[] co2Arr = this.f3896a;
        for (int i = 0; i < 2; i++) {
            if (co2Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
