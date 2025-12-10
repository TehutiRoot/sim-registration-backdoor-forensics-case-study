package p000;

/* renamed from: OX1 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class OX1 {
    /* renamed from: a */
    public static /* synthetic */ long m67108a(long j, long j2) {
        if (j2 < 0) {
            if ((j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                i = 0;
            }
            return j3 + i;
        }
    }
}