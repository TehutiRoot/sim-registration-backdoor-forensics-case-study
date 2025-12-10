package p000;

/* renamed from: Jo2 */
/* loaded from: classes3.dex */
public final class Jo2 implements InterfaceC23444zp2 {

    /* renamed from: a */
    public final InterfaceC23444zp2[] f3115a;

    public Jo2(InterfaceC23444zp2... interfaceC23444zp2Arr) {
        this.f3115a = interfaceC23444zp2Arr;
    }

    @Override // p000.InterfaceC23444zp2
    public final InterfaceC22406tp2 zzb(Class cls) {
        InterfaceC23444zp2[] interfaceC23444zp2Arr = this.f3115a;
        for (int i = 0; i < 2; i++) {
            InterfaceC23444zp2 interfaceC23444zp2 = interfaceC23444zp2Arr[i];
            if (interfaceC23444zp2.zzc(cls)) {
                return interfaceC23444zp2.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC23444zp2
    public final boolean zzc(Class cls) {
        InterfaceC23444zp2[] interfaceC23444zp2Arr = this.f3115a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC23444zp2Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}