package p000;

/* renamed from: LX */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0809LX {
    /* renamed from: a */
    public static /* synthetic */ long m67510a(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        if ((((j ^ j2) >> 63) | 1) <= 0) {
            return j3 + j2;
        }
        return j3;
    }
}
