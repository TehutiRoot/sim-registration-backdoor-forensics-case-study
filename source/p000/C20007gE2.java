package p000;

/* renamed from: gE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20007gE2 implements IE2 {

    /* renamed from: a */
    public final IE2[] f62094a;

    public C20007gE2(IE2... ie2Arr) {
        this.f62094a = ie2Arr;
    }

    @Override // p000.IE2
    public final EE2 zzb(Class cls) {
        IE2[] ie2Arr = this.f62094a;
        for (int i = 0; i < 2; i++) {
            IE2 ie2 = ie2Arr[i];
            if (ie2.zzc(cls)) {
                return ie2.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.IE2
    public final boolean zzc(Class cls) {
        IE2[] ie2Arr = this.f62094a;
        for (int i = 0; i < 2; i++) {
            if (ie2Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
