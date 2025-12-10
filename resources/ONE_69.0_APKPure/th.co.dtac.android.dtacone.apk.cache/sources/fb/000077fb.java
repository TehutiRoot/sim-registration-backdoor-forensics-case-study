package p000;

/* renamed from: bD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19191bD2 implements HD2 {

    /* renamed from: a */
    public HD2[] f39035a;

    public C19191bD2(HD2... hd2Arr) {
        this.f39035a = hd2Arr;
    }

    @Override // p000.HD2
    public final boolean zza(Class cls) {
        for (HD2 hd2 : this.f39035a) {
            if (hd2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.HD2
    public final InterfaceC22651vD2 zzb(Class cls) {
        HD2[] hd2Arr;
        String str;
        for (HD2 hd2 : this.f39035a) {
            if (hd2.zza(cls)) {
                return hd2.zzb(cls);
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