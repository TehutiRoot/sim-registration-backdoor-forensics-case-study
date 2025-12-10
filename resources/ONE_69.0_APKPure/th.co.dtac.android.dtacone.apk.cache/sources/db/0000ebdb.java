package p000;

/* renamed from: nj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21350nj2 implements InterfaceC19099ak2 {

    /* renamed from: a */
    public InterfaceC19099ak2[] f72552a;

    public C21350nj2(InterfaceC19099ak2... interfaceC19099ak2Arr) {
        this.f72552a = interfaceC19099ak2Arr;
    }

    @Override // p000.InterfaceC19099ak2
    public final boolean zza(Class cls) {
        for (InterfaceC19099ak2 interfaceC19099ak2 : this.f72552a) {
            if (interfaceC19099ak2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC19099ak2
    public final InterfaceC18613Uj2 zzb(Class cls) {
        InterfaceC19099ak2[] interfaceC19099ak2Arr;
        String str;
        for (InterfaceC19099ak2 interfaceC19099ak2 : this.f72552a) {
            if (interfaceC19099ak2.zza(cls)) {
                return interfaceC19099ak2.zzb(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}