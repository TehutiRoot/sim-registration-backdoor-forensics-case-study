package p000;

/* renamed from: qi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21803qi2 implements InterfaceC19570dj2 {

    /* renamed from: a */
    public InterfaceC19570dj2[] f77044a;

    public C21803qi2(InterfaceC19570dj2... interfaceC19570dj2Arr) {
        this.f77044a = interfaceC19570dj2Arr;
    }

    @Override // p000.InterfaceC19570dj2
    public final boolean zza(Class cls) {
        for (InterfaceC19570dj2 interfaceC19570dj2 : this.f77044a) {
            if (interfaceC19570dj2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC19570dj2
    public final InterfaceC18759Xi2 zzb(Class cls) {
        InterfaceC19570dj2[] interfaceC19570dj2Arr;
        String str;
        for (InterfaceC19570dj2 interfaceC19570dj2 : this.f77044a) {
            if (interfaceC19570dj2.zza(cls)) {
                return interfaceC19570dj2.zzb(cls);
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
