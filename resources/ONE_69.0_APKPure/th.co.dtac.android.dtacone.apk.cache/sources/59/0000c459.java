package p000;

/* renamed from: dF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19543dF2 implements FF2 {

    /* renamed from: a */
    public final FF2[] f61157a;

    public C19543dF2(FF2... ff2Arr) {
        this.f61157a = ff2Arr;
    }

    @Override // p000.FF2
    public final BF2 zzb(Class cls) {
        FF2[] ff2Arr = this.f61157a;
        for (int i = 0; i < 2; i++) {
            FF2 ff2 = ff2Arr[i];
            if (ff2.zzc(cls)) {
                return ff2.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.FF2
    public final boolean zzc(Class cls) {
        FF2[] ff2Arr = this.f61157a;
        for (int i = 0; i < 2; i++) {
            if (ff2Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}