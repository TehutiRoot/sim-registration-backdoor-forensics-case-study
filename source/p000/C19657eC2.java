package p000;

/* renamed from: eC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19657eC2 implements KC2 {

    /* renamed from: a */
    public KC2[] f61436a;

    public C19657eC2(KC2... kc2Arr) {
        this.f61436a = kc2Arr;
    }

    @Override // p000.KC2
    public final boolean zza(Class cls) {
        for (KC2 kc2 : this.f61436a) {
            if (kc2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.KC2
    public final InterfaceC23097yC2 zzb(Class cls) {
        KC2[] kc2Arr;
        String str;
        for (KC2 kc2 : this.f61436a) {
            if (kc2.zza(cls)) {
                return kc2.zzb(cls);
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
