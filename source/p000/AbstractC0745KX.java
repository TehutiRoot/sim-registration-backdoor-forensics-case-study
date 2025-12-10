package p000;

/* renamed from: KX */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0745KX {
    /* renamed from: a */
    public static /* synthetic */ long m67609a(long j, long j2) {
        long j3 = j / j2;
        if (j - (j2 * j3) == 0) {
            return j3;
        }
        if ((((j ^ j2) >> 63) | 1) < 0) {
            return j3 - 1;
        }
        return j3;
    }
}
